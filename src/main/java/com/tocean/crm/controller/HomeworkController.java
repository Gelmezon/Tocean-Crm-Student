package com.tocean.crm.controller;


import com.tocean.crm.common.base.baseObject.Response;
import com.tocean.crm.entity.Homework;
import com.tocean.crm.entity.Student;
import com.tocean.crm.jwt.JwtUtil;
import com.tocean.crm.service.HomeworkService;
import lombok.extern.slf4j.Slf4j;
import com.tocean.crm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/student")
public class HomeworkController {

    @Autowired
    private HomeworkService homeworkService;
    @Autowired
    private StudentService studentService;
    @GetMapping(value = "/api/findhomework")
    public Response profile(HttpServletRequest request){
        System.out.println("我少时诵诗书所所所所所所所所所所所所所所所所所");
        try{
            String loginName = request.getHeader(JwtUtil.USER_ID);
            Student student = studentService.findByLoginName(loginName);

            List<Homework> homeworks=homeworkService.findBycourseId(student.getId());
            return Response.ok(homeworks);
        } catch (Exception e) {
            return Response.fail(e.getMessage());
        }
    }


}
