package pooClasesObjetos;

import java.util.Date;

import pooClasesObjetos.Entidades.Automovil;
import pooClasesObjetos.Entidades.Motor;
import pooClasesObjetos.Entidades.Persona;
import pooClasesObjetos.Entidades.Rueda;
import pooClasesObjetos.Entidades.Tanque;
import pooClasesObjetos.Enums.ColorEnum;
import pooClasesObjetos.Enums.TipoAutoEnum;
import pooClasesObjetos.Enums.TipoMotorEnum;

public class AutomovilMainRelacionesObjetos {

	public static void main(String[] args) {
		
		Automovil subaru = new Automovil("Subaru","Impreza");
		Persona conductorsubaru = new Persona ("Anderson", "Duran");
		Persona conductormazda = new Persona ("Jenny", "Solano");
		Persona conductornissan = new Persona ("Luis", "Durán");
		
		Rueda [] ruedaSubaru= new Rueda[5];
		for (int i =0; i<ruedaSubaru.length ;i++) {
			subaru.addRueda(new Rueda("Pirelli",17,5.0)); 
		}
		
		
		subaru.setMotor(new Motor(1.6,TipoMotorEnum.CORRIENTE));
		subaru.setColor(ColorEnum.AZUL);
		subaru.setTipo(TipoAutoEnum.HACTCHBAKC);
		subaru.setConductor(conductorsubaru);
		//subaru.setRuedas(ruedaSubaru);
	
		
		Automovil mazda = new Automovil("Mazda","BT",ColorEnum.BLANCO,new Motor(2.0,TipoMotorEnum.DIESEL),new Tanque());
		mazda.setTipo(TipoAutoEnum.SEDAN);
		mazda.setConductor(conductormazda);
		
		Rueda [] ruedaMazda= new Rueda[5];
		for (int i =0; i<ruedaMazda.length ;i++) {
			mazda.addRueda(new Rueda("Pirelli",17,5.0));
		}

		Automovil nissan = new Automovil("Nissan","Navara",ColorEnum.NARANJA,new Motor(1.6,TipoMotorEnum.DIESEL),new Tanque());
		nissan.setTipo(TipoAutoEnum.CONVERTIBLE);
		nissan.setConductor(conductornissan);

		Rueda [] ruedaNissan= new Rueda[5];
		for (int i =0; i<ruedaNissan.length ;i++) {
			nissan.addRueda(new Rueda("Pirelli",17,5.0));
		}
		//nissan.setRuedas(ruedaNissan);
		
		Automovil nissan2 = new Automovil("Nissan","Navara",ColorEnum.GRIS,new Motor(1.6,TipoMotorEnum.DIESEL),new Tanque(35));
		nissan2.setTipo(TipoAutoEnum.CONVERTIBLE);
		nissan2.setConductor(conductornissan);
		
		Rueda [] ruedaNissan2= new Rueda[5];
		for (int i =0; i<ruedaNissan.length ;i++) {
			nissan2.addRueda(new Rueda("Pirelli",17,5.0));
		}
		
		
		//nissan2.setRuedas(ruedaNissan);
		
		Automovil hyunday = new Automovil("Hyunday","i25",ColorEnum.GRIS,new Motor(1.6,TipoMotorEnum.CORRIENTE),new Tanque(65));
		hyunday.setTipo(TipoAutoEnum.SUV);
		System.out.println("Vel maxima carr"+Automovil.VELOCIDAD_MAX_CARRETERA);
		System.out.println("Vel maxima ciudad"+Automovil.VELOCIDAD_MAX_CIUDAD);
		System.out.println(subaru.verDetalle());
		System.out.println(nissan.verDetalle());
		System.out.println(nissan2.verDetalle());
		System.out.println(mazda.verDetalle());
		
		
		/*for (Rueda r: ruedaSubaru) {
			System.out.println("[Marca :" + r.getMarca()+" aro :" +r.getAro()+ " ancho :"+r.getAncho()+" ]" );	
		}*/
	}

}
