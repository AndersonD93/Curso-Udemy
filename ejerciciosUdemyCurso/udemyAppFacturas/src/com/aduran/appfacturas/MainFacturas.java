package com.aduran.appfacturas;

import java.util.Scanner;

import com.aduran.appfacturas.modelo.*;


public class MainFacturas {

	public static int itemsARegistrar;

	public static void main(String[] args) {
		
		
		Cliente cliente = new Cliente();
		
		cliente.setRut(1095932658);
		cliente.setNombre("Anderson Durán");
		
		Scanner teclado= new Scanner(System.in);
		
		System.out.println("Ingrese una descripción de la factura :");
		String desc = teclado.nextLine();
		System.out.println("Cuantos items desea registrar: ");
		itemsARegistrar = teclado.nextInt();
		
		
		Factura factura = new Factura(desc, cliente);
	
		
		System.out.println();
		
		int cantidad;
		for (int i=0;i<itemsARegistrar;i++) {
			Producto producto = new Producto();
			System.out.print("Ingrese nombre de producto No. "+ producto.getCodigo()+ " : ");
			producto.setNombre(teclado.next());
			
			System.out.print("Ingrese el precio de producto : ");
			producto.setPrecio(teclado.nextInt());
			
			System.out.print("Ingrese la cantidad de productos : ");
			cantidad = teclado.nextInt();
			
			ItemFactura item =new ItemFactura(cantidad, producto);
			factura.addItemFactura(item);
			
			System.out.println();
			
		}
			System.out.println(factura);
			teclado.close();
	}	

}
