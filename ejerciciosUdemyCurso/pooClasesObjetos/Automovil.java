package pooClasesObjetos;

public class Automovil {
	
	private int id; //inicia en cero
	private String fabircante;
	private String modelo;
	private ColorEnum color= ColorEnum.GRIS;
	private double cilindrada;
	private int capacidadTanque=40;
	
	private TipoAutoEnum tipo;
	
	
	private static ColorEnum colorPatente = ColorEnum.NARANJA;
	private static int capacidadTanqueEstatico=30; // Igual para todos los objetos 
	private static int ultimoId;
	
	public static final Integer VELOCIDAD_MAX_CARRETERA=120;
	public static final int VELOCIDAD_MAX_CIUDAD=60;
	public static final String COLOR_ROJO="Rojo";
	public static final String COLOR_AMARILLO="Amarillo";
	public static final String COLOR_BLANCO="Blanco";
	
	
	public Automovil () {
	this.id=++ultimoId;	
	}
	
	public Automovil (String fabricante, String modelo) {
		this();
		this.fabircante=fabricante;
		this.modelo= modelo;
	}
	public Automovil(String fabircante, String modelo, ColorEnum color) {
		this(fabircante,modelo);
		this.color = color;
	}
	
	public Automovil(String fabircante, String modelo, ColorEnum color, double cilindrada) {
		this(fabircante,modelo,color);
		this.cilindrada = cilindrada;
	}
	
	public Automovil(String fab, String modelo, ColorEnum color, double cilindrada, int capacidadTanque) {
		this(fab,modelo,color,cilindrada);
		this.capacidadTanque = capacidadTanque;
	}
	

	public String getFabricante() {
		return this.fabircante;
	}
	
	public void setFabricante (String fabricante) {
		this.fabircante= fabricante;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo (String modela) {
		this.modelo= modela;
	}
	
	public ColorEnum getColor() {
		return this.color;
	}
	
	public void setColor (ColorEnum color) {
		this.color= color;
	}	
	
	public double getCilindrada() {
		return this.cilindrada;
	}
	
	public void setCilindrada (double cilindrada) {
		this.cilindrada= cilindrada;
	}
	
	
	public double getCapacidadtanque() {
		return this.capacidadTanque;
	}
	public void setCapacidadtanque (int captanque) {
		this.capacidadTanque= captanque;
	}
	
	public static ColorEnum getColorPatente() {
		return colorPatente;
	}

	public static void setColorPatente(ColorEnum colorPatente) {
		Automovil.colorPatente = colorPatente;
	}
	

	public static int getCapacidadTanqueEstatico() {
		return capacidadTanqueEstatico;
	}

	public static void setCapacidadTanqueEstatico(int capacidadTanqueEstatico) {
		Automovil.capacidadTanqueEstatico = capacidadTanqueEstatico;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TipoAutoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoAutoEnum tipo) {
		this.tipo = tipo;
	}

	public String verDetalle() {
		

		return	"auto.id :" + this.id +
				"\nauto.fabricante :"+ this.fabircante +
				"\nauto.modelo :"+ this.modelo+
				"\nauto.TipoAuto :"+ this.getTipo().getDescripcion()+
				"\nauto.color :"+ this.color+
				"\nauto.cilindrada :"+ this.cilindrada+
				"\nauto.patenteColor :"+ Automovil.colorPatente+//por ser estatica
				"\n-----------------------------";
	}
	
	public String acelerar (int rpm) {
		return "el auto "+ this.fabircante + "acelerando a "+ rpm +" rpm";
	}
	
	public String frenar () {
		return this.fabircante+ " "+ this.modelo +" frenado";
	}
	public String acelerarFrenar (int rpm) {
		String acelerar= this.acelerar(rpm);
		String frenar = this.frenar();
		return acelerar + " " + frenar;
	}
	
	public double calcularConsumo (int km, float porcentajeGasolina) {
		return km/(porcentajeGasolina*this.capacidadTanque);
	}
	
	public static double calcularConsumoEstatico (int km, int porcentajeGasolina) {
		return km/((porcentajeGasolina/100f)*Automovil.capacidadTanqueEstatico);
	}
	
	public double calcularConsumo (int km, int porcentajeGasolina) {
		return km/((porcentajeGasolina/100f)*this.capacidadTanque);
	}

	@Override //sobre escritura del metodo equals para que no compare por la ubicación de memoria sino por fabricante y modelo
	public boolean equals(Object obj) {
		
		if(this==obj) { //compara por referencia, si se trata del mismo objeto
			return true;
		}
		
		if (!(obj instanceof Automovil)) { // si son dos distintos tipos de objetos no se rompa sino retorne un false
			return false;
		}
		Automovil a= (Automovil)obj;	
		return (this.fabircante!=null && this.modelo!= null 
				&& this.fabircante.equals(a.getFabricante())
				&& this.modelo.equals(a.getModelo()));
	}

	@Override
	public String toString() {
		return "Automovil [id=" + id + ", fabircante=" + fabircante + ", modelo=" + modelo + ", color=" + color
				+ ", cilindrada=" + cilindrada + ", capacidadTanque=" + capacidadTanque + "]";
	}

	
	
	
	
	}

