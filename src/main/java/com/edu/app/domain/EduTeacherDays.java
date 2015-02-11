package com.edu.app.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="edu_teacher_days")
public class EduTeacherDays extends BaseEntity{
	
	private int day;
	
	private EduTeacher  eduTeacher;

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
	 * @return the eduTeacher
	 */
	@ManyToOne(cascade = {}, fetch = FetchType.LAZY)
	@JoinColumn(name = "Fk_Teacher_Id", unique = false, nullable = true, insertable = true, updatable = true)
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
