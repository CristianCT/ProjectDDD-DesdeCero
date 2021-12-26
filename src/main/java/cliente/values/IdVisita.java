package cliente.values;

import co.com.sofka.domain.generic.Identity;

public class IdVisita extends Identity {
    private IdVisita(String valor){
        super(valor);
    }
    public static IdVisita of(String valor){
        return new IdVisita(valor);
    }
}
