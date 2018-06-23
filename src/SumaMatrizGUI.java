/**
 *
 * @author Jesus Ivan
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SumaMatrizGUI extends JFrame{
    	private Coordinador miCoordinador;
	private Container   miContenedor;
	private JTextField  filas,columnas; 
        private JButton	    botonAceptar;
	private JLabel      etiquetaFilas;
	private JLabel      etiquetaColumnas;
        
       public SumaMatrizGUI ( String titulo ){
		int i;
		miContenedor = getContentPane ( );
		miContenedor.setLayout ( null );
		setTitle     ( titulo   );
		setSize      ( 320, 140 );
                addComponentes();
                addEventos();
		setVisible    (true);
       }
       
       public void addComponentes(){
                filas            = new JTextField ( "5" );
		columnas         = new JTextField ( "5" );
		botonAceptar     = new JButton    ( );
		etiquetaFilas    = new JLabel     ( );
		etiquetaColumnas = new JLabel     ( );
     
		etiquetaFilas.setBounds    ( 10, 10, 200, 30 );
		etiquetaFilas.setText      ( "Número de filas:" );

		etiquetaColumnas.setBounds ( 10, 45, 200, 30 );
		etiquetaColumnas.setText   ( "Número de columnas:" );
		
		filas.setBounds            ( 150, 10, 30, 30 );
		columnas.setBounds         ( 150, 45, 30, 30 );
		
		botonAceptar.setText       ( "Aceptar" );
		botonAceptar.setBounds     ( 190, 10, 80, 30 );
                
                miContenedor.add( etiquetaFilas    );
		miContenedor.add( etiquetaColumnas );
		miContenedor.add( filas            );
		miContenedor.add( columnas         );
		miContenedor.add( botonAceptar     );
           }
       public void addEventos(){
           botonAceptar.addActionListener(new ActionListener(){
               	public void actionPerformed (ActionEvent e){
		miCoordinador.procesoVentanaInicial();
	      }
            });
       }
       
       public void setCoordinador(Coordinador nuevoCoordinador){
		miCoordinador = nuevoCoordinador;
	}
       	public int getNumeroFilas( ){
		return Integer.parseInt ( filas.getText( ));
	} 
        public int getNumeroColumnas ( ){
		return Integer.parseInt ( columnas.getText ( ) );
	} 

}
