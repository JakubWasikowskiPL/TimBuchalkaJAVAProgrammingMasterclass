package com.jakubwasikowski;

public class Main {

    public static void main(String[] args) {
	Account jimsAccount=new Account("Jim");
	jimsAccount.deposit(1000);
	jimsAccount.withdraw(500);
	jimsAccount.withdraw(-200);
	jimsAccount.deposit(-20);
	jimsAccount.calculateBalance();
//	jimsAccount.balance=5000;  thanks to private modificator action is not allowed

        System.out.println("Balance on account is "+jimsAccount.getBalance());
//        jimsAccount.transactions.add(4500); thanks to private modificator action is not allowed
        jimsAccount.calculateBalance();
    }
}
