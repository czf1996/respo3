package com.hxzyan.beans;

public class Student {
 private int id;
 private String name;
 private int age;
 private String professional;
 private String sex;
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

public String getProfessional() {
	return professional;
}
public void setProfessional(String professional) {
	this.professional = professional;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", age=" + age + ", professional=" + professional + ", sex=" + sex
			+ "]";
}

}
