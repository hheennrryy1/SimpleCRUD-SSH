package com.henry.entity;

import java.io.Serializable;

public class StudentInfo implements Serializable {

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", weight=" + weight
				+ "]";
	}

	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private String sex;
	private int age;
	private float weight;
	
	public StudentInfo() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}
}	
