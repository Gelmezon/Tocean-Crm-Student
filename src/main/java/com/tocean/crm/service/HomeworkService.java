package com.tocean.crm.service;

import com.tocean.crm.entity.Homework;

import java.util.List;

public interface HomeworkService {
    public List<Homework> findBycourseId(String courseId);
}
