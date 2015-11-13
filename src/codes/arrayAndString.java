
public class arrayAndString {
	
	public static boolean isAllUnique(String str){
		int i=0 , j=1;
		char [] str_a = str.toCharArray();
		
		for(; j<str.length(); j++){
			for(int  k=0; k<=i;k++){
				System.out.println(i+""+j+""+k+""+str_a[j]+""+str_a[k]);
				if (str_a[k]==str_a[j])
					return false;
			}
			i++;

		}
		return true;		
	}
	public static String rmDuplicate(String str){
		int i=0, j =1, k;
		char [] str_a = str.toCharArray();
		for (; j<str_a.length; j++){
			for(k = 0; k<=i; k++){
				if(str_a[k]== str_a[j])
					break;
			}
			if((k-1) == i){
				System.out.println(i);
				str_a[++i]=str_a[j];
			}
		}
		str_a[++i]=0;	
		return String.copyValueOf(str_a);
	}
	
	
	public static void main(String [] args){
		String test = "asdasqwedsfasdas";
		System.out.println(isAllUnique(test));
		System.out.println(rmDuplicate(test));
		test="abcdefg";
		System.out.println(isAllUnique(test));
		
		

	}
}

