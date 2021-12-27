package pelicula.events;

import cine.values.IdAsiento;
import cliente.values.IdCliente;
import co.com.sofka.domain.generic.DomainEvent;
import pelicula.Pago;
import pelicula.values.IdBoleta;
import pelicula.values.IdFuncion;
import pelicula.values.Precio;
import pelicula.values.Tipo;

public class BoletaAgregadaAFuncion extends DomainEvent {
    private final IdFuncion idFuncion;
    private final IdBoleta idBoleta;
    private final IdAsiento idAsiento;
    private final IdCliente idCliente;
    private final Tipo tipo;
    private final Precio precio;
    private final Pago pago;
    public BoletaAgregadaAFuncion(IdFuncion idFuncion, IdBoleta idBoleta, IdAsiento idAsiento, IdCliente idCliente, Tipo tipo, Precio precio, Pago pago) {
        super("sofkau.pelicula.boletaagregadaafuncion");
        this.idFuncion = idFuncion;
        this.idBoleta = idBoleta;
        this.idAsiento = idAsiento;
        this.idCliente = idCliente;
        this.tipo = tipo;
        this.precio = precio;
        this.pago = pago;
    }

    public IdFuncion getIdFuncion() {
        return idFuncion;
    }

    public IdBoleta getIdBoleta() {
        return idBoleta;
    }

    public IdAsiento getIdAsiento() {
        return idAsiento;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Precio getPrecio() {
        return precio;
    }

    public Pago getPago() {
        return pago;
    }
}
