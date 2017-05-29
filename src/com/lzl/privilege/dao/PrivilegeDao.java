package com.lzl.privilege.dao;

public class PrivilegeDao {

	private Long id;
	private String privilegeName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPrivilegeName() {
		return privilegeName;
	}
	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}
	public PrivilegeDao(Long id, String privilegeName) {
		super();
		this.id = id;
		this.privilegeName = privilegeName;
	}
}
