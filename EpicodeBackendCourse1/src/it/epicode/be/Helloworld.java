package it.epicode.be;

import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		System.out.println(multiply(5,10));
		
		Scan();
		System.out.println(perimetroRettangolo(5,10));
		System.out.println(pariDispari(5));
		System.out.println(perimetroTriangolo(5,10,15));
		
		}



public static int multiply(int x, int y){
	
	int result = x * y;
	return result;
}

public static String concat(String x, int y) {
	String result = x + y;
	return result;
}





public static void Scan() {
	Scanner sc = new Scanner(System.in);
	System.out.print("inserisci la prima Stringa");
	String Stringa1 = sc.nextLine();
	System.out.print("inserisci la seconda Stringa");
	String Stringa2 = sc.nextLine();
	System.out.print("inserisci la seconda Stringa");
	String Stringa3 = sc.nextLine();
	System.out.println(Stringa1 + Stringa2 + Stringa3);
	
}


public static float perimetroRettangolo(float x,float y) {
	float result = (x + y)*2;
	return result;
}


public static int pariDispari(int x) {
	if(x%2 ==0) {
		return 0;}
		else {return 1;}
}




public static int perimetroTriangolo(float x,float y,float z) {
	float perimetro = x+y+z;
	float AreaResult = (float)Math.sqrt((perimetro - x) * (perimetro - y) * (perimetro - z));
	return (int)AreaResult;
	
	
}


}



