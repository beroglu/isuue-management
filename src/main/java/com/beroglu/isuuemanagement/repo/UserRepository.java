package com.beroglu.isuuemanagement.repo;

import com.beroglu.isuuemanagement.entity.Issue;
import com.beroglu.isuuemanagement.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository <User,Long> {
    User findByUsername(String username);
}

