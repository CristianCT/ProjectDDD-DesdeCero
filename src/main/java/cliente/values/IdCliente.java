package cliente.values;

import co.com.sofka.domain.generic.Identity;

public final class IdCliente extends Identity {
    private IdCliente(String valor){
        super(valor);
    }
    public static IdCliente of(String valor){
        return new IdCliente(valor);
    }
}
