package sumador;

/**
 * Clase para sumar todos los d�gitos que componen un n�mero
 * @author J M
 * @version: 1.0
 */

public class ASumar {
	/**
	 *Constructor
	 */
	public ASumar() {
		}
	
	/**
	 * M�todo que muestra el resultado de la suma de todos los d�gitos que componen un n�mero
	 * @param cad contiene el n�mero que se va a sumar
	 * @return devuelve una cadena que muestra el n�mero introducido y el resultado de la suma de sus d�gitos
	 */
	public String mostrar(String cad) {
        String numero = cad;
        if(numero.length() == 1) {
        	return (numero + " = " + numero);
        	}
        return numero;

}


	

}
