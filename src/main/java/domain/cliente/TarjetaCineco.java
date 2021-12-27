package domain.cliente;

import domain.cliente.values.*;
import co.com.sofka.domain.generic.Entity;

public class TarjetaCineco extends Entity<IdTarjeta> {

    private final Membresia membresia;
    private final CodigoCVC CVC;
    private final FechaExpedicion fechaExpedicion;
    private final FechaVencimiento fechaVencimiento;
    private Saldo saldo;

    public TarjetaCineco(IdTarjeta entityId, Membresia membresia, CodigoCVC CVC, FechaExpedicion fechaExpedicion, FechaVencimiento fechaVencimiento, Saldo saldo) {
        super(entityId);
        this.membresia = membresia;
        this.CVC = CVC;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
        this.saldo = saldo;
    }

    public TarjetaCineco(IdTarjeta entityId, Membresia membresia, CodigoCVC CVC, FechaExpedicion fechaExpedicion, FechaVencimiento fechaVencimiento) {
        super(entityId);
        this.membresia = membresia;
        this.CVC = CVC;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
        this.saldo = null;
    }

    public void recargarSaldo(Double saldo){
        this.saldo = new Saldo(this.saldo.value() + saldo);
    }

    public void descontarSaldo(Double saldo){
        this.saldo = new Saldo(this.saldo.value() - saldo);
    }

    public Membresia membresia() {
        return membresia;
    }

    public CodigoCVC CVC() {
        return CVC;
    }

    public FechaExpedicion dechaExpedicion() {
        return fechaExpedicion;
    }

    public FechaVencimiento dechaVencimiento() {
        return fechaVencimiento;
    }

    public Saldo saldo() {
        return saldo;
    }
}
