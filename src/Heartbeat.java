
public class Heartbeat {

	public static void main(String[] args) {
		float time = 0;
		while(true){
			
			try{
				Thread.sleep(1000);
				time += System.currentTimeMillis() / 1000F;
				System.out.println(time + " sec have elapsed");
			}
			catch(InterruptedException e){
				
			}
		}

	}

}
