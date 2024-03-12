package Javadoc;

import java.util.ArrayList;
import java.util.List;
/**
 * Se creará la clase cliente de un banco.
 * En esta clase guardaremos datos de tipo privado acerca de su Nombre, Apellidos, id y se creará una lista de las cuentas bancarias.
 * @author Jorge Junquera Casarreal
 * @version 3.2, 2024/03/12
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String id;
    private List<CuentaBancaria> cuentas;

    /**
     * Se crea un constructor de un objeto público Cliente con los datos correspondientes, nombre, apellido e id, todos ellos de tipo String.
     * Se establece un cliente mediante la información dada y luego crea una lista vacía en la cual se iran guardando los clientes.
     * @param nombre del cliente
     * @param apellido del cliente
     * @param id del cliente
     */
    public Cliente(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.cuentas = new ArrayList<>();
    }

    /**
     * Método getter que nos retorna el nombre del cliente
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter que establece el nombre del cliente.
     * @param nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter que nos retorna el apellido del cliente.
     * @return apellido del cliente
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Método setter que establece el apellido del cliente
     * @param apellido del cliente
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Método getter que retorna la ID del cliente
     * @return ID del cliente
     */
    public String getId() {
        return id;
    }

    /**
     * Método setter que establece la ID del cliente.
     * @param id del cliente
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Método público que nos devuelve la lista de las cuentas bancarias creadas de los clientes.
     * @return una nueva lista que guarda las cuentas de los clientes.
     */
    public List<CuentaBancaria> getCuentas() {
        return new ArrayList<>(cuentas);
    }

    /**
     * Método vacío que agrega una Cuenta a la lista.
     * @param cuenta y la añade a la lista llamado cuentas(ArrayList).
     */
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.add(cuenta);
    }

    /**
     * Este método booleano cierra una cuenta dependiendo del numero que se haya introducido.
     * @param numeroCuenta el número de cuenta del cliente.
     * @return true si se ha cerrado correctamente y false si no se cerró satisfactoriamente.
     */
    public boolean cerrarCuenta(String numeroCuenta) {
        return cuentas.removeIf(cuenta -> cuenta.getNumeroCuenta().equals(numeroCuenta));
    }

    /**
     * Imprime una cadena de texto concatenada del objeto cliente formado por el nombre, apellido, id y la cuenta del Cliente.
     * @return nombre del cliente, apellido del cliente, su id y la cuenta asociada a esos datos proporcionados.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id='" + id + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
}
