package domain.cliente.values;

import co.com.sofka.domain.generic.Identity;

public final class IdCuenta extends Identity {
    private IdCuenta(String valor){
        super(valor);
    }
    public IdCuenta(){
        super();
    }
    public static IdCuenta of(String valor){
        return new IdCuenta(valor);
    }
}
