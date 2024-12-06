package cuentas;
public class CCuenta {
				
				/** @param introduzco las constantes */

    private String nombre;  
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    			/** @param método vacío por si hace falta */
    
    public CCuenta()
    {
    }
    			
    			/** @param método utilizado en el Main */
    
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    			/** @return método que devuelve el saldo */
    
    public double estado()
    {
        return saldo;
    }

      			/** @exception: no se puede ingresar una cantidad negativa */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

      			/** @exception no se pude retirar una cantidad negativa ni mayor que el saldo disponible */
    
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    			/** @param generamos los get y set */
    
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
    
    
}
