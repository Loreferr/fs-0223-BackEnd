package Lesson3;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Joao";
		String str2 = "Mario";
		int Anno = 1995;
		System.out.println(stringaPariDispari(str1));
		System.out.println(stringaPariDispari(str2));
		System.out.println(annoBisestile(Anno));
		metodoSwitch();
		metodoWhile();
		metodoFor();
		

	}
	
	
	
	public static boolean stringaPariDispari(String str) {
		int lunghezza = str.length();
		if(lunghezza % 2 == 0) {
		return true;} else {
			return false;
		}
	}
	
	public static boolean annoBisestile(int year){
		
		if(year % 4 == 0 || year % 100 == 0 && year % 400 == 0) {
			return true;
		} else { return false;
	}
		

}
	
	public static void metodoSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un Numero");
		int x = sc.nextInt();
		
		
		switch(x) {
		case  0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("uno");
			break;
		case 2:
			System.out.println("due");
			break;
		case 3:
			System.out.println("tre");
			break;
		default:
			System.out.println("succhia");
		}
	}
	
	public static void metodoWhile() {
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		
			do{
				
				System.out.println("Inserisci una Stringa");
				x = sc.nextLine();
				String[] CharArray = x.split("");
				String CharArrayS = CharArray.toString().join(",", CharArray);
				System.out.println(CharArrayS);
			} while(!x.equals(";q"));
		
		
			
	}
	
	public static void metodoFor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci una Numero");
		int x = sc.nextInt();
		for(int i=x; i>= 0; i--) {
			System.out.println(i);
		}
	}

}
