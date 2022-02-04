package test;

import iterator.Iterator;
import iterator.SoapCollection;
import iterator.Soaper;
import template.LaundrySoap;
import template.MedicatedSoap;
import template.NoveltySoap;
import template.Soap;

public class IteratorTests {

	public static void main(String[] args) {
		Soap laundrySoap = new LaundrySoap();
		Soap medicatedSoap = new MedicatedSoap();
		Soap noveltySoap = new NoveltySoap();
		SoapCollection collection = new SoapCollection();
		collection.set(noveltySoap);
		collection.set(medicatedSoap);
		collection.set(laundrySoap);
		
		Iterator iter = collection.createIterator();
		
		if(iter.hasNext()) {
			System.out.println("Iterator Test Passed");
		}
		else {
			System.out.println("Iterator test Failed");
		}


	}

}
