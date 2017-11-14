package com.tocean.crm.controller;

import com.tocean.crm.common.base.baseObject.Response;
import com.tocean.crm.entity.Student;
import com.tocean.crm.entity.Viloation;
import com.tocean.crm.jwt.JwtUtil;
import com.tocean.crm.service.StudentService;
import com.tocean.crm.service.Viloationservice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/student")
public class ViloationController {
    @Autowired
    private Viloationservice viloationService;
    @Autowired
    private StudentService studentService;

    @GetMapping(value="/api/ViloationBystudent_id")
    public Response ViloationBystudent_id(HttpServletRequest request){
        try{
            String loginName = request.getHeader(JwtUtil.USER_ID);
            Student student = studentService.findByLoginName(loginName);

            List<Viloation> viloations = viloationService.findBystudentId(student.getId());
            return Response.ok(viloations);
        } catch (Exception e) {
            return Response.fail(e.getMessage());
        }
    }


}
