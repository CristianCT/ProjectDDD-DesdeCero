package domain.cliente.events;

import domain.cliente.values.*;
import co.com.sofka.domain.generic.DomainEvent;

public class TarjetaCinecoAsociada extends DomainEvent {
    private final IdTarjeta idTarjeta;
    private final Membresia membresia;
    private final CodigoCVC CVC;
    private final FechaExpedicion fechaExpedicion;
    private final FechaVencimiento fechaVencimiento;
    private final Saldo saldo;
    public TarjetaCinecoAsociada(IdTarjeta idTarjeta, Membresia membresia, CodigoCVC CVC, FechaExpedicion fechaExpedicion, FechaVencimiento fechaVencimiento, Saldo saldo) {
        super("sofkau.domain.cliente.tarjetaconecoasociada");
        this.idTarjeta = idTarjeta;
        this.membresia = membresia;
        this.CVC = CVC;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
        this.saldo = saldo;
    }

    public IdTarjeta getIdTarjeta() {
        return idTarjeta;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public CodigoCVC getCVC() {
        return CVC;
    }

    public FechaExpedicion getFechaExpedicion() {
        return fechaExpedicion;
    }

    public FechaVencimiento getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Saldo getSaldo() {
        return saldo;
    }
}
