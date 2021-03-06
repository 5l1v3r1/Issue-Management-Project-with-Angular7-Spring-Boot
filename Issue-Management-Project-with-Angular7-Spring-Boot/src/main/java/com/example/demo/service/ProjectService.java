package com.example.demo.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.example.demo.Dto.ProjectDto;
import com.example.demo.entity.Issue;
import com.example.demo.entity.Project;
import com.example.demo.entity.User;
import com.example.demo.util.TPage;

public interface ProjectService {

	List<ProjectDto> getAll();
	
	ProjectDto save(ProjectDto project);
	
	ProjectDto getById(Long id);

    TPage<ProjectDto> getAllPageable(Pageable pageable);
    
    ProjectDto getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Boolean delete(Project project);

    Boolean delete(Long id) ;
    
    ProjectDto update(Long id, ProjectDto project);
}
