//package BarrierS;
import java.util.concurrent.Semaphore;

public class Barrier {
	
	// add missing variables
	int n;
	int count;
	Semaphore barrier = new Semaphore(0);
	Semaphore mutex = new Semaphore(1);
	Barrier(int n) {
		// complete this constructor
		this.n = n;
	}
	
	public void b_wait() throws InterruptedException{
		// this is the only additional method you will need to complete
		mutex.acquire();
			count++;
		mutex.release();
		
		if(count ==n){
			barrier.release();
		}
		
		barrier.acquire();
		barrier.release();
	}

}
