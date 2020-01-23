package com.capman.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity(name = "project")
@Table(name = "projects")
public class Project {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "start_date")
	LocalDate startDate;
	@Column(name = "end_date")
	LocalDate endDate;
	
	@OneToMany(mappedBy = "project")
	private Set<EmployeeProjectPeriod> epp;
	
	@JsonIgnore
	@ManyToMany(mappedBy="projectsEmployees")
	Set<Employee>employees;
	
	@ManyToMany
	@JoinTable(
			name = "projects_skills",
			joinColumns = @JoinColumn(name = "project_id"),
			inverseJoinColumns = @JoinColumn (name= "skill_id")
			)
	Set<Skill> projectSkills;
	
	
	public Set<Skill> getProjectSkills() {
		return projectSkills;
	}
	public void setProjectSkills(Set<Skill> projectSkills) {
		this.projectSkills = projectSkills;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
}
