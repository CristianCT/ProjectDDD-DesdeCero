package cliente;

import cliente.values.Email;
import cliente.values.IdCuenta;
import cliente.values.Password;
import cliente.values.Puntuacion;
import co.com.sofka.domain.generic.Entity;

public class Cuenta extends Entity<IdCuenta> {

    private Email email;
    private Password password;
    private Puntuacion puntuacion;
    private TarjetaCineco tarjetaCineco;

    public Cuenta(IdCuenta entityId, Email email, Password password, Puntuacion puntuacion) {
        super(entityId);
        this.email = email;
        this.password = password;
        this.puntuacion = puntuacion;
        this.tarjetaCineco = null;
    }

    public void cambiarEmail(Email email){
        this.email = email;
    }

    public void cambiarPassword(Password password){
        this.password = password;
    }

    public void agregarPuntos(Integer valor) {
        this.puntuacion = new Puntuacion(this.puntuacion.value()+valor);
    }

    public void asociarTarjeta(TarjetaCineco tarjetaCineco){
        this.tarjetaCineco = tarjetaCineco;
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
