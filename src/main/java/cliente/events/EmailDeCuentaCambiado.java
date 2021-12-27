package cliente.events;

import cliente.values.Email;
import co.com.sofka.domain.generic.DomainEvent;

public class EmailDeCuentaCambiado extends DomainEvent {
    private final Email email;

    public EmailDeCuentaCambiado(Email email) {
        super("sofkau.cliente.emaildecuentacambiado");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
