package com.littlepage.servlet;

import com.littlepage.service.AddStudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DealWithAddStudent",urlPatterns = "/DealWithAddStudent")
public class DealWithAddStudent extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sNum=request.getParameter("sNum");
        String sName=request.getParameter("sName");
        String sAge=request.getParameter("sAge");
        String sClass=request.getParameter("sClass");
        String nativePlace=request.getParameter("nativePlace");
        int insertStatus= AddStudentService.dealWith(sNum,sName,sAge,sClass,nativePlace);
        if(insertStatus==0) {
            request.getRequestDispatcher("WEB-INF/pages/operateSuccess.jsp").forward(request, response);
        }else if(insertStatus==-1){
            request.getRequestDispatcher("WEB-INF/pages/operateFailed.jsp").forward(request, response);
        }else if(insertStatus==1) {
            request.getRequestDispatcher("WEB-INF/pages/operateRepeat.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
