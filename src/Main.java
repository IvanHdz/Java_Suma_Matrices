/**
 *
 * @author Jesus Ivan
 */
public class Main {
    	public static void main ( String [] args){
	   SumaMatrizGUI  ventanaInicial;
	   EntradaDatosGUI ventanaEntradaSalida;
	   Entidad              entidad;
	   Coordinador          coordinador;
           
	   ventanaInicial       = new SumaMatrizGUI( "Viruz Blog: Suma de Matriz");
	   ventanaEntradaSalida = new EntradaDatosGUI (  );
            
	   entidad     = new Entidad     ( );
	   coordinador = new Coordinador ( );
           ventanaInicial.setLocationRelativeTo(null);
           ventanaEntradaSalida.setLocationRelativeTo(null);
           
           ventanaInicial.setCoordinador       ( coordinador );
           ventanaEntradaSalida.setCoordinador ( coordinador );
           
           coordinador.setVentanaInicial       ( ventanaInicial );
           coordinador.setVentanaEntradaSalida ( ventanaEntradaSalida );
           coordinador.setEntidad ( entidad );
	}
}