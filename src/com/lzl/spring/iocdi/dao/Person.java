package com.lzl.spring.iocdi.dao;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private long pid;
	private String name = "aaadsadsa";
	private String description;
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", description="
				+ description + "]";
	}
	public Person(long pid, String name, String description) {
		super();
		this.pid = pid;
		this.name = name;
		this.description = description;
	}
	public Person() {
		super();
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
