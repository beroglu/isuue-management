package com.beroglu.isuuemanagement.repo;

import com.beroglu.isuuemanagement.entity.Issue;
import com.beroglu.isuuemanagement.entity.IssueStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueStatusRepository extends JpaRepository <IssueStatus,Long> {



}

