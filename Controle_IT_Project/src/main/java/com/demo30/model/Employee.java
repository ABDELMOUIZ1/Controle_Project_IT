package com.demo30.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity()
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    private Set<Post> skills = new HashSet<>();

    @ManyToMany
    @JoinTable(name = "project_employee",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    private Set<Project> projects = new HashSet<>();

    public Employee() {
    }

    public Employee(String name, String email, Set<Post> skills, Set<Project> projects) {
        this.name = name;
        this.email = email;
        this.skills = skills;
        this.projects = projects;
    }

    public Employee(Long id, String name, String email, Set<Post> skills, Set<Project> projects) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.skills = skills;
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Post> getSkills() {
        return skills;
    }

    public void setSkills(Set<Post> skills) {
        this.skills = skills;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
