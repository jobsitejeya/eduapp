package com.edu.app.domain;
// Generated Jul 5, 2008 9:25:16 PM by Hibernate Tools 3.1.0.beta5


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * EduInstitutionBranch generated by hbm2java
 */
@Entity
@Table(name="edu_institution_branch")
public class EduInstitutionBranch  extends BaseEntity {

    // Fields
     private EduCourseBranch eduCourseBranch;
     private EduInstitution eduInstitution;
     private Set<EduInstBranchSubject> eduInstBranchSubjects = new HashSet<EduInstBranchSubject>(0);
     private Set<EduInstBranchSection> eduInstBranchSections = new HashSet<EduInstBranchSection>(0);

     // Constructors

    /** default constructor */
    public EduInstitutionBranch() {
    }
    // Property accessors

@ManyToOne(cascade={},
        fetch=FetchType.LAZY)

    @JoinColumn(name="Fk_Course_Branch_Id", unique=false, nullable=false, insertable=true, updatable=true)
    public EduCourseBranch getEduCourseBranch() {
        return this.eduCourseBranch;
    }

    public void setEduCourseBranch(EduCourseBranch eduCourseBranch) {
        this.eduCourseBranch = eduCourseBranch;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)

    @JoinColumn(name="Fk_Institution_Id", unique=false, nullable=false, insertable=true, updatable=true)
    public EduInstitution getEduInstitution() {
        return this.eduInstitution;
    }

    public void setEduInstitution(EduInstitution eduInstitution) {
        this.eduInstitution = eduInstitution;
    }
    @OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="eduInstitutionBranch")
    public Set<EduInstBranchSubject> getEduInstBranchSubjects() {
        return this.eduInstBranchSubjects;
    }

    public void setEduInstBranchSubjects(Set<EduInstBranchSubject> eduInstBranchSubjects) {
        this.eduInstBranchSubjects = eduInstBranchSubjects;
    }
    @OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="eduInstitutionBranch")
    public Set<EduInstBranchSection> getEduInstBranchSections() {
        return this.eduInstBranchSections;
    }

    public void setEduInstBranchSections(Set<EduInstBranchSection> eduInstBranchSections) {
        this.eduInstBranchSections = eduInstBranchSections;
    }
}
