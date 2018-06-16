package com.onetoone.all.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students_DetailsDB")
public class Student {

	@Id
	@Column(name = "sid")
	private int sid;
	@Column(name = "sname", length = 10)
	private String name;
	@Column(name = "grp", length = 10)
	private String group;

	public Student() {
		super();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}
