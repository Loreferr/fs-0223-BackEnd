package Esercizio;

public class Test {
	private String txt;

	public Test() {
		super();
	}

	public Test(String txt) {

		this.txt = txt;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

	public String Info() {
		return "Info: " + txt;
	}

}
