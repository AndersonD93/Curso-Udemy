package pooClasesObjetos;

import java.util.Date;

public class AutomovilMain {

	public static void main(String[] args) {
		
		Automovil subaru = new Automovil("Subaru","Impreza");

		subaru.setCilindrada(2.0);
		//subaru.setColor("Blanco");
		
		Automovil mazda = new Automovil();
		
		Date fecha= new Date();
		

		Automovil nissan = new Automovil();
		Automovil nissan2 = new Automovil();
		
		Automovil auto =new Automovil();
		
		System.out.println(nissan);
		System.out.println(nissan.toString());
		System.out.println(auto.equals(fecha));
		System.out.println(auto.equals(nissan));
		System.out.println("son iguales? "+(nissan ==nissan2));
		System.out.println("son iguales metodo equals sobre escrito? "+(nissan.equals(nissan2)));
		
		
		Automovil hyunday = new Automovil();
		
		
		System.out.println("mazda.fabricante: "+ mazda.getFabricante() + " subaru.fabricante :"+subaru.getFabricante());
		
		System.out.println(subaru.verDetalle());
		System.out.println(mazda.verDetalle());
		System.out.println(nissan.verDetalle());
		System.out.println(hyunday.verDetalle());
		System.out.println(subaru.acelerar(3000));
		System.out.println(subaru.frenar());
		
		System.out.println(mazda.acelerarFrenar(4000));
		
		System.out.println("Kilometros por litro "+ subaru.calcularConsumo(300, 0.6f));
		System.out.println("Kilometros por litro "+ subaru.calcularConsumo(300, 60));
		System.out.println("Kilometros por litro "+ nissan.calcularConsumo(300, 60));
	}

}
