package com.demo30.dao;

import com.demo30.model.Project;

import java.util.List;

public interface ProjectDAO {
    void createProject(Project project);
    List<Project> getAllProjects();
    Project getProjectById(Long id);
    void updateProject(Project project);
    void deleteProject(Project project);
}
