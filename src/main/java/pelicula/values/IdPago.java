package pelicula.values;

import co.com.sofka.domain.generic.Identity;

public final class IdPago extends Identity {
    private IdPago(String valor){
        super(valor);
    }
    public static IdPago of(String valor){
        return new IdPago(valor);
    }
}
