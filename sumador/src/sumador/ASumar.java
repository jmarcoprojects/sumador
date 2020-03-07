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
	 * M�todo para mostrar el n�mero si es de un solo digito
	 * Si es negativo no devuelve nada
	 * @param cad contiene el n�mero que se va a sumar
	 * @return devuelve una cadena que muestra el n�mero introducido 
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
