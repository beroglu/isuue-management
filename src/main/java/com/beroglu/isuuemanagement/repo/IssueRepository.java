package com.beroglu.isuuemanagement.repo;

import com.beroglu.isuuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository <Issue,Long> {



}

