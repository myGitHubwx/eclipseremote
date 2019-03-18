package com.wx.test;

import org.junit.jupiter.api.Test;

import com.wx.dao.StudentDao;
import com.wx.dao.StudentDaoImp;
import com.wx.model.Student;

class StudentDaoimp {
    StudentDao studentDao=new StudentDaoImp();
	@Test
	void testGetInt() {
	Student student = studentDao.get(1);
	System.out.println(student);
	}

}
