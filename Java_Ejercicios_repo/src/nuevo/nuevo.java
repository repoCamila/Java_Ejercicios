package nuevo;

public class nuevo {

	public static void main(String[] args) {

		fibonacciSerie(21);
}

	
/* 1. Serie de Fibonacci
 * 
Escriba un programa Java simple que imprima la serie de Fibonacci hasta un número dado. 

*/
		
static void fibonacciSerie(int numeroFinal) {
	int resultado = 1;
	int num1 = 0;
	int num2 = 1;
	
	if (numeroFinal != 1) {
		System.out.println(num2);
		
	    for(int i = 1; i < numeroFinal; i++) 
	    {
	    	resultado	=	num1	+ 	num2; // El primer resultado será la suma de 0 y 1
	    	num1	=	num2;
	    	num2	=	resultado;
	    	System.out.println(resultado);
	    	
		}
	}
	else {

		System.out.println(num2);
	}

}

}