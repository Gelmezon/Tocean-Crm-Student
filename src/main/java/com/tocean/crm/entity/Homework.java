package com.tocean.crm.entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Data
@Table(name="student_homework")
public class Homework {
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "make_date")
    private Data makeDate;
    @Column(name = "teacher")
    private String teacher;
    @Column(name="status")
    private int status;
    @Column(name = "other")
    private String other;
    @Column(name = "course_id")
    private int courseId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Data getMakeDate() {
        return makeDate;
    }

    public void setMakeDate(Data makeDate) {
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

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
}
