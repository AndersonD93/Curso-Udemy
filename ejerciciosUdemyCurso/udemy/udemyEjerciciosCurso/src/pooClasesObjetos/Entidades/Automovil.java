package pooClasesObjetos.Entidades;

import pooClasesObjetos.Enums.ColorEnum;
import pooClasesObjetos.Enums.TipoAutoEnum;

public class Automovil implements Comparable <Automovil> {
	
	private int id; //inicia en cero
	private String fabircante;
	private String modelo;
	private ColorEnum color= ColorEnum.GRIS;
	private Motor motor;
	private Tanque capacidadTanque;
	private Persona conductor;
	private Rueda[] ruedas;
	private int indiceRuedas;
	
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
	this.ruedas=new Rueda[5];
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
	
	public Automovil(String fabircante, String modelo, ColorEnum color, Motor motor) {
		this(fabircante,modelo,color);
		this.motor = motor;
	}
	
	public Automovil(String fab, String modelo, ColorEnum color, Motor motor, Tanque capacidadTanque) {
		this(fab,modelo,color,motor);
		this.capacidadTanque = capacidadTanque;
	}

	public Automovil(String fabircante, String modelo, ColorEnum color, Motor motor, Tanque capacidadTanque,
			Persona conductor, Rueda[] ruedas) {
		this(fabircante,modelo,color,motor,capacidadTanque);
		this.conductor = conductor;
		this.ruedas = ruedas;
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
	
	public Tanque getCapacidadtanque() {
		if (this.capacidadTanque == null) {
			this.capacidadTanque = new Tanque(); 
		}
		return this.capacidadTanque;
	}
	public void setCapacidadtanque (Tanque captanque) {
		this.capacidadTanque= captanque;
	}
	
	public static ColorEnum getColorPatente() {
		return colorPatente;
	}

	public static void setColorPatente(ColorEnum colorPatente) {
		Automovil.colorPatente = colorPatente;
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
	

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Persona getConductor() {
		return conductor;
	}

	public void setConductor(Persona conductor) {
		this.conductor = conductor;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}
	public void addRueda (Rueda rueda) {
		if (indiceRuedas<this.ruedas.length) {
		this.ruedas[indiceRuedas++]=rueda;
		}
	}
		

	public String verDetalle() {
		
		String detalle=	"auto.id :" + this.id +
				"\nauto.fabricante :"+ this.getFabricante() +
				"\nauto.modelo :"+ this.getModelo();
		
				if (this.getTipo()!= null) { //por si el tipo de vehiculo es null
				detalle +="\nauto.TipoAuto :"+ this.getTipo().getDescripcion();}
				
				detalle +="\nauto.color :"+ this.color;
				
				if(this.getMotor()!=null) {// omitir si el tipo de motor es null
				detalle +="\nauto.motor :"+ this.getMotor().getTipoMotor()+
				"\nauto.cilindrada :"+ this.motor.getCilindrada();}
				
				detalle +="\nauto.patenteColor :"+ Automovil.colorPatente;//por ser estatica
				
				if(this.getConductor()!=null) {	
				detalle +="\nauto.conductor :"+ this.getConductor();}
				
				if(this.getRuedas()!=null) {
					detalle +="\nauto.getRuedas :";
					for (Rueda r: this.ruedas) {
						detalle +="[Marca :" + r.getMarca()+" aro :" +r.getAro()+ " ancho :"+r.getAncho()+" ]";	
					}		
				}
				
				detalle +="\n-----------------------------";
				
		return detalle;
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
		return km/(porcentajeGasolina*this.getCapacidadtanque().getCapacidad());
	}
	public double calcularConsumo (int km, int porcentajeGasolina) {
		return km/((porcentajeGasolina/100f)*this.getCapacidadtanque().getCapacidad());
	}
	
	public static double calcularConsumoEstatico (int km, int porcentajeGasolina) {
		return km/((porcentajeGasolina/100f)*Automovil.capacidadTanqueEstatico);
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
		return "Automovil [id=" + id + ", fabircante=" + fabircante + ", modelo=" + modelo  + " conductor=" + conductor + "]";
	}

	@Override
	public int compareTo(Automovil a) {
		return this.fabircante.compareTo(a.fabircante);
	}

	
	
	
	
	}

