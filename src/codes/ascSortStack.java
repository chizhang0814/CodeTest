package codes;

import java.util.*;
public class ascSortStack extends Stack<Integer> {	
	public void ascSortStack(){
		
	}
	
	public Stack<Integer> ascSort(Stack<Integer> s){
		Stack<Integer> r = new Stack<Integer>();
		while(! s.isEmpty()){
			int temp = s.pop();
			while(r.peek()>temp && (!r.isEmpty())){
				s.push(r.pop());
			}
			r.push(temp);
		}
		return r;
	}
}
