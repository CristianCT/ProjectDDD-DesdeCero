package cine.values;

import co.com.sofka.domain.generic.Identity;

public final class IdSala extends Identity {
    private IdSala(String valor){
        super(valor);
    }
    public static IdSala of(String valor){
        return new IdSala(valor);
    }
}
