package com.beroglu.isuuemanagement.repo;

import com.beroglu.isuuemanagement.entity.Issue;
import com.beroglu.isuuemanagement.entity.Project;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository <Project,Long> {

    //projectcode  göre veritabanında bir select işlemi yapıyor
    List<Project> getAllByProjectCode(String projectCode );
    List<Project> getAllByProjectCodeAndIdNotNull(String projectCode);
    List<Project> getAllByProjectCodeAndProjectNameContains(String projectCode, String name);
    //repository leri singleton bir instance olarak kullanıyoruz project scope unda
    // bunun için @Repository konulabilir ama jparepository den türetildiği için gerek kalmıyor

    Page<Project> findAll(Pageable pageable);
    List<Project> findAll(Sort sort);
    Project getByProjectCode(String projectCode);
    Optional<Project> findByProjectCode(String projectCode);
}

