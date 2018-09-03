package com.cg.plp.beans;

public class Merchant {

	private String merchant_emailId;
	private int prod_id;
	private String merchant_name;
	private String merchant_password;
	private String merchantType;
	private String customer_feedback;
	private String merchant_response;
	
public Merchant() {
		
	}

public Merchant(String merchant_emailId, int prod_id, String merchant_name, String merchant_password,
		String merchantType, String customer_feedback, String merchant_response) {
	super();
	this.merchant_emailId = merchant_emailId;
	this.prod_id = prod_id;
	this.merchant_name = merchant_name;
	this.merchant_password = merchant_password;
	this.merchantType = merchantType;
	this.customer_feedback = customer_feedback;
	this.merchant_response = merchant_response;
}

public String getMerchant_emailId() {
	return merchant_emailId;
}

public void setMerchant_emailId(String merchant_emailId) {
	this.merchant_emailId = merchant_emailId;
}

public String getCustomer_feedback() {
	return customer_feedback;
}

public void setCustomer_feedback(String customer_feedback) {
	this.customer_feedback = customer_feedback;
}

public String getMerchant_response() {
	return merchant_response;
}

public void setMerchant_response(String merchant_response) {
	this.merchant_response = merchant_response;
}

public int getProd_id() {
	return prod_id;
}

public void setProd_id(int prod_id) {
	this.prod_id = prod_id;
}

public String getMerchant_name() {
	return merchant_name;
}

public void setMerchant_name(String merchant_name) {
	this.merchant_name = merchant_name;
}

public String getMerchant_password() {
	return merchant_password;
}

public void setMerchant_password(String merchant_password) {
	this.merchant_password = merchant_password;
}

public String getMerchantType() {
	return merchantType;
}

public void setMerchantType(String merchantType) {
	this.merchantType = merchantType;
}

@Override
public String toString() {
	return "Merchant [merchant_emailId=" + merchant_emailId + ", prod_id=" + prod_id + ", merchant_name="
			+ merchant_name + ", merchant_password=" + merchant_password + ", merchantType=" + merchantType
			+ ", customer_feedback=" + customer_feedback + ", merchant_response=" + merchant_response + "]";
}

}
