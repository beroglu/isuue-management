package com.beroglu.isuuemanagement.impl;

import com.beroglu.isuuemanagement.dto.ProjectDto;
import com.beroglu.isuuemanagement.entity.Project;
import com.beroglu.isuuemanagement.repo.ProjectRepository;
import com.beroglu.isuuemanagement.service.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectServiceImpl  implements ProjectService {

    private final ProjectRepository projectRepository;
    private final ModelMapper modelMapper;

    public ProjectServiceImpl(ProjectRepository projectRepository,
        ModelMapper modelMapper) {
           this.projectRepository = projectRepository;

        this.modelMapper = modelMapper;
    }

    @Override
    public ProjectDto save(ProjectDto project) {
        //aynı kodla birden fazla proje kaydedilmesin kontrolü yapılsın
       if(projectRepository.findByProjectCode(project.getProjectCode()).isPresent()){
         throw new IllegalArgumentException("project code already exist");
       }else {
         Project projectDb = modelMapper.map(project, Project.class);
         projectDb = projectRepository.save(projectDb);
         project.setId(projectDb.getId());
         return modelMapper.map(projectDb, ProjectDto.class);
         //return project;//????
       }

    }

    @Override
    public ProjectDto getById(Long id) {
        Project p=projectRepository.getOne(id);
        return  modelMapper.map(p,ProjectDto.class);
    }

    //aynı kodla birden fazla proje kaydedilmesin kontrolü yapılsın
    @Override
    public ProjectDto getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public List<Project> getByProjectCodeContains(String projectCode) {
        return null;
    }

    @Override
    public Page<Project> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public Boolean delete(Project project) {
        return null;
    }
}
