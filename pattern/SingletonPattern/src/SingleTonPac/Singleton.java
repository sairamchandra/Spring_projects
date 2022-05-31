package SingleTonPac;

public class Singleton {


	public static void main(String[] args) {
		Thread t1= new Thread( new Runnable() {
			public void run() {
				Test unique1=Test.getInstance();
				unique1.show1();
			}
		});
		Thread t2= new Thread( new Runnable() {
			public void run() {
				Test unique1=Test.getInstance();
				unique1.show2();
			}
		});
		t1.start();
		t2.start();

	}


}
class Test{
	public static Test unique;
	private Test() {
		System.out.println("i am  thread");
	}
	public static  Test getInstance() {
		if(unique==null) {
			synchronized(Test.class) {
				if(unique==null) {unique=new Test();
				}
			}
		}

		return unique;
	}
 public void show1() {
	 System.out.println("i am first thread");
	 
 }
 public void show2() {
	 System.out.println("i am Second thread");
	 
 }
}
