package ClassDefinition;

public class Rettangolo {
	public int Altezza;
	public int Larghezza;
	
	
	
	
	public  Rettangolo(int Altezza, int Larghezza) {
		this.Altezza = Altezza;
		this.Larghezza = Larghezza;
	}
	
	
	
	public int Area() {
		return  Altezza * Larghezza;
	}
	
	
	public int Perimetro() {
		return  2*(Altezza + Larghezza);
	}
	
	public void StampaRettangolo() {
		System.out.println(Area());
		System.out.println(Perimetro());
	}
	
	public static void StampaDoppioRettangolo(Rettangolo R1, Rettangolo R2) {
		int SommaA = R1.Area() + R2.Area();
		int SommaP = R1.Perimetro() + R2.Perimetro();
		System.out.println(R1.Area());
		System.out.println(R2.Area());
		System.out.println(SommaA);
		System.out.println(SommaP);
		
	}

}

