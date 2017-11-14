package com.tocean.crm.dao;

import com.tocean.crm.entity.Homework;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HomeworkDao extends JpaRepository<Homework,String> {
    public List<Homework> findBycourseId(String courseId);
}
