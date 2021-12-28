package domain.cliente;

import domain.cliente.values.*;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class TarjetaCineco extends Entity<IdTarjeta> {

    private final Membresia membresia;
    private final CodigoCVC CVC;
    private final FechaExpedicion fechaExpedicion;
    private final FechaVencimiento fechaVencimiento;
    private Saldo saldo;

    public TarjetaCineco(IdTarjeta entityId, Membresia membresia, CodigoCVC CVC, FechaExpedicion fechaExpedicion, FechaVencimiento fechaVencimiento, Saldo saldo) {
        super(entityId);
        this.membresia = Objects.requireNonNull(membresia, "La membresia no puede ser null");
        this.CVC = Objects.requireNonNull(CVC, "El CVC no puede ser null");
        this.fechaExpedicion = Objects.requireNonNull(fechaExpedicion, "La fecha de expedicion no puede ser null");
        this.fechaVencimiento = Objects.requireNonNull(fechaVencimiento, "La fecha de vencimiento no puede ser null");
        this.saldo = Objects.requireNonNull(saldo, "El saldo no puede ser null");
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
