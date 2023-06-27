package ClassDefinition;

public class SIM {
	
	public int Number;
	public int Credit;
	public Calls[] List = {new Calls (4, 34589768),
			new Calls (3, 34567896),
			new Calls (5,38756748),
			new Calls (8, 38976456),
			new Calls (2,46586122)
	};
	
	public SIM(int Number, int Credit) {
		this.Number = Number;
		this.Credit = 0;
		
	}
	
	
	public  void Data() {
		System.out.println(Number);
		System.out.println(Credit);
		System.out.println(List);
		for(Calls Calls: List) {
			System.out.println(Calls.chiamata + Calls.numero);
		}
	}
}
