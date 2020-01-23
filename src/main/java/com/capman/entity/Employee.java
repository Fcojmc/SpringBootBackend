package com.capman.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;





@Entity(name = "employee")
@Table(name = "employees")
public class Employee {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "hire_date")
	LocalDate hireDate;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@MapsId("id")
	@JoinColumn(name = "id", nullable = false)
	User user;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employee")
	private Set<Absence> absences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employee")
	private Set<EmployeeProjectPeriod> epp;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(
			name = "employees_projects",
			joinColumns = @JoinColumn(name = "employee_id"),
			inverseJoinColumns = @JoinColumn (name= "project_id")
			)
	Set<Project> projectsEmployees;

	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	 

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
}
