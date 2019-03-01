package putarina;

public abstract class Vozilo implements Kategorizovano {
	private String regBr;
	
	public Vozilo(String regBr) {
		this.regBr = regBr;
	}
	
	public String getRegBr() {
		return regBr;
	}
	
	@Override
	public String toString() {
		return regBr + "(" + kategorija() + ")";
	}
}
