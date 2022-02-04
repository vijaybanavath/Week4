package iterator;
import java.util.List;
import java.util.ArrayList;
import template.Soap;

public class SoapIterator implements Iterator{
	List<Soap> soapItems;
	int pos = 0;
	
	public SoapIterator(List<Soap> soapItems) {
		this.soapItems = soapItems;
	}

	@Override
	public Soap next() {
		// TODO Auto-generated method stub
		return soapItems.get(pos++);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return soapItems.size() > pos;
	}

}
