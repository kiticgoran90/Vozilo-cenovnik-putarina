package putarina;

public class Kamion extends Vozilo {
	
	public Kamion(String regBr) {
		super(regBr);
	}
	
	@Override
	public int kategorija() {
		return 2;
	}
}
