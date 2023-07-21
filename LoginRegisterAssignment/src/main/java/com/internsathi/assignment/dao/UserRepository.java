package com.internsathi.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.internsathi.assignment.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	boolean existsByEmail(String email);

	User findByEmail(String email);

	@Query("select u from User u where u.email = :email")
	public User getUserByUserName(@Param("email") String email);

}
