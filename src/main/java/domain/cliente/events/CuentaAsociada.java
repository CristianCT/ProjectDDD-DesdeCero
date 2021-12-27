package domain.cliente.events;

import domain.cliente.values.Email;
import domain.cliente.values.IdCuenta;
import domain.cliente.values.Password;
import domain.cliente.values.Puntuacion;
import co.com.sofka.domain.generic.DomainEvent;

public class CuentaAsociada extends DomainEvent {
    private final Email email;
    private final Password password;
    private final IdCuenta idCuenta;
    private final Puntuacion puntuacion;

    public CuentaAsociada(IdCuenta idCuenta, Email email, Password password, Puntuacion puntuacion) {
        super("sofkau.domain.cliente.cuentaasociada");
        this.idCuenta = idCuenta;
        this.email = email;
        this.password = password;
        this.puntuacion = puntuacion;
    }

    public IdCuenta getIdCuenta() {
        return idCuenta;
    }

    public Email getEmail() {
        return email;
    }

    public Password getPassword() {
        return password;
    }

    public Puntuacion getPuntuacion() {
        return puntuacion;
    }
}
