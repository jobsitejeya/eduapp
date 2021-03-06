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
 * EduInstClassSection generated by hbm2java
 */
@Entity
@Table(name="edu_inst_class_section")
public class EduInstClassSection  extends BaseEntity {

    // Fields

     private EduInstitutionClass eduInstitutionClass;
     private EduSection eduSection;
     private Set<EduStudent> eduStudents = new HashSet<EduStudent>(0);

     // Constructors

    /** default constructor */
    public EduInstClassSection() {
    }

    // Property accessors

@ManyToOne(cascade={},
        fetch=FetchType.LAZY)

    @JoinColumn(name="Fk_Institution_Class_Id", unique=false, nullable=true, insertable=true, updatable=true)
    public EduInstitutionClass getEduInstitutionClass() {
        return this.eduInstitutionClass;
    }

    public void setEduInstitutionClass(EduInstitutionClass eduInstitutionClass) {
        this.eduInstitutionClass = eduInstitutionClass;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)

    @JoinColumn(name="Fk_Section_Id", unique=false, nullable=false, insertable=true, updatable=true)
    public EduSection getEduSection() {
        return this.eduSection;
    }

    public void setEduSection(EduSection eduSection) {
        this.eduSection = eduSection;
    }

    @OneToMany(cascade={CascadeType.ALL}, fetch=FetchType.LAZY, mappedBy="eduInstClassSection")
    public Set<EduStudent> getEduStudents() {
        return this.eduStudents;
    }

    public void setEduStudents(Set<EduStudent> eduStudents) {
        this.eduStudents = eduStudents;
    }




}
