package pelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Precio implements ValueObject<Double> {
    private final Double valor;

    public Precio(Double valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if (this.valor < 0) throw new IllegalArgumentException("El valor no puede ser negativo");
    }

    @Override
    public Double value() {
        return this.valor;
    }
}
