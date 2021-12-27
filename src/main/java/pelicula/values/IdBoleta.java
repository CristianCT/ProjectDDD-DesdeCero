package pelicula.values;

import co.com.sofka.domain.generic.Identity;

public final class IdBoleta extends Identity {
    private IdBoleta(String valor){
        super(valor);
    }
    public IdBoleta(){
        super();
    }
    public static IdBoleta of(String valor){
        return new IdBoleta(valor);
    }
}
