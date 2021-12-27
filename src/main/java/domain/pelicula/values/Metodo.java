package domain.pelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Metodo implements ValueObject<String> {
    private final String valor;

    public Metodo(String valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if (this.valor.isBlank()) throw new IllegalArgumentException("El valor no puede ser vacio");
    }

    @Override
    public String value() {
        return this.valor;
    }
}
