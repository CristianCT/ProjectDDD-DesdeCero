package pelicula;

import cine.values.IdEmpleado;
import co.com.sofka.domain.generic.Entity;
import genericos.Fecha;
import genericos.Descuento;
import pelicula.values.IdPago;
import pelicula.values.Metodo;
import pelicula.values.Pagado;

public class Pago extends Entity<IdPago> {

    private final IdEmpleado idEmpleado;
    private final Fecha fecha;
    private Pagado pagado;
    private final Metodo metodo;
    private final Descuento descuento;

    public Pago(IdPago entityId, IdEmpleado idEmpleado, Fecha fecha, Pagado pagado, Metodo metodo, Descuento descuento) {
        super(entityId);
        this.idEmpleado = idEmpleado;
        this.fecha = fecha;
        this.pagado = pagado;
        this.metodo = metodo;
        this.descuento = descuento;
    }

    public void cambiarEstadoPagado(Pagado pagado){
        this.pagado = pagado;
    }

    public IdEmpleado idEmpleado() {
        return idEmpleado;
    }

    public Fecha fecha() {
        return fecha;
    }

    public Pagado pagado() {
        return pagado;
    }

    public Metodo metodo() {
        return metodo;
    }

    public Descuento descuento() {
        return descuento;
    }
}