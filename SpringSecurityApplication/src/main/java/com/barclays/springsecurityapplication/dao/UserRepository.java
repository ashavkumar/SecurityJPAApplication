package com.barclays.springsecurityapplication.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.barclays.springsecurityapplication.beans.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	@Query(value="SELECT * FROM user WHERE USERNAME=?1",nativeQuery=true)
	public Optional<User> findByUserName(String username);
}
