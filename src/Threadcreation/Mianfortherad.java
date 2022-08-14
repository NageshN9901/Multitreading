package Threadcreation;

public class Mianfortherad {

	//evry proagrm as theard to know we can ue  
	//Thread.activeCount() method how many therad running count it will give
	public static void main(String[] args) {
		System.out.println(Thread.activeCount());//1

		// now need to create thread using class name prvoius
		tocreateTreadwithName thread1=new tocreateTreadwithName();
		thread1.start();// it will start set alive
		
//		1 Thread-0
//		2 Thread-0
//		3 Thread-0 1to 100
		//now we can set our coustemized name to Terad
		thread1.setName("my first thread");
		//1 my first thread
		//2 my first thread
		
		// to create onther 2nd therad
		tocreateTreadwithName thread2=new tocreateTreadwithName();
		thread2.start();// it will start set alive
		
//		1 Thread-0
//		2 Thread-0
//		3 Thread-0 1to 100
		//now we can set our coustemized name to Terad
		thread2.setName("my second thread thread");
//		1 my first thread
//		1 my second thread thread
		
//		2 my second thread thread
//		3 my second thread thread
//		2 my first thread
	}
}
