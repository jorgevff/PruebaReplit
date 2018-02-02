import java.util.ArrayList;

class 
EjercicioR207

{
   
 	public String devolverEnOrden(ArrayList<String> palabras)
   

 	{
        // Escribe tu código a continuación...
  
      
	String textoDePalabrasADevolver = "";
 
	       //textoDePalabrasADevolver = textoDePalabrasADevolver.toLowerCase().replace(" ", ",");

       
	 int tamañoColeccion = palabras.size();
        
	ArrayList<String> copiaOrdenada = new ArrayList<>();
       
	 int posicion = 0;
        
	int posicionCopia = 0;
       

	 while(posicion < tamañoColeccion)
		{
            
		String palabraMasLarga = "";
           
		 for(String nuevaPalabra : palabras){
               
			 if(nuevaPalabra.length() >= palabraMasLarga.length()){
 
		                   palabraMasLarga = nuevaPalabra;

               
		 	}

          
	 	 }
            
		copiaOrdenada.add(palabraMasLarga);
            
		palabras.remove(palabraMasLarga);
            
		posicion++;

       
	 }

        
	while (posicionCopia < tamañoColeccion){

           
		 textoDePalabrasADevolver = textoDePalabrasADevolver + copiaOrdenada.get(posicionCopia) + ",";

         
		  posicionCopia++;
        
	}
        
	if(textoDePalabrasADevolver.length() > 0){
           
		 textoDePalabrasADevolver = textoDePalabrasADevolver.substring(0, textoDePalabrasADevolver.length() - 1);
     
	 }

      
	  return textoDePalabrasADevolver;
        
	// A continuación puedes escribir otros métodos si lo necesitas...
   
	 }

}