package codes;
import java.util.*;
public class myQueue {
	Stack <Integer> s1, s2;
	 public void myQueue(){
		 s1 = new Stack<Integer>();
		 s2 = new Stack<Integer>();
	 }
	 
	 public void add(int data){
		 s1.push(data);
	 }
	 
	 public int peek(){
		 if(!s2.isEmpty())
			 return s2.peek();
		 while(!s1.isEmpty()){
			 s2.push(s1.pop());
		 }
		 return s2.peek();
	 }
	 
	 public int remove(){
		 if(!s2.isEmpty())
			 return s2.pop();
		 while(!s1.isEmpty()){
			 s2.push(s1.pop());
		 }
		 return s2.pop();
	 }

}
