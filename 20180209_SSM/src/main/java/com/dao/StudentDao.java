package com.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.mapper.StudentMapper;
import com.po.Student;

@Repository
public class StudentDao {
@Resource
private SqlSessionTemplate sm;
	public void add(Student student) {
		StudentMapper mapper = sm.getMapper(StudentMapper.class);
//		StudentMapper mapper = sm.getMapper(StudentMapper.class);
		mapper.add(student);
		
	}
	public List<Student> list() {
//		StudentMapper mapper = sm.getMapper(StudentMapper.class);
		StudentMapper mapper = sm.getMapper(StudentMapper.class);

		return mapper.getList1();
	}
	public List<Student> getDroup() {
		StudentMapper mapper = sm.getMapper(StudentMapper.class);
		return mapper.getDroup();
	}
	public List getListByName(String name) {
		StudentMapper mapper = sm.getMapper(StudentMapper.class);
		return mapper.getListByName(name);
	}

}
