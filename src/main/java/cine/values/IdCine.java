package cine.values;

import co.com.sofka.domain.generic.Identity;

public final class IdCine extends Identity {
    private IdCine(String valor){
        super(valor);
    }
    public static IdCine of(String valor){
        return new IdCine(valor);
    }
}
