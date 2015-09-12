package codes;
public class myReverseStr {
	public static String reverseStr(String str){
		if(null == str){return str;}
		int len  =str.length(); 
		if(len<=1){return str;}
		char [] array = str.toCharArray();
		char temp;		
		for(int i=0; i<(len/2); i++){
			temp = array[i];
			array[i] = array[len-i-1];
			array[len-i-1] = temp;
		}
		return new String(array, 0, len);
	}
	
	public static void main(String args[]){
		String a = "abcdefghijklmn";
		System.out.println(reverseStr(a));
	}

}
