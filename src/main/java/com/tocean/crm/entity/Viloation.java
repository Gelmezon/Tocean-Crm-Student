package com.tocean.crm.entity;

import com.tocean.crm.common.base.baseObject.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Data
@Table(name="student_violation")
public class Viloation extends BaseEntity {

    @Column(name = "handle_way")
    private  String handleWay ;
    @Column(name="violation_desc")
    private String viloationDesc;
    @Column(name = "viloation_date")
    private Date viloationDate;
    @Column(name="book_date")
    private Date bookDate;
    @Column(name="student_attitude")
    private String studentAttitude;
    @Column(name = "booker")
    private String booker;
    @Column(name="confirmer")
    private String confirmer;
    @Column(name = "confirm_date")
    private Date confirmDate;
    @Column(name = "student_id" )
    private  String studentId;
    @Column(name = "approve")
    private String approve;

    public String getHandleWay() {
        return handleWay;
    }

    public void setHandleWay(String handleWay) {
        this.handleWay = handleWay;
    }

    public String getViloationDesc() {
        return viloationDesc;
    }

    public void setViloationDesc(String viloationDesc) {
        this.viloationDesc = viloationDesc;
    }

    public Date getViloationDate() {
        return viloationDate;
    }

    public void setViloationDate(Date viloationDate) {
        this.viloationDate = viloationDate;
    }

    public Date getBookDate() {
        return bookDate;
    }

    public void setBookDate(Date bookDate) {
        this.bookDate = bookDate;
    }

    public String getStudentAttitude() {
        return studentAttitude;
    }

    public void setStudentAttitude(String studentAttitude) {
        this.studentAttitude = studentAttitude;
    }

    public String getBooker() {
        return booker;
    }

    public void setBooker(String booker) {
        this.booker = booker;
    }

    public String getConfirmer() {
        return confirmer;
    }

    public void setConfirmer(String confirmer) {
        this.confirmer = confirmer;
    }

    public Date getConfirmDate() {
        return confirmDate;
    }

    public void setConfirmDate(Date confirmDate) {
        this.confirmDate = confirmDate;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getApprove() {
        return approve;
    }

    public void setApprove(String approve) {
        this.approve = approve;
    }
}
