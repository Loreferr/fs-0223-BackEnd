package Classes;

import java.time.LocalTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ordini {
	private Integer numeroOrdine;
	private StatOrdine Stato;
	private Integer numeroCoperti;
	private LocalTime localTime;
	private Double importoTotale;
	private List<PizzaBase> Pizza;

	public String getOrdiniLine() {
		return "Numero Ordine:" + this.numeroOrdine + "Stato: " + this.Stato + "+ Importo:" + this.importoTotale;
	}

	public void addMeunuItem(PizzaBase item) {
		Pizza.add(item);
		System.out.println("Pizza aggiunta al tuo ordine!!");
	}

}
