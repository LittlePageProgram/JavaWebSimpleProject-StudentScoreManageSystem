package com.littlepage.servlet;

import com.littlepage.entity.Student;
import com.littlepage.service.ModifyStudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ModifyStudentDone",urlPatterns = "/ModifyStudentDone")
public class ModifyStudentDone extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name=request.getParameter("sName");
        String sAge=request.getParameter("sAge");
        String sClass=request.getParameter("sClass");
        String nativePlace=request.getParameter("nativePlace");
        Student modifyingStudent=(Student) request.getSession().getAttribute("administratorModifyStudent");
        boolean isModified= ModifyStudentService.modifyBySnum(new Student(modifyingStudent.getSid(), modifyingStudent.getSnum(),
                name, Integer.parseInt(sAge), sClass, nativePlace, modifyingStudent.getPassword()));
        if(isModified) request.getRequestDispatcher("WEB-INF/pages/operateSuccess.jsp").forward(request, response);
        else request.getRequestDispatcher("WEB-INF/pages/operateFailed.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
