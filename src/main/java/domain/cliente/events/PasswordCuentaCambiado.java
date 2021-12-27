package domain.cliente.events;

import domain.cliente.values.Password;
import co.com.sofka.domain.generic.DomainEvent;

public class PasswordCuentaCambiado extends DomainEvent {
    private final Password password;

    public PasswordCuentaCambiado(Password password) {
        super("sofkau.domain.cliente.passwordcuentacambiado");
        this.password = password;
    }

    public Password getPassword() {
        return password;
    }
}
