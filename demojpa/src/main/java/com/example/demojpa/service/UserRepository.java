package com.example.demojpa.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demojpa.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
