package variables;

public class Division 
{
	/**
	Realizar un programa que tenga 2 variables enteras, dividendo y divisor. 
	Meterle valores  enteros y positivos. Realizar la operación división y mostrar 
	el resultado en pantalla
	Repetir el mismo código con estas variaciones: entero y real, real y entero, 
	real y real
	Por ultimo, intentar dividir en los cuatro casos anteriores entre 0 y mostrar 
	el resultado en pantalla
	* @param args
	*/
	
	public static void main(String[] args) 
	{
		

		int dividendo, divisor, division1;
		float dividendo2, divisor2, division2, division3, division4, division0;
		
		dividendo = 10;
		divisor = 2;
		dividendo2 = 7.8f;
		divisor2 = 3.2f;
		
		//entero y entero
		division1 = dividendo / divisor;
		System.out.println("la division es "+division1);
		
		//entero y real
		division2 = dividendo / divisor2;
		System.out.println("la division es "+division2);
		
		//real y entero
		division3 = dividendo2 / divisor;
		System.out.println("la division es "+division3);
		//real y real
		division4 = dividendo2 / divisor2;
		System.out.println("la division es "+division4);
		
		//divisiones entre 0
		division0= division1 /0;
		
		System.out.println("el resultado de las cuatro divisiones entre 0 es: "+division0);
		
	}

}
