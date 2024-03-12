package Javadoc;
/**
 * Se creará la cuenta bancaria del cliente de un banco.
 * En esta clase guardaremos datos de tipo privado acerca de su Numero de cuenta, saldo y propietario de la correspondiente cuenta.
 * @author Jorge Junquera Casarreal
 * @version 3.2, 2024/03/12
 */
public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private Cliente propietario;

    /**
     * Se crea un constructor de un objeto público CuentaBancaria con los datos correspondientes, numero de la cuenta, saldo y propietario.
     * Se establece un cliente mediante la información dada y luego crea una lista vacía en la cual se iran guardando los clientes.
     * @param numeroCuenta el número de la cuenta asociada
     * @param saldo de la susodicha cuenta
     * @param propietario de la cuenta
     */
    public CuentaBancaria(String numeroCuenta, double saldo, Cliente propietario) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }
    /**
     * Método getter que nos retorna el número de la cuenta.
     * @return numero de cuenta.
     */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    /**
     * Método setter que establece el número de la cuenta.
     * @param numeroCuenta del cliente
     */
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    /**
     * Método getter que nos retorna el saldo de la cuenta.
     * @return saldo de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Método setter que establece el saldo de la cuenta.
     * @param saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Método getter que nos retorna el propietario de la cuenta.
     * @return propietario de la cuenta.
     */
    public Cliente getPropietario() {
        return propietario;
    }
    /**
     * Método setter que establece el propietario de la cuenta.
     * @param propietario de la cuenta.
     */
    public void setPropietario(Cliente propietario) {
        this.propietario = propietario;
    }
    /**
     * Método de tipo vacío que deposita una cantidad en la cuenta, aumentando el saldo.
     * @param cantidad y la añade al saldo de la cuenta.
     */
    public void depositar(double cantidad) {
        saldo += cantidad;
    }
    /**
     * Este método booleano retira una cantidad de la cuenta..
     * @param cantidad la cantidad de dinero que se sacará de la cuenta y se restará del saldo.
     * @return true si se ha realizado la operación correctamente y false si no se realizó satisfactoriamente.
     */
    public boolean retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
    /**
     * Imprime una cadena de texto concatenada del objeto CuentaBancaria formado por el numero de cuenta, saldo y propietario de la cuenta.
     * @return numero de cuenta, saldo de la cuenta y el propietario de la cuenta bancaria.
     */
    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                ", propietario=" + propietario.getNombre() + " " + propietario.getApellido() +
                '}';
    }

}
