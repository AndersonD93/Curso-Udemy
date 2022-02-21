package pooClasesObjetos;

public enum TipoAutoEnum {
	
	SEDAN ("Sedan","Automediano",4),
	HACTCHBAKC ("Hatchback","Auto compacto",2),
	COUPUE ("Copue","Auto pequeño",2),
	PICKUP("Pickup","Camioneta",4),
	CONVERTIBLE("Convertible","Auto deportivo",2),
	SUV ("Suv", "Camioneta",5),
	FURGON("Furgon","Auto Utilitario",4);
	
	private final String nombre;
	private final int numeroPuertas;
	private final String descripcion;
	
	private TipoAutoEnum(String nombre,  String descripcion, int numeroPuertas) {
		this.nombre = nombre;
		this.numeroPuertas = numeroPuertas;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	

	


}
