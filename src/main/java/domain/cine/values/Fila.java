package domain.cine.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Fila implements ValueObject<String> {
    private final String valor;

    public Fila(String valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if (this.valor.isBlank()) throw new IllegalArgumentException("El valor no puede ser vacio");
        if (this.valor.length() > 2) throw new IllegalArgumentException("El valor no es valido");
    }

    @Override
    public String value() {
        return this.valor;
    }
}
