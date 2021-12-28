package domain.cliente;

import domain.cliente.values.Email;
import domain.cliente.values.IdCuenta;
import domain.cliente.values.Password;
import domain.cliente.values.Puntuacion;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cuenta extends Entity<IdCuenta> {

    private Email email;
    private Password password;
    private Puntuacion puntuacion;
    private TarjetaCineco tarjetaCineco;

    public Cuenta(IdCuenta entityId, Email email, Password password, Puntuacion puntuacion) {
        super(entityId);
        this.email = Objects.requireNonNull(email, "El email no puede ser null");
        this.password = Objects.requireNonNull(password, "La Password no puede ser null");
        this.puntuacion = Objects.requireNonNull(puntuacion, "La puntuacion no puede ser null");
        this.tarjetaCineco = null;
    }

    public void cambiarEmail(Email email){
        this.email = Objects.requireNonNull(email, "El email no puede ser null");
    }

    public void cambiarPassword(Password password){
        this.password = Objects.requireNonNull(password, "La Password no puede ser null");
    }

    public void agregarPuntos(Integer valor) {
        this.puntuacion = new Puntuacion(this.puntuacion.value()+valor);
    }

    public void asociarTarjeta(TarjetaCineco tarjetaCineco){
        this.tarjetaCineco = Objects.requireNonNull(tarjetaCineco, "La terjeta no puede ser null");
    }

    public Email email() {
        return email;
    }

    public Password password() {
        return password;
    }

    public Puntuacion puntuacion() {
        return puntuacion;
    }

    public TarjetaCineco tarjetaCineco() {
        return tarjetaCineco;
    }
}
