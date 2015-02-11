package com.edu.app.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;


@MappedSuperclass
public class BaseSubject extends BaseEntity{
	
	private char isBelongToFirstFourPeriods;
	private int noHrsForWeek;
	private char isDblDurRequired;
	
	

	@Column(name="belong_fst_four_prds", unique=false, nullable=true, insertable=true, updatable=true)
	public char getIsBelongToFirstFourPeriods() {
		return isBelongToFirstFourPeriods;
	}

	public void setIsBelongToFirstFourPeriods(char isBelongToFirstFourPeriods) {
		this.isBelongToFirstFourPeriods = isBelongToFirstFourPeriods;
	}
	 @Column(name="hrs_for_week", unique=false, nullable=true, insertable=true, updatable=true)
	public int getNoHrsForWeek() {
		return noHrsForWeek;
	}

	public void setNoHrsForWeek(int noHrsForWeek) {
		this.noHrsForWeek = noHrsForWeek;
	}
	
	@Column(name="is_dbl_dur_req", unique=false, nullable=true, insertable=true, updatable=true)
	public char getIsDblDurRequired() {
		return isDblDurRequired;
	}

	
	public void setIsDblDurRequired(char isDblDurRequired) {
		this.isDblDurRequired = isDblDurRequired;
	}

}
