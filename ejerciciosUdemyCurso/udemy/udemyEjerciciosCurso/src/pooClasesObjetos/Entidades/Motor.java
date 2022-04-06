package pooClasesObjetos.Entidades;

import pooClasesObjetos.Enums.TipoMotorEnum;

public class Motor {

	private double cilindrada;
	private TipoMotorEnum tipoMotor;
	
	
	
	public Motor(double cilindrada, TipoMotorEnum tipoMotor) {
		super();
		this.cilindrada = cilindrada;
		this.tipoMotor = tipoMotor;
	}
	
	
	public Motor() {
	}


	public double getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(double cilindrada) {
		this.cilindrada = cilindrada;
	}
	public TipoMotorEnum getTipoMotor() {
		return tipoMotor;
	}
	public void setTipoMotor(TipoMotorEnum tipoMotor) {
		this.tipoMotor = tipoMotor;
	}
	
	
}
