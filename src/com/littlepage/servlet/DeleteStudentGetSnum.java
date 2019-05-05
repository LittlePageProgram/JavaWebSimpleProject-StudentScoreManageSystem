package com.littlepage.servlet;

import com.littlepage.entity.Student;
import com.littlepage.service.DeleteStudentService;
import com.littlepage.service.SearchStudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteStudentGetSnum",urlPatterns = "/DeleteStudentGetSnum")
public class DeleteStudentGetSnum extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sNum=request.getParameter("loginName");
        Student student= SearchStudentService.searchBySnum(sNum);
        if(student==null) request.getRequestDispatcher("WEB-INF/pages/operateFailed.jsp").forward(request, response);
        boolean isDelete=DeleteStudentService.deleteStudentBySnum(student);
        if(isDelete) {
            request.getRequestDispatcher("WEB-INF/pages/operateSuccess.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("WEB-INF/pages/operateFailed.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
