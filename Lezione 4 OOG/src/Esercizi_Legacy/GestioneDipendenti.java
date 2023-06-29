package Esercizi_Legacy;

public class GestioneDipendenti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dipendente ErPupone = new Dipendente(001,Dipartimento.Produzione);
		Dipendente LeleAdani = new Dipendente(002,Dipartimento.Produzione);
		Dipendente Bobo = new Dipendente(003, 1300, 30,Livello.Impiegato, Dipartimento.Amministrazione);
		Dipendente TotoCassano = new Dipendente(004, 1500, 40,Livello.Dirigente, Dipartimento.Vendite);
		
		Bobo.Promuovi();
		Bobo.stampaDatiDipendente();
		
		System.out.println(Dipendente.CalcolaPaga(Bobo, 5) +
				(Dipendente.CalcolaPaga(TotoCassano, 5)) +
				(Dipendente.CalcolaPaga(LeleAdani , 5)) +
				(Dipendente.CalcolaPaga(ErPupone, 5))
				);
//		ErPupone.stampaDatiDipendente();
//		Bobo.stampaDatiDipendente();
//		System.out.println(ErPupone);
		
	}
	

}
