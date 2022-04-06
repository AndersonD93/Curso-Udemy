package pooClasesObjetos;

import java.util.Date;

import pooClasesObjetos.Entidades.Automovil;
import pooClasesObjetos.Entidades.Motor;
import pooClasesObjetos.Entidades.Tanque;
import pooClasesObjetos.Enums.ColorEnum;
import pooClasesObjetos.Enums.TipoAutoEnum;
import pooClasesObjetos.Enums.TipoMotorEnum;

public class AutomovilMainStatic {

	public static void main(String[] args) {
		
		Automovil.setColorPatente(ColorEnum.ROJO); //cambia para todos los objetos
		//Automovil.setCapacidadTanqueEstatico(35);//cambia para todos los objetos
		
		Automovil subaru = new Automovil("Subaru","Impreza");

		subaru.setMotor(new Motor(1.6,TipoMotorEnum.CORRIENTE));
		subaru.setColor(ColorEnum.AZUL);
		subaru.setTipo(TipoAutoEnum.HACTCHBAKC);
		
		
		Automovil mazda = new Automovil("Mazda","BT",ColorEnum.BLANCO,new Motor(2.0,TipoMotorEnum.DIESEL));
		mazda.setTipo(TipoAutoEnum.SEDAN);
		
		Date fecha= new Date();
		

		Automovil nissan = new Automovil("Nissan","Navara",ColorEnum.NARANJA,new Motor(1.6,TipoMotorEnum.DIESEL),new Tanque());
		nissan.setTipo(TipoAutoEnum.CONVERTIBLE);
		Automovil nissan2 = new Automovil("Nissan","Navara",ColorEnum.GRIS,new Motor(1.6,TipoMotorEnum.DIESEL),new Tanque(35));
		nissan2.setTipo(TipoAutoEnum.CONVERTIBLE);
		Automovil auto =new Automovil();

		
		Automovil hyunday = new Automovil("Hyunday","i25",ColorEnum.GRIS,new Motor(1.6,TipoMotorEnum.CORRIENTE),new Tanque(65));
		hyunday.setTipo(TipoAutoEnum.SUV);
		System.out.println("Vel maxima carr"+Automovil.VELOCIDAD_MAX_CARRETERA);
		System.out.println("Vel maxima ciudad"+Automovil.VELOCIDAD_MAX_CIUDAD);
		System.out.println(subaru.verDetalle());
		System.out.println(mazda.verDetalle());
		System.out.println(nissan.verDetalle());
		System.out.println(nissan2.verDetalle());
		System.out.println(hyunday.verDetalle());
		System.out.println("Automovil.getColorPatente () = "+ Automovil.getColorPatente());
		System.out.println("KM por lts ="+Automovil.calcularConsumoEstatico(300, 60));
	
		System.out.println("El tipo del auto " + subaru.getFabricante()+" es :"+subaru.getTipo().getNombre());
		System.out.println("La descripción del auto es :"+subaru.getTipo().getDescripcion());
		System.out.println("El numero de puertas del auto es :"+subaru.getTipo().getNumeroPuertas());
		
	}

}
