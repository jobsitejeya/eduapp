package com.edu.app.domain;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="edu_teacher") 
public class EduTeacher extends BaseEntity{
	
	private Integer  qualification; 
	private String  experience;
	private Integer maxHrsForWeek;
	private Date doj;
	private Date dol;
	private Float salary;
	
	private int assignedHrs;
	
	private int noOfDays;
	
	private Set<EduTeacherDays> eduTeacherDays=new HashSet<EduTeacherDays>();
	
	private EduUser eduUser;
	
	
	
	/**
	 * @return the qualification
	 */
	@Column(name="qualification", unique=false, nullable=true, insertable=true, updatable=true,length=2)
	public Integer getQualification() {
		return qualification;
	}
	/**
	 * @param quaification the qualification to set
	 */
	public void setQualification(Integer qualification) {
		this.qualification = qualification;
	}
	/**
	 * @return the experience
	 */
	@Column(name="experience", unique=false, nullable=true, insertable=true, updatable=true,length=5)
	public String getExperience() {
		return experience;
	}
	/**
	 * @param experiance the experience to set
	 */
	public void setExperience(String experience) {
		this.experience = experience;
	}
	/**
	 * @return the eduUser
	 */
	@OneToOne(cascade={CascadeType.ALL},
            fetch=FetchType.LAZY)

    @JoinColumn(name="fk_edu_user_pk_id", unique=false, nullable=true, insertable=true, updatable=true)
	public EduUser getEduUser() {
		return eduUser;
	}
	/**
	 * @param eduUser the eduUser to set
	 */
	public void setEduUser(EduUser eduUser) {
		this.eduUser = eduUser;
	}
	/**
	 * @return the maxHrsForWeek
	 */
	@Column(name="max_hrs_week", unique=false, nullable=true, insertable=true, updatable=true)
	public Integer getMaxHrsForWeek() {
		return maxHrsForWeek;
	}
	/**
	 * @param maxHrsForWeek the maxHrsForWeek to set
	 */
	public void setMaxHrsForWeek(Integer maxHrsForWeek) {
		this.maxHrsForWeek = maxHrsForWeek;
	}
	/**
	 * @return the doj
	 */
	@Column(name="doj", unique=false, nullable=true, insertable=true, updatable=true)
	public Date getDoj() {
		return doj;
	}
	/**
	 * @param doj the doj to set
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	/**
	 * @return the dol
	 */
	@Column(name="dol", unique=false, nullable=true, insertable=true, updatable=true)
	public Date getDol() {
		return dol;
	}
	/**
	 * @param dol the dol to set
	 */
	public void setDol(Date dol) {
		this.dol = dol;
	}
	/**
	 * @return the salary
	 */
	@Column(name="salary", unique=false, nullable=true, insertable=true, updatable=true)
	public Float getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	/**
	 * @return the assignedHrs
	 */
	@Column(name="assigned_hrs", unique=false, nullable=false, insertable=true, updatable=true,length=2)
	public int getAssignedHrs() {
		return assignedHrs;
	}
	/**
	 * @param assignedHrs the assignedHrs to set
	 */
	public void setAssignedHrs(int assignedHrs) {
		this.assignedHrs = assignedHrs;
	}
	/**
	 * @return the noOfDays
	 */
	@Column(name="noOfDays", unique=false, nullable=false, insertable=true, updatable=true,length=2)
	public int getNoOfDays() {
		return noOfDays;
	}
	/**
	 * @param noOfDays the noOfDays to set
	 */
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	/**
	 * @return the eduTeacherDays
	 */
	 @OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.EAGER)
	public Set<EduTeacherDays> getEduTeacherDays() {
		return eduTeacherDays;
	}
	/**
	 * @param eduTeacherDays the eduTeacherDays to set
	 */
	public void setEduTeacherDays(Set<EduTeacherDays> eduTeacherDays) {
		this.eduTeacherDays = eduTeacherDays;
	}
	

}
