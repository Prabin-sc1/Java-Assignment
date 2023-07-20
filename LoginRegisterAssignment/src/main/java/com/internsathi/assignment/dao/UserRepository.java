package com.internsathi.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.internsathi.assignment.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
