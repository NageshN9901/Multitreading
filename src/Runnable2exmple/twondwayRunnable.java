package Runnable2exmple;

public class twondwayRunnable implements Runnable{
	// to create thred we can extedns its class caled thread
		@Override
		// run method is used to run the thread it will excute thread 
		public void run() {
			int i=1;
			while(i<=100) {
				// we cant use this.getnamefor interafce implnetion
				//method which gives name of thread intally as thread 0
				
				//System.out.println(i+" "+this.getName());
				System.out.println(i+" "+Thread.currentThread().getName());
				i++;
			}
		}
}
