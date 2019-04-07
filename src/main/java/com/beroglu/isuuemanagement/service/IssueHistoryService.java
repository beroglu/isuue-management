package com.beroglu.isuuemanagement.service;

import com.beroglu.isuuemanagement.entity.Issue;
import com.beroglu.isuuemanagement.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueHistoryService {

    IssueHistory save(IssueHistory issueHistory);
    IssueHistory getById(Long id);
    Page <IssueHistory> getAllPageable(Pageable pageable);
    Boolean Delete(IssueHistory issueHistory);

}
