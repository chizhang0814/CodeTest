package codes;
public class rotateMatrix {
	public rotateMatrix(){
		
	}
	public int[][] rotateRight(int [][] mat){
		int n = mat[0].length;
		for(int layer =0; layer<n/2; layer++){
	        int st = layer;
	        int ed = n-layer-1;
	        int offset;
	        for (int j = st; j<ed; j++){
	            offset = j - st;
	            int temp = mat[layer][j];
	            
	            mat[layer][j] = mat[ed-offset][layer];
	            mat[ed-offset][layer] = mat[ed][ed-offset];
	            mat[ed][ed-offset] = mat[j][ed];
	            mat[j][ed] = temp;
	        }
	    }
	    return mat;
	}
	
	public int[][] rotateLeft(int [][] mat){
		int n = mat[0].length;
		for(int layer =0; layer<n/2; layer++){
	        int st = layer;
	        int ed = n-layer-1;
	        int offset;
	        for (int j = st; j<ed; j++){
	            offset = j - st;
	            int temp = mat[layer][j];
	            
	            mat[layer][j] = mat[j][ed];
	            mat[j][ed]= mat[ed][ed-offset];
	            mat[ed][ed-offset] = mat[ed-offset][layer] ;
	            mat[ed-offset][layer] = temp;
	        }
	    }
	    return mat;
	}

	public static void printMat(int [][] a){
		int n = a[0].length;
		
		for(int i =0; i<n; i++){
			for(int j =0; j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
		
	public static void main (String args[]){
		int [][]a ={{1, 2, 3, 4, 5},{6,7,8,9,10}, {11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		printMat(a);
		System.out.print("\n");
		rotateMatrix rMat = new rotateMatrix();
		int [][] b = rMat.rotateRight(a);
		printMat(b);
		System.out.print("\n");
		printMat(a);
		System.out.print("\n");
		
		b  = rMat.rotateLeft(a);
		printMat(b);
		
		
		
	}
}

