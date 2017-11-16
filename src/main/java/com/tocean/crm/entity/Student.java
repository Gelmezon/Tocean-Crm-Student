package com.tocean.crm.entity;

import com.tocean.crm.common.base.baseObject.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Blob;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/6.
 */
@Entity
@Data
@Table(name="student_info")
public class Student extends BaseEntity {
    @Column(name="name",length = 100)
    private String name;
    @Column(name="login_name",length = 100)
    private String loginName;
    @Column(name="password",length = 100)
    private String password;
    @Column(name="code")
    private String code;
    @Column(name="statusChange")
    private String statusChange;
    @Column(name="studentType")
    private String studentType;
    @Column(name="birthPlace")
    private String birthPlace;
    @Column(name="birthDay")
    private Date birthDay;

    @Column(name = "sex")
    private String sex;
    @Column(name="married")
    private String married;

    @Column(name="academy")
    private String academy;
    @Column(name="department")
    private String department;
    @Column(name="collegeMajor")
    private String collegeMajor;


    @Column(name="telephone")
    private String telephone;
    @Column(name="school")
    private String school;
    @Column(name="graduateDate")
    private String graduateDate;
    @Column(name="hobby")
    private String hobby;
    @Column(name = "email")
    private String email;
    @Column(name="qq")
    private String qq;
    @Column(name = "msn")
    private String msn;
    @Column(name = "home_address")
    private String homeAddress;
    @Column(name = "home_phone")
    private String homePhone;
    @Column(name = "comminucation_address")
    private  String comminucationAddress;
    @Column(name = "credential_no")
    private String credentialNo;
    @Column(name = "guardian")
    private String guardian;
    @Column(name = "guardian_phone")
    private String guardianPhone;
    @Column(name = "relation")
    private String relation;
    @Column(name = "urgency_person")
    private String urgencyPerson;
    @Column(name = "urgency_phone")
    private String urgencyPhone;
    @Column(name = "train_company")
    private  String trainCompany;
    @Column(name = "train_time")
    private  String trainTime;
    @Column(name = "train_context")
    private  String trainContext;
    @Column(name = "old_company")
    private String oldCompany;
    @Column(name = "old_headship")
    private String oldHeadship;
    @Column(name = "old_salary")
    private  int oldSalary;
    @Column(name = "family_backgroud")
    private String familyBackgroud;
    @Column(name = "parent_status")
    private String parentStatus;
    @Column(name = "job_design")
    private String jobDesign;
    @Column(name = "target")
    private String target;
    @Column(name = "economy")
    private String economy;
    @Column(name = "qulity_score")
    private Double qulityScore;
    @Column(name = "skill_score")
    private Double skillScore;
    @Column(name = "danei_graduatedate")
    private Date daneiGraduateDate;
    @Column(name = "inner_headship")
    private String innerHeadship;
    @Column(name = "pic")
    private Blob pic;
    @Column(name = "pic_filename")
    private String picFilename;
    @Column(name = "resume")
    private Blob resume;
    @Column(name = "resume_filename")
    private String resumeFilename;
    @Column(name = "")

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStatusChange() {
        return statusChange;
    }

    public void setStatusChange(String statusChange) {
        this.statusChange = statusChange;
    }

    public String getStudentType() {
        return studentType;
    }

    public void setStudentType(String studentType) {
        this.studentType = studentType;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCollegeMajor() {
        return collegeMajor;
    }

    public void setCollegeMajor(String collegeMajor) {
        this.collegeMajor = collegeMajor;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(String graduateDate) {
        this.graduateDate = graduateDate;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
