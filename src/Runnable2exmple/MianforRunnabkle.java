package Runnable2exmple;

import Threadcreation.tocreateTreadwithName;

public class MianforRunnabkle {
	public static void main(String[] args) {
		
		/// we can create same as 1stway either we can use 
		// we can only pass class name for simple tahread creation
// firstthread
		Thread thread10= new Thread(new twondwayRunnable ());
		thread10.start();
//second thread
		Thread thread100= new Thread(new twondwayRunnable ());
		thread100.start();
// third thread with implention for implntion we can pas class and interface both any one
				// below both works we can pass class name also and Runnbale interafce
		//Thread thread11=new Thread(new  twondwayRunnable () {// Thread class one construvcte which will take Runnable as argumnet
		Thread thread11=new Thread(new  Runnable () {
		// automatically below body gives by Runnable
			@Override
			public void run() {
				
				int i=1;
				while(i<=100) {
					
					
				
					System.out.println(i+" "+Thread.currentThread().getName());
					i++;
				}
			}
		});thread11.start();
		
		}
	
		
}
		
		
//		
//		
//		
//		System.out.println(Thread.activeCount());//1
//
//		// now need to create thread using class name prvoius
//		tocreateTreadwithName thread1=new tocreateTreadwithName();
//		thread1.start();// it will start set alive
//		
////		1 Thread-0
////		2 Thread-0
////		3 Thread-0 1to 100
//		//now we can set our coustemized name to Terad
//		thread1.setName("my first thread");
//		//1 my first thread
//		//2 my first thread
//		
//		// to create onther 2nd therad
//		tocreateTreadwithName thread2=new tocreateTreadwithName();
//		thread2.start();// it will start set alive
//		
////		1 Thread-0
////		2 Thread-0
////		3 Thread-0 1to 100
//		//now we can set our coustemized name to Terad
//		thread2.setName("my second thread thread");
//		
//}

