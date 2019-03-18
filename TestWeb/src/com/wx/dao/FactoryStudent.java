package com.wx.dao;

public class FactoryStudent {
   public static StudentDao getStudentDao() {
	   return new StudentDaoImp();
   }
}
