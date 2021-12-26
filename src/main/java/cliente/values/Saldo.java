package cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Saldo implements ValueObject<Double> {
    private final Double valor;

    public Saldo(Double valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if(this.valor < 0) throw new IllegalArgumentException("El valor no es valido");
    }

    @Override
    public Double value() {
        return this.valor;
    }
}
