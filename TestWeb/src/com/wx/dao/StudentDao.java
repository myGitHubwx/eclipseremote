package com.wx.dao;

import java.util.List;

import com.wx.model.Student;

public interface StudentDao {
  public int save(Student student);

  public int deleteStudentById(int id);

  public int updateStudentById(Student student);
  
  public Student get(int id);
  
  public List<Student> getListAll();
  
  public long getCountByName(String name);
}
