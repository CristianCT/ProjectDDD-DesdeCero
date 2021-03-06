package domain.cliente.commands;

import domain.cliente.values.Email;
import domain.cliente.values.IdCliente;
import domain.cliente.values.Password;
import co.com.sofka.domain.generic.Command;

public class AsociarCuentaCommand extends Command {
    private final IdCliente idCliente;
    private final Email email;
    private final Password password;

    public AsociarCuentaCommand(IdCliente idCliente, Email email, Password password) {
        this.idCliente = idCliente;
        this.email = email;
        this.password = password;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Email getEmail() {
        return email;
    }

    public Password getPassword() {
        return password;
    }
}
