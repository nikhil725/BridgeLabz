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
	double random = Math.random();
	for(int i=0; i<number; i++)
	{
		while(stake!= goal)
		{
			if(random <= 0.5)
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
	double perc_of_win =  stakeWin*100/number;
	double perc_of_loss = stakeLoss*100/number;
	System.out.println("Stake Win "+stakeWin+"  Times..., And Number of percentage of win is  "+perc_of_win);
	System.out.println("Stake Loss"+stakeLoss+"  Times..., And Number of percentage of Loss is  "+perc_of_loss);
}
}
