package codes;
public class reverseLinkedList {
	
	public Node reverseIteration(Node current) {  
	    //initialization  
	    Node previousNode = null;  
	    Node nextNode = null;  
	      
	    while (current != null) {    
	        nextNode = current.next;//save the next node  
	        current.next = previousNode;  //update the value of "next"   
	        previousNode = current; //shift the pointers 
	        current = nextNode;           
	    }  
	    return previousNode;  
	}
	
	public Node reverseRecusive(Node current)  
	 {  
	     if (current == null || current.next == null) return current;  
	     Node nextNode = current.next;  
	     current.next = null;  
	     Node reverseRest = reverseRecusive(nextNode);  
	     nextNode.next = current;  
	     return reverseRest;  
	 }  
	
	class Node {  
	    char value;  
	    Node next;  
	}  
}

