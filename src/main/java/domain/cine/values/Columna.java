package domain.cine.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Columna implements ValueObject<Integer> {
    private final Integer valor;

    public Columna(Integer valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if(this.valor <= 0) throw new IllegalArgumentException("El valor debe ser mayor a cero (0)");
    }

    @Override
    public Integer value() {
        return this.valor;
    }
}
