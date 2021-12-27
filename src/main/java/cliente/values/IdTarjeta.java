package cliente.values;

import co.com.sofka.domain.generic.Identity;

public class IdTarjeta extends Identity {
    private IdTarjeta(String valor){
        super(valor);
    }
    public IdTarjeta(){
        super();
    }
    public static IdTarjeta of(String valor){
        return new IdTarjeta(valor);
    }
}
