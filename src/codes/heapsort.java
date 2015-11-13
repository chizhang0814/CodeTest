import java.lang.Math;

public class heapsort {
	
	public static void  heapifyDown(int [] A){
		int st = (A.length-2)/2;
		while (st>=0){
			siftDown(A, st, A.length-1);
			st--;
		}
		return;
	}
	
	public static void siftDown(int [] A, int st, int ed){
		int root = st;
		int swap = root;
		System.out.println("St:"+st+" Ed:"+ed);
		printA(A);
		while (root*2+1<=ed){
			System.out.println("root:"+root);
			int child = root*2+1;
			if (A[root]<A[child])
				swap = child;
			if((child+1<=ed)&&(A[swap]<A[child+1]))
				swap=child+1;
			if(swap ==root)
				return;
			else{
				int temp = A[root];
				A[root]=A[swap];
				A[swap]=temp;
				root = swap;
			}
		}
	}
	
	public static void heapSortDown(int [] A){
		int ed = A.length -1;
		heapifyDown(A);
		System.out.println("After heapify");
		printA(A);
		while(ed>0){
			int temp = A[ed];
			A[ed]= A[0];
			A[0]= temp;
			printA(A);
			ed--;
			siftDown(A, 0, ed);
			printA(A);
		}
		
	}
	

	public static void printA(int [] a){
		for(int i =0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.print('\n');
	}
	public static void main(String args[]){
		int [] a = {1,2,3,1,2,4,12, 3,12,34, 42, 31, 57};
		heapSortDown(a);	
		
	}
	
}
