package com.wx.dao;

import java.util.List;

import com.wx.model.Student;

public class StudentDaoImp extends BaseDao<Student> implements StudentDao{

	@Override
	public int save(Student student) {
		String sql="insert into student(id,name,age) values(?,?,?)";
		return super.update(sql, student.getId(),student.getName(),student.getAge());
	}

	@Override
	public int deleteStudentById(int id) {
		String sql="DELETE FROM student where id=?";
		return super.update(sql, id);
	}

	@Override
	public int updateStudentById(Student student) {
		String sql="UPDATE student set `name`=?,age=? WHERE id=?";
		return super.update(sql, student.getName(),student.getAge(),student.getId());
	}

	@Override
	public Student get(int id) {
		String sql="select id,name,age from student where id=?";
		return super.get(sql, id);
	}

	@Override
	public List<Student> getListAll() {
		String sql="select * from student";
		return super.getList(sql);
	}

	@Override
	public long getCountByName(String name) {
		String sql="select count(id) from student where name=?";
		return (long) super.getValue(sql, name);
	}

}
