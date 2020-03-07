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
        
        return (numero + " = " + total(numero));

	}
	/**
	 * M�todo para la suma de los d�gitos en valores mayores de 9
	 * @param valor_inicial numero a sumar
	 * @return devuelve el resultado de la suma de los d�gitos
	 */
	 public int total(String valor_inicial) {
	        int suma = 0;
	        String valorInicial = "";
	        for (int i = 0; i < valor_inicial.length(); i++) {
	            String digito = valor_inicial.substring(i, i+1);
	            if(i > 0) { 
	            	valorInicial = valorInicial + " + " + digito;
	            }else{
	            	valorInicial = digito;
	            }
	            
	            suma = suma + Integer.parseInt(digito);
	            
	        }
	        return suma;

	    }
	

	

}
