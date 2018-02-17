import java.util.*;

public class PrimFactor{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Number");
	int num = in.nextInt();
	int i =2;
	while(i <= num){
		if(num % i== 0){
		System.out.println(+i+" ");
		num=num/i;
	}else{
	i++;
}
	
	}

	}

}
