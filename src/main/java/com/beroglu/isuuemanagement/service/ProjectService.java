package com.beroglu.isuuemanagement.service;

import com.beroglu.isuuemanagement.dto.ProjectDto;
import com.beroglu.isuuemanagement.entity.Project;
import com.beroglu.isuuemanagement.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {

    ProjectDto save(ProjectDto project);
    ProjectDto getById(Long id);
    ProjectDto getByProjectCode(String projectCode);
    List<Project> getByProjectCodeContains(String projectCode);
    Page <Project> getAllPageable(Pageable pageable);
    Boolean delete(Project project);

}
