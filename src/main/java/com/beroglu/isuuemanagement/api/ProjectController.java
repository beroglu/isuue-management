package com.beroglu.isuuemanagement.api;

import com.beroglu.isuuemanagement.dto.ProjectDto;
import com.beroglu.isuuemanagement.impl.ProjectServiceImpl;
import javax.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {
  private final ProjectServiceImpl projectServiceImpl;

  public ProjectController(ProjectServiceImpl projectServiceImpl) {
    this.projectServiceImpl = projectServiceImpl;
  }

  @GetMapping("/{id}")
  public ResponseEntity<ProjectDto> getById(@PathVariable("id") Long id){
    ProjectDto projectDto= projectServiceImpl.getById(id);
    return ResponseEntity.ok(projectDto);

  }
  @PostMapping()
  public ResponseEntity<ProjectDto> createProject(@Valid @RequestBody ProjectDto project){
    return ResponseEntity.ok(projectServiceImpl.save(project));
  }

  /*@PutMapping()
  public ResponseEntity<ProjectDto> updateProject(@PathVariable("id") Long id, @Valid @RequestBody ProjectDto project){

  }*/



}
