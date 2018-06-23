/**
 *
 * @author Jesus Ivan
 */
public class Entidad{
	
    //Metodo get regresa  el calculo de suma 
    public int obtenerResultado(int datos [][]){
	int i, j, suma;
		
	suma = 0;
		
	for ( i = 0; i < datos.length; i++ )
	  {
	   for ( j = 0; j < datos [ 0 ].length; j++ ){
		suma += datos [ i ][ j ];
			}
		}
	   return suma;
	}
}