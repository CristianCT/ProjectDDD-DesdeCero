package cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Puntuacion implements ValueObject<Integer> {
    private final Integer valor;

    public Puntuacion(Integer valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if(this.valor < 0) throw new IllegalArgumentException("El valor no es valido");
    }

    @Override
    public Integer value() {
        return this.valor;
    }
}
