package com.po;

public class Student {
private int id;
private String name;
private int age;
private String birthday;
private String hobbies;
private String sex;
private String photopath;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getBirthday() {
	return birthday;
}
public void setBirthday(String birthday) {
	this.birthday = birthday;
}
public String getHobbies() {
	return hobbies;
}
public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getPhotopath() {
	return photopath;
}
public void setPhotopath(String photopath) {
	this.photopath = photopath;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, int age, String birthday, String hobbies,
		String sex, String photopath) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.birthday = birthday;
	this.hobbies = hobbies;
	this.sex = sex;
	this.photopath = photopath;
}
public Student(String name, int age, String birthday, String hobbies,
		String sex, String photopath) {
	super();
	this.name = name;
	this.age = age;
	this.birthday = birthday;
	this.hobbies = hobbies;
	this.sex = sex;
	this.photopath = photopath;
}
public Student(int id, String name, int age, String birthday, String hobbies,
		String sex) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.birthday = birthday;
	this.hobbies = hobbies;
	this.sex = sex;
}
public Student(String name, int age, String birthday, String hobbies, String sex) {
	super();
	this.name = name;
	this.age = age;
	this.birthday = birthday;
	this.hobbies = hobbies;
	this.sex = sex;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age
			+ ", birthday=" + birthday + ", hobbies=" + hobbies + ", sex="
			+ sex + ", photopath=" + photopath + "]";
}

}
