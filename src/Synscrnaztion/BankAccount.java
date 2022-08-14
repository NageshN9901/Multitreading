package Synscrnaztion;

public class BankAccount {

	
private int balance =0;
private final int minmumbalnce;


//const
// final variables need to be intilze at the time intlatiion but we withoout declrtion also we can use by 
//passing into constructre
public BankAccount(int  minmumbalnce) {
	this.minmumbalnce=minmumbalnce;
}
//Method
public void credit(int amount) {// why amont means we will pass parameter wher with objcet automaticlly 
	// this method will invoke
	balance+=amount;// evry time call this method balnce will be incremented
}
//Method
public void debit(int amount) {
	balance-=amount;
}
public int getBalance() {
	return balance;// return balanace means becasuer thats we want update balnce 
}
public int getMinmumbalnce() {
	return minmumbalnce;
}


}
