package cliente;

import cliente.events.*;
import cliente.values.*;
import co.com.sofka.domain.generic.AggregateEvent;
import genericos.*;

import java.util.Set;

public class Cliente extends AggregateEvent<IdCliente> {

    protected Nombre nombre;
    protected Apellidos apellidos;
    protected FechaNacimiento fechaNacimiento;
    protected Telefono telefono;
    protected Cuenta cuenta;
    protected Set<Visita> visitas;

    public Cliente(IdCliente entityId, Nombre nombre, Apellidos apellidos, FechaNacimiento fechaNacimiento, Telefono telefono) {
        super(entityId);
        subscribe(new ClienteChange(this));
        appendChange(new ClienteCreado(nombre, apellidos, fechaNacimiento, telefono)).apply();
    }

    public void cambiarEmailCuenta(Email email){
        appendChange(new EmailDeCuentaCambiado(email)).apply();
    }

    public void cambiarPasswordCuenta(Password password){
        appendChange(new PasswordCuentaCambiado(password)).apply();
    }

    public void agregarPuntosCuenta(Integer puntos){
        appendChange(new PuntosCuentaAgregados(puntos)).apply();
    }

    public void recargarSaldoTarjetaCineco(Double saldo){
        appendChange(new SaldoTarjetaCinecoRecargado(saldo)).apply();
    }

    public void descontarSaldoTarjetaCineco(Double saldo){
        appendChange(new SaldoTarjetaCinecoDescontado(saldo)).apply();
    }

    public void agregarVisita(Detalles detalles, Fecha fecha){
        appendChange(new VisitaAgregada(new IdVisita(), detalles, fecha)).apply();
    }

    public void modificarDetallesVisita(IdVisita idVisita, Detalles detalles){
        appendChange(new DetallesVisitaModificados(idVisita, detalles)).apply();
    }

    public void asociarCuenta(Email email, Password password){
        appendChange(new CuentaAsociada(new IdCuenta(), email, password, new Puntuacion(0))).apply();
    }

    public void asociarTarjetaCuenta(Membresia membresia, CodigoCVC CVC, FechaVencimiento fechaVencimiento, Saldo saldo){
        appendChange(
            new TarjetaCinecoAsociada(
                new IdTarjeta(),
                membresia,
                CVC,
                new FechaExpedicion(),
                fechaVencimiento,
                saldo
            )
        ).apply();
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
