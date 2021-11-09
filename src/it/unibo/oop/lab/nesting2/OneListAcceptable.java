package it.unibo.oop.lab.nesting2;

import java.util.ArrayList;
import java.util.List;

public class OneListAcceptable <T> implements Acceptable<T>{

	List<T> l1;
	
	

	public OneListAcceptable(List<T> l1) {
		this.l1 = new ArrayList<>();
	}



	@Override
	public Acceptor<T> acceptor() {
		
		return null;
	}

}
