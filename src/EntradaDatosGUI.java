/**
 *
 * @author Jesus Ivan
 */
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class EntradaDatosGUI extends JFrame implements ActionListener{
    	private Coordinador miCoordinador;
	private Container   miContenedor;
	private JTextField  miCampoTexto [ ][ ];
	private JLabel      indices      [ ][ ];
	private JButton	    botonAceptar;
	private JLabel      miEtiqueta;
	private int         matriz [ ][ ];
	private int         numeroFilas;
	private int         numeroColumnas;

        public void construyeVentana ( String titulo ){
	    int i, j;
		
            miContenedor = getContentPane();
            miContenedor.setLayout( null );

           miCampoTexto = new JTextField [ numeroFilas ][ numeroColumnas ];
	   indices      = new JLabel     [ numeroFilas ][ numeroColumnas ];

           matriz = new int [ numeroFilas ][ numeroColumnas ];
		
		for ( i = 0; i < numeroFilas; i++ )
                {
		   for ( j = 0; j < numeroColumnas; j++ ){
			miCampoTexto [ i ][ j ] = new JTextField ( "0" );
			indices      [ i ][ j ] = new JLabel     ( );
			}
		}
           
           botonAceptar = new JButton( );
	   miEtiqueta   = new JLabel( );
	   miEtiqueta.setBounds ( 100, 10, 120, 30 );
		
	   for ( i = 0; i < numeroFilas; i++ )
	     {
	    for ( j = 0; j < numeroColumnas; j++ ){
	        miCampoTexto [ i ][ j ].setBounds (j*50 +25, i*30 +50, 40, 25);
		indices      [ i ][ j ].setBounds (j*50 +5, i*30 +50, 15, 25);
		indices      [ i ][ j ].setText   ( i + "" );
			}
	     }
		//Asigno nombre al Boton
		botonAceptar.setText( "Aceptar" );
		botonAceptar.setBounds ( 10, 10, 80, 30 );
		
		for( i = 0; i < numeroFilas; i++ )
		{
			for( j = 0; j < numeroFilas; j++ ){
				miContenedor.add ( miCampoTexto [ i ][ j ] );
				miContenedor.add ( indices      [ i ][ j ] );
			}
		}
                
                //Agrega componentes al Contenedor
		miContenedor.add ( miEtiqueta );
		miContenedor.add ( botonAceptar );
		
		setTitle     ( titulo  );
		setSize      ( 400,400 );
		setLocation  ( 100,100 );
		setVisible   (true);
                
                botonAceptar.addActionListener ( this );
	}
      
       public void actionPerformed (ActionEvent e){
           //Ejecuta de La Clase Coordinador el metodo ProcesoVentanaEntrada.
		miCoordinador.procesoVentanaEntrada ( );
	}
	
       public int [ ][ ] getMatriz(){
		int i, j;

		for ( i = 0; i < numeroFilas; i++ )
		{
		   for ( j = 0; j < numeroColumnas; j++ ){
		         matriz [ i ][ j ] = Integer.parseInt 
                                        ( miCampoTexto [ i ][ j ].getText());
			}
		}	
	       return matriz;
	}
       
       //**METODOS SET****
        public void setCoordinador ( Coordinador nuevoCoordinador ){
		miCoordinador = nuevoCoordinador;
	}
        public void setDimensiones( int cantidadFilas, int cantidadColumnas){
		numeroFilas    = cantidadFilas;
		numeroColumnas = cantidadColumnas;
	}
	
	public void setResultado( int resultado){
		miEtiqueta.setText ( "La suma es : " + resultado );
	}
 }