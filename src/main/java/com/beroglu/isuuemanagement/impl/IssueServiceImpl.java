package com.beroglu.isuuemanagement.impl;

import com.beroglu.isuuemanagement.dto.IssueDto;
import com.beroglu.isuuemanagement.entity.Issue;
import com.beroglu.isuuemanagement.repo.IssueRepository;
import com.beroglu.isuuemanagement.service.IssueService;
import com.beroglu.isuuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class  IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }


    //issue tipinde bir instance in datasını isuue tipinde bir classın
    //instance ına koyup geri veriyor

    @Override
    public IssueDto save(IssueDto issue) {
        if(issue.getDate()==null){
            throw new IllegalArgumentException("issue date cannot be null");
        }
        Issue issueDb= modelMapper.map(issue, Issue.class);
        issueDb= issueRepository.save(issueDb);
        return modelMapper.map(issueDb,IssueDto.class);

    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
      Page <Issue> data= issueRepository.findAll(pageable);
      TPage tpage=new  TPage<IssueDto>();
      IssueDto[] dtos=modelMapper.map(data.getContent(),IssueDto[].class);
      tpage.setStat(data,Arrays.asList(dtos));
      return tpage;
    }

    @Override
    public Boolean Delete(IssueDto issue)
    {
        Issue issueDb= modelMapper.map(issue, Issue.class);
        issueRepository.delete(issueDb);
        return Boolean.TRUE;
    }
}
