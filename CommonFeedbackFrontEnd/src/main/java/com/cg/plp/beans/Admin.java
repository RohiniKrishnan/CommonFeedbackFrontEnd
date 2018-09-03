package com.cg.plp.beans;

public class Admin {

	private String adminId;
	private String adminName;
	private String password;
	private int pid;
	private String feedback;
	private String merchantEmail;
	private String merchant_response;
	
	public Admin() {
		
	}
	
	
	public Admin(String adminId, String adminName, String password, int pid, String feedback, String merchantEmail,
		String merchant_response) {
	super();
	this.adminId = adminId;
	this.adminName = adminName;
	this.password = password;
	this.pid = pid;
	this.feedback = feedback;
	this.merchantEmail = merchantEmail;
	this.merchant_response = merchant_response;
}


	public String getAdminId() {
		return adminId;
	}


	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}


	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	public String getMerchantEmail() {
		return merchantEmail;
	}


	public void setMerchantEmail(String merchantEmail) {
		this.merchantEmail = merchantEmail;
	}


	public String getMerchant_response() {
		return merchant_response;
	}


	public void setMerchant_response(String merchant_response) {
		this.merchant_response = merchant_response;
	}


	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", password=" + password + ", pid=" + pid
				+ ", feedback=" + feedback + ", merchantEmail=" + merchantEmail + ", merchant_response="
				+ merchant_response + "]";
	}
	
	

	

}
