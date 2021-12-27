package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Email implements ValueObject<String> {
    private final String valor;

    public Email(String valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if(this.valor.isBlank()) throw new IllegalArgumentException("El valor no puede ser vacio");
        if(!this.valor.contains("@")) throw new IllegalArgumentException("El valor no es valido");
    }

    @Override
    public String value() {
        return this.valor;
    }
}
