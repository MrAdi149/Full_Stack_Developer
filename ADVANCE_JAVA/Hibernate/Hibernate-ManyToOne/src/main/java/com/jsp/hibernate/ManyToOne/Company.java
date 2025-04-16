package com.jsp.hibernate.ManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Company {

	
	@Id
	private int companyId;
	private String commpanyName;
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCommpanyName() {
		return commpanyName;
	}
	public void setCommpanyName(String commpanyName) {
		this.commpanyName = commpanyName;
	}
	
}
