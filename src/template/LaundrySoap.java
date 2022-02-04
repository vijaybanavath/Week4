package template;

public class LaundrySoap extends Soap {
	
	public LaundrySoap() {
		this.name = "Laundry Soap";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mix() {
		System.out.println("Mix grated soup with boiling water");
		
	}

	@Override
	public void mold() {
		System.out.println("Pour the mixture into container and let it sit");
		
	}

	@Override
	public void melt() {
		System.out.println("Melt grated soup in boiling water");
		
	}

	@Override
	public void stir() {
		System.out.println("After adding borax and washing soda stir the mixture");
		
	}

}
