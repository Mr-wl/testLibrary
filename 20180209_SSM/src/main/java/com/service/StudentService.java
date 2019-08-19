package com.service;

import java.util.List;

import javax.annotation.Resource;

import jdk.nashorn.internal.ir.annotations.Reference;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.StudentDao;
import com.po.Student;

@Service
@Transactional
public class StudentService {
@Resource
private StudentDao dao;
	public void add(Student student) {
		// TODO Auto-generated method stub
		dao.add(student);
	}
	public List<Student> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}
	public List<Student> getListGroup() {
		return dao.getDroup();
	}
	public List<Student> getListByName(String name) {
		return dao.getListByName(name);
	}

}
