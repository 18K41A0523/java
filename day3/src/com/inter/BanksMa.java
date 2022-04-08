package com.inter;

public class BanksMa {
	public static void main(String args[]) {
		PublicSectorBanks pb=new PublicSectorBanks() ;
		 pb.checkBalance();
		 pb.withdraw();
		 pb.deposit();
		 pb.sellInsurance();
		 pb.settleClaims();
	}

}
