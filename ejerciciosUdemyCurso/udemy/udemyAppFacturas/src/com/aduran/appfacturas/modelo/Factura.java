package com.aduran.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aduran.appfacturas.MainFacturas;

public class Factura {
	
	private int id;
	private String descripcion;
	private Date fecha;
	private Cliente cliente;
	private ItemFactura []items;
	private int indiceItems;
	private static int indiceUltimoId;
	
	

	
	public Factura(String descripcion, Cliente cliente) {
		super();
		this.descripcion = descripcion;
		this.cliente = cliente;
		this.items=new ItemFactura[MainFacturas.itemsARegistrar];
		this.id=++indiceUltimoId;
		this.fecha= new Date();
		
	}
	public int getId() {
		return id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ItemFactura[] getItems() {
		return items;
	}
	public void addItemFactura (ItemFactura item) {
		if (indiceItems<MainFacturas.itemsARegistrar) {
			this.items[indiceItems++]= item;	
		}
	}
	
	public float calcularTotal () {
		float total=0.0f;
		for(ItemFactura items: this.items) {
			if(items ==null) {
				continue;
			}
			total+=items.calcularImporte();
		}
		return total;	
	}
	
	public String generarDetalle() {
		SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
		StringBuilder sb= new StringBuilder("Factura N :");
		sb.append(id)
			.append("\nCliente: ")
			.append(this.cliente.getNombre())
			.append("\t NIT :")
			.append(cliente.getRut())
			.append("\nFecha Emisión : ")
			.append(df.format(this.fecha))
			.append("\n Descripcion :")
			.append(this.descripcion)
			.append("\n")
			.append("\n#\tNombre\t\t$\tCant.\tTotal\n")
		
			.append("\n");
		
		for (ItemFactura item: this.items) {
			if (item==null) {
				continue;
			}
			sb.append(item.toString())
				.append("\n");
		}
			sb.append("\nGranTotal :")
				.append(calcularTotal());
		
		return sb.toString();
		
	}
	@Override
	public String toString() {
		return generarDetalle();
	}
	
	
}
