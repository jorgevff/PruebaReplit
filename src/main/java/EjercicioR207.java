import java.util.ArrayList;

class 
EjercicioR207

{
   
 	public String devolverEnOrden(ArrayList<String> palabras)
   

 	{
        // Escribe tu c�digo a continuaci�n...
  
      
	String textoDePalabrasADevolver = "";
 
	       //textoDePalabrasADevolver = textoDePalabrasADevolver.toLowerCase().replace(" ", ",");

       
	 int tama�oColeccion = palabras.size();
        
	ArrayList<String> copiaOrdenada = new ArrayList<>();
       
	 int posicion = 0;
        
	int posicionCopia = 0;
       

	 while(posicion < tama�oColeccion)
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

        
	while (posicionCopia < tama�oColeccion){

           
		 textoDePalabrasADevolver = textoDePalabrasADevolver + copiaOrdenada.get(posicionCopia) + ",";

         
		  posicionCopia++;
        
	}
        
	if(textoDePalabrasADevolver.length() > 0){
           
		 textoDePalabrasADevolver = textoDePalabrasADevolver.substring(0, textoDePalabrasADevolver.length() - 1);
     
	 }

      
	  return textoDePalabrasADevolver;
        
	// A continuaci�n puedes escribir otros m�todos si lo necesitas...
   
	 }

}