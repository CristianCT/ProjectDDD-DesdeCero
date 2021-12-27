package domain.cine.values;

import co.com.sofka.domain.generic.Identity;

public final class IdAsiento extends Identity {
    private IdAsiento(String valor){
        super(valor);
    }

    public IdAsiento(){
        super();
    }
    public static IdAsiento of(String valor){
        return new IdAsiento(valor);
    }
}
