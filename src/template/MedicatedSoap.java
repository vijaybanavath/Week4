package template;

public class MedicatedSoap extends Soap{
	
	public MedicatedSoap() {
		this.name = "Medicated Soap";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mix() {
		System.out.println("Mix 2 cups glycerin soap base and 2 tablespoon tea tree oil");
		
	}

	@Override
	public void mold() {
		System.out.println("Pour the medicated soap into molds");
		
	}

	@Override
	public void melt() {
		System.out.println("Melt the mixture until fully melted");
		
	}

	@Override
	public void stir() {
		// TODO Auto-generated method stub
		System.out.println("Stir the mixture");
	}

}
