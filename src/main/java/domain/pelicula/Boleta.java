package domain.pelicula;

import domain.cine.values.IdAsiento;
import domain.cliente.values.IdCliente;
import co.com.sofka.domain.generic.Entity;
import domain.pelicula.values.IdBoleta;
import domain.pelicula.values.Precio;
import domain.pelicula.values.Tipo;

import java.util.Objects;

public class Boleta extends Entity<IdBoleta> {

    private IdAsiento idAsiento;
    private final IdCliente idCliente;
    private final Tipo tipo;
    private final Precio precio;
    private final Pago pago;

    public Boleta(IdBoleta entityId, IdAsiento idAsiento, IdCliente idCliente, Tipo tipo, Precio precio, Pago pago) {
        super(entityId);
        this.idAsiento = Objects.requireNonNull(idAsiento, "El ID del asiento no puede ser null");
        this.idCliente = Objects.requireNonNull(idCliente, "El ID del cliente no puede ser null");
        this.tipo = Objects.requireNonNull(tipo, "El tipo de boleta no puede ser null");
        this.precio = Objects.requireNonNull(precio, "El precio no puede ser null");
        this.pago = Objects.requireNonNull(pago, "El pago no puede ser null");
    }

    public void cambiarAsiento(IdAsiento idAsiento){
        this.idAsiento = Objects.requireNonNull(idAsiento, "El ID del asiento no puede ser null");
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