package com.comapny.codewal24;
class AccountMgmt {
	public AccountMgmt() {
		System.out.println("AccountMgmt()");
	}
}

public class Account extends AccountMgmt {
static {
	System.out.println("Account SBI: ");
}
String acountNumber;
{
	System.out.println("Account IIB");
}
public Account(String acountNumber) {
	super();
	System.out.println("Account(String acountNumber)");
	this.acountNumber = acountNumber;
}

}
