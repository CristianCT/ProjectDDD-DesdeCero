package domain.pelicula.values;

import co.com.sofka.domain.generic.Identity;

public final class IdPelicula extends Identity {
    private IdPelicula(String valor){
        super(valor);
    }
    public IdPelicula(){
        super();
    }
    public static IdPelicula of(String valor){
        return new IdPelicula(valor);
    }
}
