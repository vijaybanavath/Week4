package iterator;
import iterator.Iterator;
import template.Soap;

import java.util.*;

public class  SoapCollection implements Collection{
	List<Soap> soapItems;
	
	public SoapCollection() {
		soapItems = new ArrayList<Soap>();
	}
	public void set(Soap soap) {
		soapItems.add(soap);
	}

	public Iterator createIterator() {
		return new SoapIterator(soapItems);
	}
}
