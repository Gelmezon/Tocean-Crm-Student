package com.tocean.crm.entity;


import com.tocean.crm.common.base.baseObject.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Data
@Table(name="student_homework")
public class Homework extends BaseEntity {

    @Column(name = "title")
    private String title;
    @Column(name = "make_date")
    private Date makeDate;
    @Column(name = "teacher")
    private String teacher;
    @Column(name="status")
    private int status;
    @Column(name = "other")
    private String other;
    @Column(name = "course_id")
    private String courseId;





    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getMakeDate() {
        return makeDate;
    }

    public void setMakeDate(Date makeDate) {
        this.makeDate = makeDate;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
}
