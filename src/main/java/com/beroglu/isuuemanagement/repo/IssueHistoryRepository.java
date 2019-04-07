package com.beroglu.isuuemanagement.repo;

import com.beroglu.isuuemanagement.entity.Issue;
import com.beroglu.isuuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository <IssueHistory,Long> {



}

