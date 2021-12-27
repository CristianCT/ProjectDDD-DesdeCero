package domain.pelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Pagado implements ValueObject<Boolean> {
    private final Boolean valor;

    public Pagado(Boolean valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
    }

    @Override
    public Boolean value() {
        return this.valor;
    }
}
