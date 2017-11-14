package com.tocean.crm.service.impl;

import com.tocean.crm.dao.HomeworkDao;
import com.tocean.crm.entity.Homework;

import com.tocean.crm.service.HomeworkService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Homeworkservice")
@Slf4j
public class HomeworkServiceImpl implements HomeworkService {
    @Autowired
    private  HomeworkDao homeworkDao;

    @Override
    public List<Homework> findBycourseId(String courseId) {
        List<Homework> homeworks=homeworkDao.findBycourseId(courseId);
        return homeworks;
    }
}
