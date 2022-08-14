package DeadlockAvoid;

public class Kitchen {
// we have two threads both threads want ame resuoesr or same object so that time both will be block 
	// is called dead lock
	// two objects
	public static Object Spoon=new Object();
	public static Object Bowl=new Object();
	public static void main(String[] args) {
		// we have thread threads cook1 cook2 both want samne spoon and bowl we need to make 
		// both should gat intemwmntion and avoid coolsions
		Thread cook1=new Thread(()->{
			// now need  create which objcet need to montor that using 
			// oter Thread get know he is using that object
			synchronized(Spoon) {
				System.out.println("cook1 : holding spoon");
				System.out.println(" cook1 : waiting for bowl");
				// need to make onther Synchrnizeed sblock for object
				synchronized(Bowl) {
					System.out.println("cook1 : holding spoon and bowl s");
				}
			}
		});
		Thread cook2=new Thread(()->{
			synchronized(Spoon) {// here iam repalcinf bowl with spoon make sure that fic deadlock
				System.out.println("cook2 : holding  bowl");
				System.out.println(" cook2 : waiting for spoon");
				synchronized(Bowl) {// here repalcd with Spoon
					System.out.println("cook2 : holding bowl andspoon s");
				}
			}
		});
		// need start threads otherwise it will not give ouput
           cook1.start();
        cook2.start();
        // every time its gining diffrent results we need fix
//		//cook1 : holding spoon    cook2 : holding  bowl
//        cook2 : waiting for spoon
//        cook1 : holding spoon
//         cook1 : waiting for bowl

//		 cook1 : waiting for bowl
//		 cook2 : holding  bowl
//		  cook2 : waiting for spoon
//
}
	// after reaplcing with same object 
//	cook1 : holding spoon
//	 cook1 : waiting for bowl
//	cook1 : holding spoon and 3.
	bowl s
//	cook2 : holding  bowl
//	 cook2 : waiting for spoon
//	cook2 : holding bowl and spoon s

}
