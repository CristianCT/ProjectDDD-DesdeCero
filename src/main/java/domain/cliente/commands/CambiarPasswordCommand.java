package domain.cliente.commands;

import domain.cliente.values.IdCliente;
import domain.cliente.values.Password;
import co.com.sofka.domain.generic.Command;

public class CambiarPasswordCommand extends Command {
    private final IdCliente idCliente;
    private final Password password;

    public CambiarPasswordCommand(IdCliente idCliente, Password password) {
        this.idCliente = idCliente;
        this.password = password;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Password getPassword() {
        return password;
    }
}
