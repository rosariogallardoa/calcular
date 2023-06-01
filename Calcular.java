
public class Calcular {
	
	static String nombre;
	static int[] calificacion;
	
	static int Promedio;
	static String CalificacionFinal;
	
	//Metodo Uno
    public static int CalcularPromedio(int[] Cal )
    {
    	
    	int valor = 0;
    	String numCadena = "";
    	
    	for (int i = 0; i < Cal.length; i++){
    		
    		numCadena = Integer.toString(Cal[i]); 
    	    valor += Integer.parseInt(numCadena);
    	}
    	
       return valor;
    }
    
    //Metodo Dos
    public static String ObtenerCalificacion(int Promedio) {
    	
    	String Cal = "";
    	
    	if ( Promedio < 51) {
    		Cal = "F";
    	}
    	if ( Promedio > 50 && Promedio < 61) {
    		Cal = "E";
    	}    	
    	if ( Promedio > 60 && Promedio < 71) {
    		Cal = "D";
    	}
    	if ( Promedio > 70 && Promedio < 81) {
    		Cal = "C";
    	}
    	if ( Promedio > 80 && Promedio < 91) {
    		Cal = "B";
    	}
    	if ( Promedio > 90 && Promedio < 101) {
    		Cal = "A";
    	}
    	
    	return Cal;
    }
    
    // Metodo Tres
    public  static void ImprimirResultado(String Nom, int Prom, String Cal) {
    	
		System.out.print("Nombre: " + Nom);
		
		
		int valorArray = 0;
		
		for (int i = 0; i < calificacion.length; i++){
		    		
			//Array += Integer.parseInt(Integer.toString(calificacion[i]));
			System.out.print("\nCalificación: " + i + ": " + calificacion[i]);
    	}
		
		
		System.out.print("\nPromedio: " + Prom);
		System.out.print("\nCalificación: " + Cal);
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		nombre = "Gustavo";
		
		//Calcula
		calificacion = new int[] { 10, 7, 8, 6, 9};
		Promedio = CalcularPromedio(calificacion);
		
		//CalificacionFinal
		CalificacionFinal = ObtenerCalificacion(Promedio);
		
		//Imprime
		ImprimirResultado(nombre, Promedio, CalificacionFinal);
				

	}		

}
