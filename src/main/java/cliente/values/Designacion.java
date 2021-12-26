package cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Designacion implements ValueObject<String> {
    private final String valor;

    public Designacion(String valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if (this.valor.isBlank()) throw new IllegalArgumentException("El valor no debe ser vacio");
        if(this.valor.length()<3) throw new IllegalArgumentException("El valor no es valido");
    }

    @Override
    public String value() {
        return this.valor;
    }
}
