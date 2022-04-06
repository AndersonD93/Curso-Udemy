package pooClasesObjetos;

import java.util.Date;

import pooClasesObjetos.Entidades.Automovil;
import pooClasesObjetos.Entidades.Motor;
import pooClasesObjetos.Enums.ColorEnum;
import pooClasesObjetos.Enums.TipoAutoEnum;
import pooClasesObjetos.Enums.TipoMotorEnum;

public class EjemploAutomovilEnum {

	public static void main(String[] args) {
		
		Automovil.setColorPatente(ColorEnum.ROJO); //cambia para todos los objetos
		//Automovil.setCapacidadTanqueEstatico(35);//cambia para todos los objetos
		
		Automovil subaru = new Automovil("Subaru","Impreza");

		subaru.setMotor(new Motor());
		subaru.setColor(ColorEnum.AZUL);
		subaru.setTipo(TipoAutoEnum.HACTCHBAKC);
		
		
		Automovil mazda = new Automovil("Mazda","BT",ColorEnum.BLANCO,new Motor(2.5,TipoMotorEnum.CORRIENTE));
		mazda.setTipo(TipoAutoEnum.SEDAN);
		
		Automovil mazda2 = new Automovil("Mazda","BT",ColorEnum.BLANCO,new Motor(2.5,TipoMotorEnum.CORRIENTE));
		
		
		TipoAutoEnum tipo = subaru.getTipo();
		
		System.out.println("El tipo del auto " + subaru.getFabricante()+" es :"+subaru.getTipo().getNombre());
		System.out.println("La descripción del auto es :"+subaru.getTipo().getDescripcion());
		System.out.println("El numero de puertas del auto es :"+subaru.getTipo().getNumeroPuertas());
		
		System.out.println("El detalle de mazda2 es: " +mazda.verDetalle());
		
		tipo=mazda.getTipo();
		
		
		switch(tipo) {
		case CONVERTIBLE:
			System.out.println("El automovil es deportivo y descapotable a dos puertas");
			break;
		case COUPUE:
			System.out.println("El auto es pequeño de dos puertas");
			break;
		case FURGON:
			System.out.println("Es un vehiculo utilitario de transporte para empresas");
			break;
		case SEDAN:
			System.out.println("Vehiculo compacto de tipo familiar");
			break;
		case SUV:
			System.out.println("Camioneta de alta teconologia y amplio consumo");
			break;
		case HACTCHBAKC:
			System.out.println("Carro subcompacto tipicamente de 4 puertas sin baul");
			break;
		case PICKUP:
			System.out.println("Camioneta similar a la SUV");
			break;
		}
		
		TipoAutoEnum[] tipos = TipoAutoEnum.values();
		
		for (TipoAutoEnum ta: tipos) {
			System.out.println(ta + "=> "+ ta.name()+" , "
								+ ta.getNombre()+" , "
								+ ta.getDescripcion() +" , "
								+ ta.getNumeroPuertas() );
								
								
			System.out.println();
		}
		
		
		
	}

}
