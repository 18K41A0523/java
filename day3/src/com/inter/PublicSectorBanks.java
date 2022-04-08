package com.inter;
public class PublicSectorBanks implements Banks,InsuranceService{
	
	public void checkBalance() {
		System.out.println("public balance");
	}
	public void withdraw() {
		System.out.println("public withdraw");
	}
	public void deposit() {
		System.out.println("public deposit");
	}
	public void sellInsurance() {
		System.out.println("Sells Insurance");
	}
	public void settleClaims() {
		System.out.println("Settles Claims");
	}

}
