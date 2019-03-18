package com.wx.service;

public class FactoryService {
    public static StudentService getStudentService() {
    	return new StudentServiceImp();
    }
}
