package com.tocean.crm.service;

import com.tocean.crm.entity.Viloation;

import java.util.List;

public interface Viloationservice {
    public List<Viloation> findBystudentId(String studentId);
}
