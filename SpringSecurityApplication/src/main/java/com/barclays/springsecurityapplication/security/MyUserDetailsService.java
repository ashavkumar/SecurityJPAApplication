package com.barclays.springsecurityapplication.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.barclays.springsecurityapplication.beans.User;
import com.barclays.springsecurityapplication.dao.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user=userRepository.findByUserName(username);
		System.out.println(user.toString());
		user.orElseThrow(()->new UsernameNotFoundException("not found"+username));
		return user.map(MyUserDetails::new).get();
	}
}
