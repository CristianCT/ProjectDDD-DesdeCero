package domain.cliente.commands;

import domain.cliente.values.IdCliente;
import co.com.sofka.domain.generic.Command;

public class AgregarPuntosCuentaCommand extends Command {
    private final IdCliente idCliente;
    private final Integer puntos;

    public AgregarPuntosCuentaCommand(IdCliente idCliente, Integer puntos) {
        this.idCliente = idCliente;
        this.puntos = puntos;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Integer getPuntos() {
        return puntos;
    }
}
