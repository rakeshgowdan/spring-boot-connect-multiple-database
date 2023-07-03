package com.rakesh.application.model.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rakesh.application.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
