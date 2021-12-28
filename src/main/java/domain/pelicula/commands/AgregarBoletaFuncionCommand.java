package domain.pelicula.commands;

import domain.cine.values.IdAsiento;
import domain.cliente.values.IdCliente;
import co.com.sofka.domain.generic.Command;
import domain.pelicula.Pago;
import domain.pelicula.values.*;

public class AgregarBoletaFuncionCommand extends Command {
    private final IdPelicula idPelicula;
    private final IdBoleta idBoleta;
    private final IdFuncion idFuncion;
    private final IdAsiento idAsiento;
    private final IdCliente idCliente;
    private final Tipo tipo;
    private final Precio precio;
    private final Pago pago;

    public AgregarBoletaFuncionCommand(IdPelicula idPelicula, IdBoleta idBoleta, IdFuncion idFuncion, IdAsiento idAsiento, IdCliente idCliente, Tipo tipo, Precio precio, Pago pago) {
        this.idPelicula = idPelicula;
        this.idBoleta = idBoleta;
        this.idFuncion = idFuncion;
        this.idAsiento = idAsiento;
        this.idCliente = idCliente;
        this.tipo = tipo;
        this.precio = precio;
        this.pago = pago;
    }

    public IdPelicula getIdPelicula() {
        return idPelicula;
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
