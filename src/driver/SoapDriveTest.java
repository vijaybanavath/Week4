package driver;
import template.*;
import iterator.*;
public class SoapDriveTest {

	public static void main(String[] args) {
		Soap laundrySoap = new LaundrySoap();
		Soap medicatedSoap = new MedicatedSoap();
		Soap NoveltySoap = new NoveltySoap();
		SoapCollection collection = new SoapCollection();
		collection.set(NoveltySoap);
		collection.set(medicatedSoap);
		collection.set(laundrySoap);
		
		Soaper soaper = new Soaper(collection);
		
		soaper.makeSoap();
		

	}

}
