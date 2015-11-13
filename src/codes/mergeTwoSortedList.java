

public class mergeTwoSortedList {
	public static class ListNode{
		int val;
		ListNode next=null;
		ListNode(int x){
			val =x;
			next=null;
		}
	}
	public static ListNode mergeSort(ListNode A, ListNode B){
		ListNode head;
		ListNode Ahead;
		ListNode Bhead;
		if(A.val<=B.val){
			head=A;
			Ahead =A;
			Bhead =B;
		}
		else{
			head=B;
			Ahead =B;
			Bhead =A;
		}
		
		while((null!=Ahead)&(null!=Bhead)){
			while((Ahead.next!=null)&&(Ahead.next.val<Bhead.val)){
				Ahead = Ahead.next;
			}
			ListNode temp =Ahead.next;
			Ahead.next =Bhead;
			Ahead = Ahead.next;
			Bhead = temp;
		}
		return head;
	}
	
	
	public static ListNode createList(int [] A){
		ListNode Alist =  new ListNode(A[0]);
		ListNode runner = Alist;
		for (int i =1; i<A.length;i++){
			ListNode temp = new ListNode(A[i]);
			runner.next = temp;
			runner = runner.next;
		}
		return Alist;
	}
	
	public static  void printList(ListNode listA){
		while(null!= listA){
			System.out.print(listA.val+" ");
			listA = listA.next;
		}
	}
	public static void main(String [] args){
		int [] A={2, 3, 4, 6 ,8, 10, 15};
		int [] B={4,5,7, 9, 11, 13, 15, 17};
		
		ListNode Alist = createList(A);
		//printList(Alist);
		ListNode Blist = createList(B);
		ListNode mlist = mergeSort(Alist, Blist);
		printList(mlist);
	}

}
