package com.edu.app.domain;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="edu_period")
public class EduPeriod extends BaseEntity {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int name;

	private Time time;

	
	/*private int sectionId;

	
	private int subjectId;*/
	
	private int day;
	
	 private EduInstClassSubject eduInstClassSubject;
	 
	 private EduInstBranchSubject eduInstBranchSubject;
	 
	 private EduInstClassSection eduInstClassSection;
	 
	 private EduInstBranchSection eduInstBranchSection;
	 
	 private EduTeacher eduTeacher;
	 
	 private EduInstitutionClass eduInstitutionClass;


	public EduPeriod() {
		super();
	}


	public int getName() {
		return this.name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public Time getTime() {
		return this.time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "Fk_Institution_Class_Id", unique = false, nullable = false, insertable = true, updatable = true)
	public EduInstitutionClass getEduInstitutionClass() {
		return this.eduInstitutionClass;
	}

	public void setEduInstitutionClass(EduInstitutionClass eduInstitutionClass) {
		this.eduInstitutionClass = eduInstitutionClass;
	}

	
	
	
	
	/**
	 * @return the eduInstClassSubject
	 */
	@ManyToOne(cascade={},
            fetch=FetchType.LAZY)

    @JoinColumn(name="fk_edu_inst_class_subject_id", unique=false, nullable=false, insertable=true, updatable=true)
	public EduInstClassSubject getEduInstClassSubject() {
		return eduInstClassSubject;
	}

	/**
	 * @param eduInstClassSubject the eduInstClassSubject to set
	 */
	public void setEduInstClassSubject(EduInstClassSubject eduInstClassSubject) {
		this.eduInstClassSubject = eduInstClassSubject;
	}

	/**
	 * @return the eduInstBranchSubject
	 */
	@ManyToOne(cascade={},
            fetch=FetchType.LAZY)

    @JoinColumn(name="fk_edu_inst_branch_subject_id", unique=false, nullable=true, insertable=true, updatable=true)
	public EduInstBranchSubject getEduInstBranchSubject() {
		return eduInstBranchSubject;
	}

	/**
	 * @param eduInstBranchSubject the eduInstBranchSubject to set
	 */
	public void setEduInstBranchSubject(EduInstBranchSubject eduInstBranchSubject) {
		this.eduInstBranchSubject = eduInstBranchSubject;
	}


	/**
	 * @return the eduInstClassSection
	 */
	 @ManyToOne(cascade={},
	            fetch=FetchType.LAZY)

	    @JoinColumn(name="fk_edu_inst_class_section_id", unique=false, nullable=true, insertable=true, updatable=true)
	public EduInstClassSection getEduInstClassSection() {
		return eduInstClassSection;
	}


	/**
	 * @param eduInstClassSection the eduInstClassSection to set
	 */
	public void setEduInstClassSection(EduInstClassSection eduInstClassSection) {
		this.eduInstClassSection = eduInstClassSection;
	}


	/**
	 * @return the eduInstBranchSection
	 */
	@ManyToOne(cascade={},
            fetch=FetchType.LAZY)

    @JoinColumn(name="fk_edu_inst_branch_section_id", unique=false, nullable=true, insertable=true, updatable=true)
	public EduInstBranchSection getEduInstBranchSection() {
		return eduInstBranchSection;
	}


	/**
	 * @param eduInstBranchSection the eduInstBranchSection to set
	 */
	public void setEduInstBranchSection(EduInstBranchSection eduInstBranchSection) {
		this.eduInstBranchSection = eduInstBranchSection;
	}


	/**
	 * @return the day
	 */
	@Column(name="day")
	public Integer getDay() {
		return day;
	}


	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}


	/**
	 * @return the eduTeacher
	 */
	@ManyToOne(cascade={},
            fetch=FetchType.EAGER)

    @JoinColumn(name="fk_teacher_id", unique=false, nullable=false, insertable=true, updatable=true)
	public EduTeacher getEduTeacher() {
		return eduTeacher;
	}


	/**
	 * @param eduTeacher the eduTeacher to set
	 */
	public void setEduTeacher(EduTeacher eduTeacher) {
		this.eduTeacher = eduTeacher;
	}
}
