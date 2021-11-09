package it.unibo.oop.lab.nesting2;

import java.util.List;

public class OneListAcceptable <T> implements Acceptable<T>{

	List<T> l1;
	
	public OneListAcceptable(List<T> l1) {
		this.l1 = l1;
	}

	public Acceptor<T> acceptor() {
		

		
		return new Acceptor<T>() {
			
			private int i=0;
			
			public void accept(T newElement) throws ElementNotAcceptedException {
				i++;
				if(!l1.contains(newElement)) {
					throw new ElementNotAcceptedException(newElement);
				}
			}
			
			public void end() throws EndNotAcceptedException {
				if(l1.size()!=i) {
					throw new EndNotAcceptedException();
				}
			}
			
		};
	}

}
