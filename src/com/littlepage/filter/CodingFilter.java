package com.littlepage.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(filterName = "CodingFilter",urlPatterns = "/*")
public class CodingFilter implements Filter {
    public void destroy() {
        System.out.println("Coding Filter destroyed. ");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req=(HttpServletRequest)request;
        String path=req.getServletPath();
        if(path.contains("css")||path.contains("js")||path.contains("img")||path.contains("icons")||path.contains("fonts")){
            chain.doFilter(request, response);
            return;
        }else {
            request.setCharacterEncoding("utf-8");
            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
        }
        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("Coding filter started");
    }

}
