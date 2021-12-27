package pelicula.commands;

import cine.values.IdAsiento;
import cliente.values.IdCliente;
import co.com.sofka.domain.generic.Command;
import pelicula.Pago;
import pelicula.values.IdBoleta;
import pelicula.values.IdFuncion;
import pelicula.values.Precio;
import pelicula.values.Tipo;

public class AgregarBoletaFuncionCommand extends Command {
    private final IdBoleta idBoleta;
    private final IdFuncion idFuncion;
    private final IdAsiento idAsiento;
    private final IdCliente idCliente;
    private final Tipo tipo;
    private final Precio precio;
    private final Pago pago;

    public AgregarBoletaFuncionCommand(IdBoleta idBoleta, IdFuncion idFuncion, IdAsiento idAsiento, IdCliente idCliente, Tipo tipo, Precio precio, Pago pago) {
        this.idBoleta = idBoleta;
        this.idFuncion = idFuncion;
        this.idAsiento = idAsiento;
        this.idCliente = idCliente;
        this.tipo = tipo;
        this.precio = precio;
        this.pago = pago;
    }

    public IdBoleta getIdBoleta() {
        return idBoleta;
    }

    public IdFuncion getIdFuncion() {
        return idFuncion;
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
