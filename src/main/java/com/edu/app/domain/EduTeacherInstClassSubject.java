package com.edu.app.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="edu_teacher_sub")
public class EduTeacherInstClassSubject extends BaseEntity{

	private EduTeacher eduTeacher;
	private EduInstClassSection eduInstClassSection;
	
	private EduInstitutionClass eduInstitutionClass;
	
	private EduInstClassSubject eduInstClassSubject;
	/**
	 * @return the eduTeacher
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.EAGER)
	@JoinColumn(name = "Fk_Teacher_Pk_Id", unique = false, nullable = false, insertable = true, updatable = true)
	public EduTeacher getEduTeacher() {
		return eduTeacher;
	}
	/**
	 * @param eduTeacher the eduTeacher to set
	 */
	public void setEduTeacher(EduTeacher eduTeacher) {
		this.eduTeacher = eduTeacher;
	}

	
	/**
	 * @return the eduInstClassSection
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "Fk_inst_class_sec_Id", unique = false, nullable = false, insertable = true, updatable = true)
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
	 * @return the eduInstClassSubject
	 */
	
	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "Fk_inst_class_sub_Id", unique = false, nullable = false, insertable = true, updatable = true)
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
	 * @return the eduInstitutionClass
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "Fk_inst_class_Id", unique = false, nullable = false, insertable = true, updatable = true)
	public EduInstitutionClass getEduInstitutionClass() {
		return eduInstitutionClass;
	}
	/**
	 * @param eduInstitutionClass the eduInstitutionClass to set
	 */
	public void setEduInstitutionClass(EduInstitutionClass eduInstitutionClass) {
		this.eduInstitutionClass = eduInstitutionClass;
	}
	
	
	
	
}
