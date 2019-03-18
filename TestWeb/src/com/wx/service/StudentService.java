package com.wx.service;

import java.util.List;

import com.wx.model.Student;

public interface StudentService {
	public int save(Student student);

	  public int deleteStudentById(int id);

	  public int updateStudentById(Student student);
	  
	  public Student get(int id);
	  
	  public List<Student> getListAll();
	  
	  public long getCountByName(String name);
}
