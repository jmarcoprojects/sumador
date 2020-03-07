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
	 * Método para mostrar el número si es de un solo digito
	 * Si es negativo no devuelve nada
	 * @param cad contiene el número que se va a sumar
	 * @return devuelve una cadena que muestra el número introducido 
	 */
	public String mostrar(String cad) {
        String numero = cad;
        if(numero.length() == 1) {
        	return (numero + " = " + numero);
        	}
        if (cad.charAt(0)=='-') {
			return null;
			}
        return numero;

}


	

}
