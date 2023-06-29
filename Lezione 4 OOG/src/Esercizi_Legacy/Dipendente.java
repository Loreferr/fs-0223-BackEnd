package Esercizi_Legacy;

public class Dipendente {

	

	public double stipendioBase = 1000;
	private double stipendio;
	private int Matricola;
	private double importoOrarioStraordinario;
	private Livello Carica;
	private Dipartimento Settore;
	
	
	public Dipendente(int matricola, Dipartimento settore) {
		
		stipendio = stipendioBase;
		importoOrarioStraordinario = 30;
		Carica = Livello.Operaio;
		Matricola = matricola;
		Settore = settore;
	}
	
	
	public Dipendente(  int matricola,double stipendio, double importoOrarioStraordinario,
			Livello carica, Dipartimento settore) {
		
		
		this.stipendio = stipendioBase;
		Matricola = matricola;
		this.importoOrarioStraordinario = importoOrarioStraordinario;
		Carica = carica;
		Settore = settore;
	}
	
	
	public void stampaDatiDipendente() {
		System.out.println(getMatricola());
		System.out.println(getStipendio());
		System.out.println(getCarica());
		System.out.println(getImportoOrarioStraordinario());
		System.out.println(getSettore());
	}
	
	public Livello Promuovi() {
		if(this.Carica == Livello.Operaio) {
			this.Carica = Livello.Impiegato;
			this.stipendio = stipendioBase *1.2;
		} else if (this.Carica == Livello.Impiegato) {
			this.Carica = Livello.Quadro;
			this.stipendio = stipendioBase *1.5;
		} else if (this.Carica == Livello.Quadro) {
			this.Carica = Livello.Dirigente;
			this.stipendio = stipendioBase *2;
		} else {
			System.out.println("Hai gia la Carica Massima");
		}
		return this.Carica;
	}
	
	public static double CalcolaPaga(Dipendente x) {
		return x.stipendio;
	}
	
	public static double CalcolaPaga(Dipendente x, int xd) {
		return x.stipendio + x.importoOrarioStraordinario * xd;
	}
	
	


	public double getImportoOrarioStraordinario() {
		return importoOrarioStraordinario;
	}
	public void setImportoOrarioStraordinario(double importoOrarioStraordinario) {
		this.importoOrarioStraordinario = importoOrarioStraordinario;
	}
	public Dipartimento getSettore() {
		return Settore;
	}
	public void setSettore(Dipartimento settore) {
		Settore = settore;
	}
	public double getStipendioBase() {
		return stipendioBase;
	}
	public double getStipendio() {
		return stipendio;
	}
	public int getMatricola() {
		return Matricola;
	}
	public Livello getCarica() {
		return Carica;
	}
	
	
	
}