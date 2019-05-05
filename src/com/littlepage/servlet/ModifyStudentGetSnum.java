package com.littlepage.servlet;

import com.littlepage.entity.Student;
import com.littlepage.service.SearchStudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ModifyStudentGetSnum",urlPatterns = "/ModifyStudentGetSnum")
public class ModifyStudentGetSnum extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sNum=request.getParameter("loginName");
        Student student= SearchStudentService.searchBySnum(sNum);
        if(student==null) request.getRequestDispatcher("WEB-INF/pages/operateFailed.jsp").forward(request, response);
        request.getSession().setAttribute("administratorModifyStudent", student);
        request.getRequestDispatcher("WEB-INF/pages/modifyStudent.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
