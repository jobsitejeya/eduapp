package com.edu.app.domain;

// Generated Jul 5, 2008 9:25:16 PM by Hibernate Tools 3.1.0.beta5

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EduInstClassSubject generated by hbm2java
 */
@Entity
@Table(name = "edu_inst_class_subject")
public class EduInstClassSubject extends BaseSubject {

	// Fields

	private EduInstitutionClass eduInstitutionClass;
	private EduSubject eduSubject;
	

	// Constructors

	/** default constructor */
	public EduInstClassSubject() {
	}

	// Property accessors

	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "Fk_Institution_Class_Id", unique = false, nullable = false, insertable = true, updatable = true)
	public EduInstitutionClass getEduInstitutionClass() {
		return this.eduInstitutionClass;
	}

	public void setEduInstitutionClass(EduInstitutionClass eduInstitutionClass) {
		this.eduInstitutionClass = eduInstitutionClass;
	}

	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "Fk_Subject_Id", unique = false, nullable = false, insertable = true, updatable = true)
	public EduSubject getEduSubject() {
		return this.eduSubject;
	}

	public void setEduSubject(EduSubject eduSubject) {
		this.eduSubject = eduSubject;
	}

	

	
	

}