package cuentas; // forma parte del paquete cuentas 

				/** @param empieza la clase Main */
public class Main {
			
				/** @param aqui comienza el main */
    public static void main(String[] args) {
        CCuenta cuenta1;                      /**  @param cambio de la variable miCuenta por cuenta1 */
        cuenta1 = operativa_cuenta(0);        /**  @param parametro cantidad tipo float con valor 0 */

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    	}
    	/**  @return se crea el metodo operativa_cuenta    añado parametro cantidad de tipo float */
    
	private static CCuenta operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
		double saldoActual;
		cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
		return cuenta1;
	}
}
