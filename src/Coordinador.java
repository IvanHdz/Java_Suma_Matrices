/**
 *
 * @author Jesus Ivan
 */
public class Coordinador {
    	private SumaMatrizGUI       miVentanaInicial;
	private EntradaDatosGUI   miVentanaEntradaSalida;
	private Entidad                miEntidad;
       
        public void procesoVentanaEntrada ( ){
	   int datos [ ][ ], suma;
           
           datos = miVentanaEntradaSalida.getMatriz();
    //suma es igual ala referencia de la clase Entidad metodo obtenerResultados.  
	   suma  = miEntidad.obtenerResultado(datos);
	   
           miVentanaEntradaSalida.setResultado(suma);
	}
        
       public void procesoVentanaInicial(){	
	 int numeroFilas, numeroColumnas;
	
	 numeroFilas    = miVentanaInicial.getNumeroFilas    ( );
	 numeroColumnas = miVentanaInicial.getNumeroColumnas ( );
		
	 miVentanaEntradaSalida.setDimensiones(numeroFilas, numeroColumnas);
		
	 miVentanaInicial.dispose();
         miVentanaEntradaSalida.construyeVentana ("Viruz Blog: Entrada de Datos");
         miVentanaEntradaSalida.setLocationRelativeTo(null);
         
	}
        
        //***METODOS SET***
        public void setEntidad(Entidad nuevaEntidad ){
		miEntidad = nuevaEntidad;
	} 
        
        public void setVentanaInicial(SumaMatrizGUI nuevaVentana ){
		miVentanaInicial = nuevaVentana;
	}
        
        public void setVentanaEntradaSalida(EntradaDatosGUI nuevaVentana){
		miVentanaEntradaSalida = nuevaVentana;
	}
}