package com.edu.app.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;


import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
public abstract class BaseEntity implements Serializable{


	private int pkId;
	private int modifiedBy = 1 ; //UserContext.getUser()!=null? UserContext.getUser().getPkId():1;
    private Date modifiedOn = new Date();
    private char isActive = 'Y';

    // Property accessors
    @Id
	@GenericGenerator(name="SeqGenerator", strategy = "hilo",
			parameters = {
				@Parameter(name="table", value = "edu_sequence"),
				@Parameter(name="column", value="NEXT_ID"),
				@Parameter(name="max_lo", value="150")
			}
		)
	@GeneratedValue(strategy=GenerationType.TABLE,generator = "SeqGenerator")
    @Column(name="Pk_Id", unique=true, nullable=false, insertable=true, updatable=true)
    public int getPkId() {
        return this.pkId;
    }

    public void setPkId(int pkId) {
        this.pkId = pkId;
    }

	@Column(name="Modified_By", unique=false, nullable=false, insertable=true, updatable=true)
    public int getModifiedBy() {
        return 1;
    }

    public void setModifiedBy(int modifiedBy) {
        this.modifiedBy = 1;
    }

    @Column(name="Modified_On", unique=false, nullable=false, insertable=true, updatable=true, length=19)
    public Date getModifiedOn() {
        return this.modifiedOn;
    }

    public void setModifiedOn(Date modifiedOn) {
        this.modifiedOn = modifiedOn;
    }

    @Column(name="Is_Active", unique=false, nullable=false, insertable=true, updatable=true, length=1)
    public char getIsActive() {
        return this.isActive;
    }

    public void setIsActive(char isActive) {
        this.isActive = isActive;
    }
    
    public String toString()
    {
    	StringBuffer bufRet = new StringBuffer();
    	bufRet.append("pkId:  " + pkId + "\r\n");
    	bufRet.append("modifiedBy:  " + modifiedBy + "\r\n");
    	bufRet.append("modifiedOn:  " + modifiedOn + "\r\n");
    	bufRet.append("isActive:  " + isActive + "\r\n");
    	return bufRet.toString();
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pkId;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity other = (BaseEntity) obj;
		if (pkId != other.pkId)
			return false;
		return true;
	}
}