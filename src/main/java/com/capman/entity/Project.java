package com.capman.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.*;

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
	
	
	
	public Set<EmployeeProjectPeriod> getEpp() {
		return epp;
	}
	public void setEpp(Set<EmployeeProjectPeriod> epp) {
		this.epp = epp;
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
