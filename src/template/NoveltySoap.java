package template;

public class NoveltySoap extends Soap {
	
	public NoveltySoap() {
		this.name = "Novelty Soap";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mix() {
		System.out.println("Mix Fragrance oil with soap base");
		
	}

	@Override
	public void mold() {
		System.out.println("Pour the mixure into mold");
		
	}

	@Override
	public void melt() {
		System.out.println("Melt the soap base");
		
	}

	@Override
	public void stir() {
		System.out.println("Add dye and Fragrance and stir");
		
	}

}
