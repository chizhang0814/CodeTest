package codes;
public class myPrintOdd {
	public static void printOdd(){
		for (int i=1; i<=99; i=i+2)
			System.out.println(i+" ");
	}
	
	static char [] hex = {'0', '1','2', '3','4','5','6','7','8','9','A','B','C','D','E','F'};
	public static String rgbToHex(int [] rgb){
		if(rgb.length!= 3)
			return "RGB format error";
		String hexStr= "";
		for(int c: rgb){
			if(c>255 ||c<0){
				return "RGB format error";
			}
			hexStr += hex[(int) c/16];
			hexStr += hex[(int) c%16];
		}
		return hexStr;
	}
	
	public String formatRGB ( int r, int g, int b ) {
        return (toHex(r) + toHex(g) + toHex(b)).toUpperCase();
    }

    public String toHex ( int c ) {
        String s = Integer.toHexString ( c );
        return ( s.length() == 1 ) ? "0" + s : s;
    }
    
	public static void main (String args[]){
		printOdd();
		int [] rgb = {255,255,255};
		System.out.println(rgbToHex(rgb));
	}
}
