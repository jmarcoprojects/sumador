package sumador;

/**
 * Clase para sumar todos los dígitos que componen un número
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
	 * Método que muestra el resultado de la suma de todos los dígitos que componen un número
	 * @param cad contiene el número que se va a sumar
	 * @return devuelve una cadena que muestra el número introducido y el resultado de la suma de sus dígitos
	 */
	public String mostrar(String cad) {
        String numero = cad;
        if(numero.length() == 1) {
        	return (numero + " = " + numero);
        	}
        return numero;

}


	

}
