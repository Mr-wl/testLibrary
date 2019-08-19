package com.mapper;

import java.util.List;
import java.util.Map;

import com.po.Student;

public interface StudentMapper {
  void add(Student student);
  void update(Student student);
  void del(int id);
  List<Student> getList(Map<String, Object> map);
  List<Student> getList1();
  Student getById(int id);
  int getCount(String name);
  List<Student> getDroup();
  List<Student> getListByName(String name);
}
