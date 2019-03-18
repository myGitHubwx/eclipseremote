package com.wx.service;

import java.util.List;

import com.wx.dao.FactoryStudent;
import com.wx.dao.StudentDao;
import com.wx.model.Student;

public class StudentServiceImp implements StudentService{
    StudentDao studentDao=FactoryStudent.getStudentDao();
	@Override
	public int save(Student student) {
		return studentDao.save(student);
	}

	@Override
	public int deleteStudentById(int id) {
		return studentDao.deleteStudentById(id);
	}

	@Override
	public int updateStudentById(Student student) {
		return studentDao.updateStudentById(student);
	}

	@Override
	public Student get(int id) {
		return studentDao.get(id);
	}

	@Override
	public List<Student> getListAll() {
		return studentDao.getListAll();
	}

	@Override
	public long getCountByName(String name) {
		return studentDao.getCountByName(name);
	}

}
