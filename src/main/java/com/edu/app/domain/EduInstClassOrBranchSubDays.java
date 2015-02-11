package com.edu.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="edu_inst_class_or_branch_sub_days")
public class EduInstClassOrBranchSubDays extends BaseEntity {
	
	private int day;
	
	private EduInstClassSubject eduInstClassSubject;
	
	private EduInstBranchSubject eduInstBranchSubject;

	/**
	 * @return the day
	 */
	@Column(name="day", unique=false, nullable=true, insertable=true, updatable=true,length=2)
	public int getDay() {
		return day;
	}

	/**
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**
	 * @return the eduInstClassSubject
	 */
	/**
	 * @return the eduTeacher
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "Fk_class_subject_id", unique = false, nullable = true, insertable = true, updatable = true)
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
	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "Fk_branch_subject_id", unique = false, nullable = true, insertable = true, updatable = true)
	public EduInstBranchSubject getEduInstBranchSubject() {
		return eduInstBranchSubject;
	}

	/**
	 * @param eduInstBranchSubject the eduInstBranchSubject to set
	 */
	public void setEduInstBranchSubject(EduInstBranchSubject eduInstBranchSubject) {
		this.eduInstBranchSubject = eduInstBranchSubject;
	}
	
	

}
