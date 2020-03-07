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
        
        return (numero + " = " + total(numero));

	}
	/**
	 * Método para la suma de los dígitos en valores mayores de 9
	 * @param valor_inicial numero a sumar
	 * @return devuelve el resultado de la suma de los dígitos
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
