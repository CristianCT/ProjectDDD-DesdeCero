package domain.pelicula;

import domain.cine.values.IdEmpleado;
import co.com.sofka.domain.generic.Entity;
import domain.genericos.Fecha;
import domain.genericos.Descuento;
import domain.pelicula.values.IdPago;
import domain.pelicula.values.Metodo;
import domain.pelicula.values.Pagado;

import java.util.Objects;

public class Pago extends Entity<IdPago> {

    private final IdEmpleado idEmpleado;
    private final Fecha fecha;
    private Pagado pagado;
    private final Metodo metodo;
    private final Descuento descuento;

    public Pago(IdPago entityId, IdEmpleado idEmpleado, Fecha fecha, Pagado pagado, Metodo metodo, Descuento descuento) {
        super(entityId);
        this.idEmpleado = Objects.requireNonNull(idEmpleado, "El ID del responsable no puede ser null");
        this.fecha = Objects.requireNonNull(fecha, "La fecha no puede ser null");
        this.pagado = Objects.requireNonNull(pagado, "El estado del pago no puede ser null");
        this.metodo = Objects.requireNonNull(metodo, "El metodo de pago no puede ser null");
        this.descuento = Objects.requireNonNull(descuento, "El descuento no puede ser null");
    }

    public void cambiarEstadoPagado(Pagado pagado){
        this.pagado = Objects.requireNonNull(pagado, "El estado del pago no puede ser null");
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