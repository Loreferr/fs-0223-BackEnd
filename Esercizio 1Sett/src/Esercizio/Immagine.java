package Esercizio;

public class Immagine extends Elemento_Multimediale implements Luminosita{
	private int luminositá;
	public Immagine(String titolo, int luminositá) {
		super(titolo);
		this.luminositá = luminositá;
		
		
	}
	
	
	
	
	public void Show() {
		
			System.out.println(getTitolo());
			for (int j = 0; j < luminositá; j++) {
				System.out.println("*");
				
			}
		}
	

	@Override
	public void aumentaLuminositá() {
		System.out.println(luminositá += 1);
		
	}

	@Override
	public void abbassaLuminositá() {
		System.out.println(luminositá -= 1);
		
	}

}
