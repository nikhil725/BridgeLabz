public class Prime{
	public static void main(String[] args){
		int count=0;
		for(int i=1; i<=20; i++){
			if(20%i==0){
			count++;
		}
		}
	
	if(count == 2){
	System.out.println("Is a prime");
	}else{
	System.out.println("Is not prim");	
	}
}
}
