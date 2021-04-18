package com.itday.springitday.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itday.springitday.Bean.User;

public interface UserRepository extends JpaRepository<User, Long> {

	 User findByUsername(String username);
}
