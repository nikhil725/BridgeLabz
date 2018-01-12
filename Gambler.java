import java.util.*;
public class Gambler{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number of stake");
	int stake = in.nextInt();
	System.out.println("Enter the number of goal");
	int goal = in.nextInt();
	System.out.println("Enter the number of times");
	int number = in.nextInt();
	int stakeLoss=0;
	int stakeWin=0;
	for(int i=0; i<number; i++)
	{
		while(stake!= goal)
		{
			if(Math.random() < 0.5)
			{
				stake-= 2;
			}else{
				stake+= 2;
			}
			if(stake==0)
			{
			break;
			}
		}
		if(stake == 0)
		{
			stakeLoss++;
		}else{
			stakeWin++;			
		}
	}
	System.out.println("Stake Win"+stakeWin);
	System.out.println("Stake Loss"+stakeLoss);
}
}
