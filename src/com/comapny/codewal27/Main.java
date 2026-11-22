package com.comapny.codewal27;
//DisAdavatage of inheritance
//  tight coupling 
//  heavy loading

class Account{
	public void openAcount(String userId, String email) {
		System.out.println("Account.openAcount");
	}
}
class SavingAccount extends Account{
	@Override // changing the super class method's Functionalities
	public void openAcount(String userId, String email) {
		System.out.println("oepnsavingaccount.openAcount");
	}
}
class SrCitAccount extends SavingAccount{
	@Override
	public void openAcount(String userId, String email) {
		System.out.println("opensrCitAccount.openAccount");
	}
}
class PensionAccount extends SrCitAccount{
	@Override
	public void openAcount(String userId, String email) {
		System.out.println("openpensionAccount.openAccount");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
