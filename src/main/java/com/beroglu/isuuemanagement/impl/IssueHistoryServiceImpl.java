package com.beroglu.isuuemanagement.impl;

import com.beroglu.isuuemanagement.entity.IssueHistory;
import com.beroglu.isuuemanagement.repo.IssueHistoryRepository;
import com.beroglu.isuuemanagement.service.IssueHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IssueHistoryServiceImpl implements IssueHistoryService {

    private final IssueHistoryRepository ıssueHistoryRepository;

    public IssueHistoryServiceImpl(IssueHistoryRepository ıssueHistoryRepository) {
        this.ıssueHistoryRepository = ıssueHistoryRepository;
    }

    @Override
    public IssueHistory save(IssueHistory issueHistory) {
        if (issueHistory.getDate()==null){
            throw  new IllegalArgumentException("Issue cannot be null");
        }
        return ıssueHistoryRepository.save(issueHistory);
    }

    @Override
    public IssueHistory getById(Long id) {
        return ıssueHistoryRepository.getOne(id);
    }

    @Override
    public Page<IssueHistory> getAllPageable(Pageable pageable) {
        return ıssueHistoryRepository.findAll(pageable);
    }

    @Override
    public Boolean Delete(IssueHistory issueHistory) {
         ıssueHistoryRepository.delete(issueHistory);
         return Boolean.TRUE;
    }
}
