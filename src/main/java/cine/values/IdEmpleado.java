package cine.values;

import co.com.sofka.domain.generic.Identity;

public final class IdEmpleado extends Identity {
    private IdEmpleado(String valor){
        super(valor);
    }

    public IdEmpleado(){
        super();
    }

    public static IdEmpleado of(String valor){
        return new IdEmpleado(valor);
    }
}
