package Threadcreation;
public class tocreateTreadwithName  extends Thread{
// to create thred we can extedns its class caled thread
	@Override
	// run method is used to run the thread it will excute thread 
	public void run() {
		int i=1;
		while(i<=100) {
			// this.getName method which gives name of thread intally as thread 0
			System.out.println(i+" "+this.getName());
			// we can use both getanme methods
			///System.out.println(i+" "+Thread.currentThread().getName());
			i++;
		}
	}
}
