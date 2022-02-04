package iterator;

import template.*;

public class Soaper {
	Collection collection;
	public Soaper(Collection collection) {
		this.collection = collection;
	}
	
	public void makeSoap() {
		Iterator iterator = collection.createIterator();
		makeSoap(iterator);
	}
	private void makeSoap(Iterator iterator) {
		while(iterator.hasNext()) {
			
			Soap soap = iterator.next();
			soap.prepare();
			
			
		}
	}
	
}
