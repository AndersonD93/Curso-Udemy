package pooClasesObjetos;

import java.util.Arrays;
import java.util.Date;

import pooClasesObjetos.Entidades.Automovil;
import pooClasesObjetos.Entidades.Motor;
import pooClasesObjetos.Entidades.Persona;
import pooClasesObjetos.Entidades.Rueda;
import pooClasesObjetos.Entidades.Tanque;
import pooClasesObjetos.Enums.ColorEnum;
import pooClasesObjetos.Enums.TipoAutoEnum;
import pooClasesObjetos.Enums.TipoMotorEnum;

public class AutomovilMainArreglo {

	public static void main(String[] args) {
		
		Automovil subaru = new Automovil("Subaru","Impreza");
		Persona conductorsubaru = new Persona ("Anderson", "Duran");
		Persona conductormazda = new Persona ("Jenny", "Solano");
		Persona conductornissan = new Persona ("Luis", "Durán");
		Persona conductoraudi = new Persona ("Marta", "Sepulveda");
		
		
		subaru.setMotor(new Motor(1.6,TipoMotorEnum.CORRIENTE));
		subaru.setColor(ColorEnum.AZUL);
		subaru.setTipo(TipoAutoEnum.HACTCHBAKC);
		subaru.setConductor(conductorsubaru);
		//subaru.setRuedas(ruedaSubaru);
	
		
		Automovil mazda = new Automovil("Mazda","BT",ColorEnum.BLANCO,new Motor(2.0,TipoMotorEnum.DIESEL),new Tanque());
		mazda.setTipo(TipoAutoEnum.SEDAN);
		mazda.setConductor(conductormazda);
		
		

		Automovil nissan = new Automovil("Nissan","Navara",ColorEnum.NARANJA,new Motor(1.6,TipoMotorEnum.DIESEL),new Tanque());
		nissan.setTipo(TipoAutoEnum.CONVERTIBLE);
		nissan.setConductor(conductornissan);


		Automovil susuky = new Automovil("Susuky","Vitara",ColorEnum.GRIS,new Motor(1.6,TipoMotorEnum.DIESEL),new Tanque(35));
		susuky.setTipo(TipoAutoEnum.SUV);
		susuky.setConductor(conductornissan);
		
		Automovil audi = new Automovil("Audi","A3");
		audi.setConductor(conductoraudi);
		
		Automovil[]autos=new Automovil[5];
		autos[0]=subaru;
		autos[1]=mazda;
		autos[2]=nissan;
		autos[3]=susuky;
		autos[4]=audi;
		
		Arrays.sort(autos);
		for (Automovil auto:autos) {
			System.out.println(auto);
		}
		
	}

}
