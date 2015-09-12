package codes;
public class myStringFunc {
	static class ListNode{
		char value;
		ListNode next;
		
		public ListNode(char s){
			value =s;
		}
	}
	
	public ListNode rmDuplicate(ListNode head){
		if(null == head)
			return head;
		if(null == head.next)
			return head;
		ListNode pt1, pt2, runner;
		
		pt1 = head;
		pt2 =head.next;
		while(pt2.next != null){
			runner  = head;
			while (runner != pt2){
				if(runner.value == pt2.value){
					ListNode temp = pt2.next;
					pt1.next= temp;
					pt2 = temp;
					break;
				}
				runner = runner.next;
			}
			if(runner == pt2){
				pt1 = pt2;
				pt2 = pt2.next;
			}	
		}
		return head;
	}
	
	public myStringFunc(){
		
	}
	
	public String rmDuplicate(String str){
		if(null == str)
			return str;
		int len = str.length();
		if(len <= 1)
			return str;
		int i, j, tail =1;
		char []temp= str.toCharArray();
		for (i =0;i<len; i++){
			for (j =0; j <tail; j++){
				if(temp[i]== temp[j])
					break;
			}
			if(j == tail){
				temp[tail]= temp[i];
				tail++;
			}
		}
		return (new String(temp,0, tail));
	}
	
	

	public static void main(String args[]){
		String a = "asajkdhbqwheasdhjhjhhsdj";
		myStringFunc msf = new myStringFunc();
		System.out.println(msf.rmDuplicate(a));
		
	}
	
}
