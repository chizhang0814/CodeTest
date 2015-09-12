package codes;
public class myFibo {
	public static int getFibo(int n){
		int res =0;
		if(0==n){return 0;}
		if(1==n){return 1;}
		if(n>1){res =getFibo(n-1)+getFibo(n-2);}
		return res;
	}
	
	public static void main(String args[]){
		for(int i =0; i<10;i++){
			System.out.println(getFibo(i));
		}
	}
}
