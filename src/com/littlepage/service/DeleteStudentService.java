package com.littlepage.service;

import com.littlepage.dao.HibernateUtilsPool;
import com.littlepage.entity.Student;

public class DeleteStudentService {
    public static boolean deleteStudentBySnum(Student student){
        if(student==null) return false;
        else {
            HibernateUtilsPool.hibernateStudent.delete(student);
            return true;
        }
    }
}
