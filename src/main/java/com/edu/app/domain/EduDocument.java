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
 * EduDocument generated by hbm2java
 */
@Entity
@Table(name="edu_document")
public class EduDocument  extends BaseEntity {

    // Fields

     private EduCourseBranch eduCourseBranch;
     private EduInstitution eduInstitution;
     private EduCourse eduCourse;
     private EduSection eduSection;
     private EduClass eduClass;
     private String documentName;
     private String documentPath;
     private Date fromDate;
     private Date toDate;

     // Constructors

    /** default constructor */
    public EduDocument() {
    }

    // Property accessors

@ManyToOne(cascade={},
        fetch=FetchType.LAZY)

    @JoinColumn(name="Fk_Course_Branch_Id", unique=false, nullable=true, insertable=true, updatable=true)
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
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)

    @JoinColumn(name="Fk_Course_Id", unique=false, nullable=true, insertable=true, updatable=true)
    public EduCourse getEduCourse() {
        return this.eduCourse;
    }

    public void setEduCourse(EduCourse eduCourse) {
        this.eduCourse = eduCourse;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)

    @JoinColumn(name="Fk_Section_Id", unique=false, nullable=true, insertable=true, updatable=true)
    public EduSection getEduSection() {
        return this.eduSection;
    }

    public void setEduSection(EduSection eduSection) {
        this.eduSection = eduSection;
    }
@ManyToOne(cascade={},
        fetch=FetchType.LAZY)

    @JoinColumn(name="Fk_Class_Id", unique=false, nullable=true, insertable=true, updatable=true)
    public EduClass getEduClass() {
        return this.eduClass;
    }

    public void setEduClass(EduClass eduClass) {
        this.eduClass = eduClass;
    }

    @Column(name="Document_Name", unique=false, nullable=false, insertable=true, updatable=true)
    public String getDocumentName() {
        return this.documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    @Column(name="Document_Path", unique=false, nullable=false, insertable=true, updatable=true, length=2000)
    public String getDocumentPath() {
        return this.documentPath;
    }

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
    }

    @Column(name="From_Date", unique=false, nullable=false, insertable=true, updatable=true, length=19)
    public Date getFromDate() {
        return this.fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    @Column(name="To_Date", unique=false, nullable=false, insertable=true, updatable=true, length=19)
    public Date getToDate() {
        return this.toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
