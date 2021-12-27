package domain.pelicula.values;

import co.com.sofka.domain.generic.Identity;

public final class IdFuncion extends Identity {
    private IdFuncion(String valor){
        super(valor);
    }
    public IdFuncion(){
        super();
    }
    public static IdFuncion of(String valor){
        return new IdFuncion(valor);
    }
}
