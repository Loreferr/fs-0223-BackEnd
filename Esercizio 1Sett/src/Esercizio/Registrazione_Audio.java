package Esercizio;

public class Registrazione_Audio extends Elemento_Multimediale implements VolumeRocker{
	private int volume;
	private int durata;
	public Registrazione_Audio(String titolo, int durata, int volume) {
		super(titolo);
		this.volume = volume;
		this.durata = durata;
		
	}
	
	
	public void Play() {
		System.out.println("Play Audio" + getTitolo());
		for (int i = 0; i < durata; i++) {
			System.out.println(getTitolo() + "");
			for (int j = 0; j < volume; j++) {
				System.out.println("!");
			}
		}
	}

	@Override
	public void abbassaVolume() {
		System.out.println(volume -= 1);
		
	}

	

	
	@Override
	public void alzaVolume() {
		System.out.println(volume += 1);
		
	}
	
}
