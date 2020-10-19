package variables;

/**
 * variables java
 * @author alex
 * @version 1.0
 */
public class Variables 
{

	/**
	 * comentario
	 * @param args
	 */
	public static void main(String[] args)
	{
		  
		System.out.println("datos primitivos");
		
		byte numbyte = 1;
		short numcorto =1;
		int numentero =1;
		long numdoble =1;
		
		System.out.println("byte = "+numbyte);
		System.out.println("short = "+numcorto);
		System.out.println("int = "+numentero);
		System.out.println("long = "+numdoble);
		
		//wrappers => son clases que envuelven a las variables primitivas con ciertas utilidades
		  // int     => Integer
		  // float   => Float
		  // char    => Character
		  // boolean => Boolean
		
		System.out.println("valor maximo de int "+Integer.MAX_VALUE);
		System.out.println("valor minimo de int "+Integer.MIN_VALUE);
		
		System.out.println("tamaño en bits byte "+Byte.SIZE);
		System.out.println("tamaño en bits short "+Short.SIZE);
		System.out.println("tamaño en bits int "+Integer.SIZE);
		System.out.println("tamaño en bits long "+Long.SIZE);
	}

}
