package com.demo30.model;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity()
@Table(name="project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double budget;

    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees = new HashSet<>();

    public Project() {
    }

    public Project(String name, double budget, Set<Employee> employees) {
        this.name = name;
        this.budget = budget;
        this.employees = employees;
    }

    public Project(Long id, String name, double budget, Set<Employee> employees) {
        this.id = id;
        this.name = name;
        this.budget = budget;
        this.employees = employees;
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

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
