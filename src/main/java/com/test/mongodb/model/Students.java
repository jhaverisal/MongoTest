package com.test.mongodb.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Students {
	
	@Id
	private ObjectId _id;
	private String name;
	private int age;
	private String school;
	
	
	public Students()
	{}
	
	
	public Students(ObjectId _id,String name, int age, String school) {
		this._id=_id;
		this.name = name;
		this.age = age;
		this.school = school;
	}


	public String get_id() {
		return _id.toHexString();
	}


	public void set_id(ObjectId _id) {
		this._id = _id;
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


	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}
	
	

}
