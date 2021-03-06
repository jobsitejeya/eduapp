package com.edu.app.domain;
// Generated Jul 5, 2008 9:25:16 PM by Hibernate Tools 3.1.0.beta5


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * EduInstBranchSubject generated by hbm2java
 */
@Entity
@Table(name="edu_inst_branch_subject")
public class EduInstBranchSubject  extends BaseSubject {

    // Fields

     private EduInstitutionBranch eduInstitutionBranch;
     private EduSubject eduSubject;

     // Constructors

    /** default constructor */
    public EduInstBranchSubject() {
    }

    // Property accessors

@ManyToOne(cascade={},
        fetch=FetchType.LAZY)

    @JoinColumn(name="Fk_Institution_Branch_Id", unique=false, nullable=false, insertable=true, updatable=true)
    public EduInstitutionBranch getEduInstitutionBranch() {
        return this.eduInstitutionBranch;
    }

    public void setEduInstitutionBranch(EduInstitutionBranch eduInstitutionBranch) {
        this.eduInstitutionBranch = eduInstitutionBranch;
    }
@ManyToOne(cascade={},
        fetch=FetchType.EAGER)

    @JoinColumn(name="Fk_Subject_Id", unique=false, nullable=false, insertable=true, updatable=true)
    public EduSubject getEduSubject() {
        return this.eduSubject;
    }

    public void setEduSubject(EduSubject eduSubject) {
        this.eduSubject = eduSubject;
    }
}
