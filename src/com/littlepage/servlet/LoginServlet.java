package com.littlepage.servlet;

import com.littlepage.entity.Administrator;
import com.littlepage.service.LoginService;
import com.littlepage.service.SearchAdminService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet",urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginName=request.getParameter("loginName");
        String password=request.getParameter("password");
        int loginAccount= LoginService.dealWith(loginName,password);
        if(loginAccount==-1) {
            request.getRequestDispatcher("WEB-INF/pages/loginFailed.jsp").forward(request, response);
        }else if(loginAccount==1) {
            HttpSession session=request.getSession();
            Administrator loginAdministrator= SearchAdminService.searchByAnum(loginName);
            session.setAttribute("loginInfo", loginAdministrator);
            request.getRequestDispatcher("WEB-INF/pages/administratorLogin.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
