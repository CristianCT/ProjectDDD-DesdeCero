package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Observacion implements ValueObject<String> {
    private final String valor;

    public Observacion(String valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
    }

    @Override
    public String value() {
        return this.valor;
    }
}
