package com.onetoone.all.OneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Address_DB")

public class Address {

	public Address() {
		super();
	}

	@Id
	@Column(name = "addrid")
	private int addid;
	@Column(name = "place", length = 10)
	private String place;
	@OneToOne(targetEntity = Student.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "stu_id", referencedColumnName = "sid")
	private Student parent;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + addid;
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		return result;
	}

	public int getAddid() {
		return addid;
	}

	public void setAddid(int addid) {
		this.addid = addid;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Student getParent() {
		return parent;
	}

	public void setParent(Student parent) {
		this.parent = parent;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (addid != other.addid)
			return false;
		if (parent == null) {
			if (other.parent != null)
				return false;
		} else if (!parent.equals(other.parent))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		return true;
	}

}
