package com.aduran.poosobrecarga;

public class Calculadora {
	
	//con constructor private obligo a que la clase no se pueda instanciar 
	private Calculadora() {
		
	}
	
	public static int sumar(int a, int b) {
		return a+b;
		
	}
	
	public static int sumar(int ... argumentos) {
		int total =0;
		for(int i : argumentos) {
			total +=i;
		}
		return total;
	}
	
	public static float sumar(float a, int... argumentos) {
		float total =a;
		for(int i : argumentos) {
			total +=i;
		}
		return total;
	}
	public static double sumar(double ... argumentos) {
		double total =0.0;
		for(double i : argumentos) {
			total +=i;
		}
		return total;
	}
	
	public static float sumar(float x, float y) {
		return x+y;
	}

	public static float sumar(int x, float y) {
		return x+y;
		
	}
	public static float sumar(float i, int j) {
		return i+j;
		
	}
	public static double sumar(double i, double j) {
		return i+j;
		
	}
	
	public static int sumar(String i, String j) {
		int resultado;
		try {
			resultado= Integer.parseInt(i)+ Integer.parseInt(j);
			
		} catch (NumberFormatException e) {
			resultado=0;
		}
		return resultado;
	}
		public static int sumar(int a, int b,int c) {
		return a+b+c;
		
	}
	
}
