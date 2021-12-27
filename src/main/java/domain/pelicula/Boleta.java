package domain.pelicula;

import domain.cine.values.IdAsiento;
import domain.cliente.values.IdCliente;
import co.com.sofka.domain.generic.Entity;
import domain.pelicula.values.IdBoleta;
import domain.pelicula.values.Precio;
import domain.pelicula.values.Tipo;

public class Boleta extends Entity<IdBoleta> {

    private IdAsiento idAsiento;
    private final IdCliente idCliente;
    private final Tipo tipo;
    private final Precio precio;
    private final Pago pago;

    public Boleta(IdBoleta entityId, IdAsiento idAsiento, IdCliente idCliente, Tipo tipo, Precio precio, Pago pago) {
        super(entityId);
        this.idAsiento = idAsiento;
        this.idCliente = idCliente;
        this.tipo = tipo;
        this.precio = precio;
        this.pago = pago;
    }

    public void cambiarAsiento(IdAsiento idAsiento){
        this.idAsiento = idAsiento;
    }

    public IdAsiento idAsiento() {
        return idAsiento;
    }

    public IdCliente idCliente() {
        return idCliente;
    }

    public Tipo tipo() {
        return tipo;
    }

    public Precio precio() {
        return precio;
    }

    public Pago pago() {
        return pago;
    }
}