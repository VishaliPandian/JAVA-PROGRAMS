
public class SynMain2{

	public static void main(String[] args) throws InterruptedException {
		PrintTable11 t=new PrintTable11();
		new Thread() {
			public void run() {
				t.multiplicationTable(4);
			}
		}.start();
		
		Thread t2=new Thread() {
			public void run() {
				t.multiplicationTable(2);
			}
		};
		t2.start();
		Thread t3=new Thread() {
			public void run() {
				t.multiplicationTable(5);
			}
		};
		t3.start();

	}
}

class PrintTable11{
	 void multiplicationTable(int num) {
		 synchronized(this) {
		for(int i=1;i<=10;i++) {
			System.out.println(num+"x"+i+"="+num*i +" thread name "+Thread.currentThread());
		}
		 } //still here method is synchronized
		System.out.println("This block is not syncronized "+Thread.currentThread());
	}
}
