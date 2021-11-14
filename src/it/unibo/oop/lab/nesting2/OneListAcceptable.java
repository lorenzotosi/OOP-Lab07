package it.unibo.oop.lab.nesting2;

import java.util.Iterator;
import java.util.List;

public class OneListAcceptable <T> implements Acceptable<T>{

	List<T> l1;
	
	public OneListAcceptable(List<T> l1) {
		this.l1 = l1;
	}

	public Acceptor<T> acceptor() {
		Iterator<T> it = l1.iterator();
		
		
		return new Acceptor<T>() {
			public void accept(T newElement) throws ElementNotAcceptedException {
				try {
					if(!newElement.equals(it.next())) {}
				} catch (Exception e) {
					throw new ElementNotAcceptedException(newElement);
				}
			}
			
			public void end() throws EndNotAcceptedException {
				if(it.hasNext()) {
					throw new EndNotAcceptedException();
				}
			}
			
		};
	}

}
