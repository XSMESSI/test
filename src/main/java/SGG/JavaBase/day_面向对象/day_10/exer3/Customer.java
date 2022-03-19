package SGG.JavaBase.day_面向对象.day_10.exer3;

import lombok.Data;

/**
 * 客户类
 */

public class Customer {
	
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String f,String l){
		this.firstName = f;
		this.lastName = l;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	

}
