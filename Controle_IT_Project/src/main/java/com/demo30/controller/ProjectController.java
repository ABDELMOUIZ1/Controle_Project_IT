package com.demo30.controller;
import com.demo30.model.Employee;
import com.demo30.model.Project;
import com.demo30.dao.EmployeeDAO;
import com.demo30.dao.ProjectDAO;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ManagedProperty;
import jakarta.faces.bean.RequestScoped;

import java.util.List;

@ManagedBean
@RequestScoped
public class ProjectController {
    @ManagedProperty("#{projectDAO}")
    private ProjectDAO projectDAO; // Inject ProjectDAO implementation

    @ManagedProperty("#{employeeDAO}")
    private EmployeeDAO employeeDAO; // Inject EmployeeDAO implementation

    private Project project = new Project();
    private List<Project> projects;
    private List<Employee> employees;

    private Employee selectedEmployee;
    private Project selectedProject;

    public ProjectDAO getProjectDAO() {
        return projectDAO;
    }

    public EmployeeDAO getEmployeeDAO() {
        return employeeDAO;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setProjectDAO(ProjectDAO projectDAO) {
        this.projectDAO = projectDAO;
    }

    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public Employee getSelectedEmployee() {
        return selectedEmployee;
    }

    public void setSelectedEmployee(Employee selectedEmployee) {
        this.selectedEmployee = selectedEmployee;
    }

    public Project getSelectedProject() {
        return selectedProject;
    }

    public void setSelectedProject(Project selectedProject) {
        this.selectedProject = selectedProject;
    }

    public String saveProject() {
        projectDAO.createProject(project);
        return "project-list?faces-redirect=true"; // Redirect to project list page
    }

    public void loadProjects() {
        projects = projectDAO.getAllProjects();
    }

    public void loadEmployees() {
        employees = employeeDAO.getAllEmployees();
    }

    public void assignProject() {
        // Add logic to assign selectedProject to selectedEmployee
    }

    // Other methods for project CRUD operations
}
