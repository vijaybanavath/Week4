package template;

public abstract class Soap {
	String name;
	public void prepare() {
		System.out.println("Preparing " + this.name);
		System.out.println("=======================");
		mix();
		mold();
		melt();
		stir();
		System.out.println("");
	}
	public abstract void mix();
	public abstract void mold();
	public abstract void melt();
	public abstract void stir();
	public String toString() {
		return name;
	}
}
