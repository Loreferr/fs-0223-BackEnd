package Esercizio;

public class Video extends Elemento_Multimediale implements VolumeRocker,Luminosita{
	private int luminositá;
	private int volume;
	private int durata;
	public Video(String titolo, int durata, int luminositá, int volume) {
		super(titolo);
		this.luminositá = luminositá;
		this.volume = volume;
		this.durata = durata;
	}
	
	public void Play() {
		System.out.println("Play" + getTitolo());
		for (int i = 0; i < durata; i++) {
			System.out.println(getTitolo());
			for (int j = 0; j < volume; j++) {
				System.out.println("!");
				for (int j2 = 0; j2 < luminositá; j2++) {
					System.out.println("*");
				}
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
	@Override
	public void aumentaLuminositá() {
		System.out.println(luminositá += 1);
		
	}
	@Override
	public void abbassaLuminositá() {
		System.out.println(luminositá -= 1);
		
	}
	
	
}
