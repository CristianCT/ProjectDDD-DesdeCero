package cliente;

import cliente.values.IdCliente;
import co.com.sofka.domain.generic.AggregateEvent;
import genericos.*;

import java.util.HashSet;
import java.util.Set;

public class Cliente extends AggregateEvent<IdCliente> {

    private Nombre nombre;
    private Apellidos apellidos;
    private FechaNacimiento fechaNacimiento;
    private Telefono telefono;
    private Cuenta cuenta;
    private Set<Visita> visitas;

    public Cliente(IdCliente entityId, Nombre nombre, Apellidos apellidos, FechaNacimiento fechaNacimiento, Telefono telefono) {
        super(entityId);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.cuenta = null;
        this.visitas = new HashSet<>();
    }

    public void cambiarEmailCuenta(){

    }

    public void cambiarPasswordCuenta(){

    }

    public void agregarPuntoPuntuacin(){

    }

    public void recargarSaldoTarjetaCineco(){

    }

    public void descontarSaldoTarjetaCineco(){

    }

    public void agregarVisita(){

    }

    public void modificarDetallesVisita(){

    }

    public Nombre nombre() {
        return nombre;
    }

    public Apellidos apellidos() {
        return apellidos;
    }

    public FechaNacimiento fechaNacimiento() {
        return fechaNacimiento;
    }

    public Telefono telefono() {
        return telefono;
    }

    public Cuenta cuenta() {
        return cuenta;
    }

    public Set<Visita> visitas() {
        return visitas;
    }
}
