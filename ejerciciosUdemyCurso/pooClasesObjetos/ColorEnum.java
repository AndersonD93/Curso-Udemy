package pooClasesObjetos;

public enum ColorEnum {
	
	ROJO("Rojo"),
	AMARILLO("Amarillo"),
	AZUL("Azul"),
	BLANCO("Blanco perla"),
	GRIS("Gris Oscuro"),
	NARANJA("Naranja chipote");
	
	private final String color;

	private ColorEnum(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	public String toString() {
	return this.color;	
	}
	
	

}
