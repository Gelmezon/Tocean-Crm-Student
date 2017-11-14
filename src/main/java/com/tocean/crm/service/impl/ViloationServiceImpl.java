package com.tocean.crm.service.impl;


import com.tocean.crm.dao.ViloationDao;
import com.tocean.crm.entity.Viloation;
import com.tocean.crm.service.Viloationservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Viloationservice")
@Slf4j
public class ViloationServiceImpl implements Viloationservice {

    @Autowired
    private ViloationDao viloationDao;
    @Override
    public List<Viloation> findBystudentId(String studentId) {
        List<Viloation> viloations=viloationDao.findBystudentId(studentId);
        return viloations;
    }
}
