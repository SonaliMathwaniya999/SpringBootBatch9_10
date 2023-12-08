package com.web.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.entity.UserInfo;

public interface UserRepository extends JpaRepository<UserInfo, Integer> {

	Optional<UserInfo>  findByName(String username);
 }
