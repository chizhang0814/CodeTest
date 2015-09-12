package codes;
import java.util.*;
public class StackWithMin extends Stack<Integer>{
	Stack <Integer> minStack;
	 public StackWithMin (){
		 minStack  = new Stack<Integer>();
	 }
	 
	 public int min(){
		 if(minStack.isEmpty())
			 return Integer.MAX_VALUE;
		 else
			 return minStack.peek();
	 }
	 
	 public void push(int data){
		 
		 if(data < min()){
			 minStack.push(data);
		 }
		 super.push(data);
	 }
	 
	 public Integer pop(){
		 int temp = super.pop();
		 if(temp == min()){
			 minStack.pop();
		 }
		 return temp;
	 }	
}
