package com.beroglu.isuuemanagement.service;

import com.beroglu.isuuemanagement.dto.IssueDto;
import com.beroglu.isuuemanagement.entity.Issue;
import com.beroglu.isuuemanagement.util.TPage;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issue);
    IssueDto getById(Long id);
    TPage<IssueDto> getAllPageable(Pageable pageable);
    Boolean Delete(IssueDto issue);


}
