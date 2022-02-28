package com.aduran.poosobrecarga;
import static com.aduran.poosobrecarga.Calculadora.*;

public class Sobrecarga {

	public static void main(String[] args) {
		
		
		
		System.out.println("sumar int : "+ sumar(10, 5));
		System.out.println("sumar float :"+sumar(10.0f, 5f));
		System.out.println("sumar f+i : "+ sumar(10f, 5));
		System.out.println("sumar i+f :"+ sumar(5f, 10));
		System.out.println("sumar String:"+ sumar("10","5"));
		System.out.println("sumar long: "+ sumar(10l, 5l));
		System.out.println("sumar 4 o mas argumentos: "+ sumar(4,5,6,7,8));
		System.out.println("sumar 1er float+ n int:" +sumar(10.2f,2,3,4,5,6));
		System.out.println("sumar muchos doubles:"+ sumar(4.0,9.8+6.3+7.3));
	}

}
