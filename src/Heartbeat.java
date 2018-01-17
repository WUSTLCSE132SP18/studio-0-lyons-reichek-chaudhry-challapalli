
public class Heartbeat {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		long time = 0;
		
		while(true){
			
			try{
				Thread.sleep(1000);
				time = (System.currentTimeMillis() - startTime) / 1000;
				System.out.println(time + " sec have elapsed");
			}
			catch(InterruptedException e){
				
			}
		}

	}

}
