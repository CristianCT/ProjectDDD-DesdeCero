package cliente.events;

import cliente.values.Password;
import co.com.sofka.domain.generic.DomainEvent;

public class PasswordCuentaCambiado extends DomainEvent {
    private final Password password;

    public PasswordCuentaCambiado(Password password) {
        super("sofkau.cliente.passwordcuentacambiado");
        this.password = password;
    }

    public Password getPassword() {
        return password;
    }
}
