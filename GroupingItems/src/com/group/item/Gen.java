package com.group.item;

import java.util.Stack;

public class Gen<E> {
	Stack<E> s = new Stack<E>();
	
	public void push(E obj) {
		s.push(obj);
	}
	
	E pop() {
		E obj = s.pop();
		return obj;
	}

	
	void checkLater() {
		Gen<String> g = new Gen<>();
		g.push("Hello");
		System.out.println(g.pop());
	}
}
