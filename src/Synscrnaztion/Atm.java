package Synscrnaztion;

public class Atm {
	// we are defineing method which takes bankacccount and amount as argmnets
	// with method i mention  synchronized  keywprd to make
	// restrction to this mathod only one thread enter at time after compl;etion of 
	// that methiod onether therad mneed to go inside
static synchronized  void Withdraw(BankAccount account , int amount) {
	int balance=account.getBalance();// when we call this get balnce will invike and fetch and send too r
	// send to right side balnce contianer
	// now need check when balance=0 when agin it will come to 0 its should show soem intemantion
 if((balance-amount) < -account.getMinmumbalnce()){
	 System.out.println("Transction deined");// when balance shows 0
 }else {
	 account.debit(amount );// otherwise amount will be debited
 
	 System.out.println("Rs"+amount+" Succsfullt Transction done");
 }
// now need to shopws current balalnce
System.out.println("Current Balance"+account.getBalance());


}
}
