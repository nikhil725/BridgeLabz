import java.util.*;

public class Stopwatch{

	public static long startTime = 0;
	public static long stopTime = 0;
	public static long elapsedTime;

	
	public void start()
	{
		startTime = System.currentTimeMillis();
		System.out.println("Start Time is: "+startTime);
	}
	public void stop()
	{
		endTime =System.currentTimeMillis();
		System.out.println("Start Time is: "+stopTime); 
	}
     public static void main(String[] args){
	Stopwatch sp = new Stopwatch();
	Scanner in = new Scanner(System.in);
	System.out.println("Enter  1 for start time");
	int n = in.nextInt();
	sp.start();
	
	System.out.println("Enter  2 for end time");
	int m = in.nextInt();
	sp.stop();
	
	elapsedTime = startTime - stopTime;
	System.out.println("elapsedTime is: "+elapsedTime);  		
	}
}
