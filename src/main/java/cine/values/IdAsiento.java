package cine.values;

import co.com.sofka.domain.generic.Identity;

public final class IdAsiento extends Identity {
    private IdAsiento(String valor){
        super(valor);
    }
    public static IdAsiento of(String valor){
        return new IdAsiento(valor);
    }
}
