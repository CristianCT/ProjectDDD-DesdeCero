package domain.cliente.commands;

import domain.cliente.values.Email;
import domain.cliente.values.IdCliente;
import co.com.sofka.domain.generic.Command;

public class CambiarEmailCommand extends Command {
    private final IdCliente idCliente;
    private final Email emai;

    public CambiarEmailCommand(IdCliente idCliente, Email emai) {
        this.idCliente = idCliente;
        this.emai = emai;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Email getEmai() {
        return emai;
    }
}
