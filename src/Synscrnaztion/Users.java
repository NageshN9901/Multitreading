package Synscrnaztion;

public class Users {
// now need to set minmum balance
static final BankAccount Vijay =new BankAccount(50);//here given imumbalnce 50

public static void main(String[] args) {
	Vijay.credit(100);// now adde 100 rs for vijay account
	// we will assum that one person has 2 cards so he his taking money at one time with two cards with same time to take minmum balnce aslo
	
	// 1stcard
	Thread t1=new Thread(()->{
	Atm.Withdraw(Vijay, 100);
	});
	// 2nd card
	Thread t2=new Thread(()->{
		Atm.Withdraw(Vijay, 100);
		});
	// now need to make start Threads
	t1.start();
	t2.start();
}
// this is the ouput when we do without Synctrtion every time 2 thredas at time will go inside methiod do same task at same time 
// we need make which methiod need Syncrnized means aftyer thread 1 thread completion only onther thread need to go
// go inside that method
//Rs100 Succsfullt Transction done
//Rs100 Succsfullt Transction done
//Current Balance0
//Current Balance0

}
