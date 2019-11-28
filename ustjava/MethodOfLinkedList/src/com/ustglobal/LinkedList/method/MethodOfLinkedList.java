package com.ustglobal.LinkedList.method;

import java.util.LinkedList;

public class MethodOfLinkedList {
	
	public static void main(String[] args) {
		LinkedList<Integer> l =new LinkedList<Integer>();
		l.add(12);
		l.add(23);
		l.add(34);
		l.add(25);
		Integer peekElement = l.peek();
		System.out.println("peek element "+peekElement);
		
		Integer peekLast =l.peekLast();
		System.out.println("peek last "+peekLast);
		
		Integer  pollElement =l.poll();
		System.out.println("poll element "+pollElement);
		
		Integer pollFirstElement = l.pollFirst();
		System.out.println("poll first element "+pollFirstElement);
		
		Integer pollLastElement = l.pollLast();
		System.out.println("poll last element "+pollLastElement);
		
		l.push(12);
		System.out.println("after push");
		System.out.println(l);
		Integer p = l.pop();
		System.out.println(p);
		System.out.println("After pop "+l);
	}

}
