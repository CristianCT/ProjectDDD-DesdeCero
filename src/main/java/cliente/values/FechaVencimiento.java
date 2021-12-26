package cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public final class FechaVencimiento implements ValueObject<LocalDate> {
    private final LocalDate valor;

    public FechaVencimiento(LocalDate valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if(this.valor.isAfter(LocalDate.now())) throw new IllegalArgumentException("El valor no puede haber pasado");
    }

    @Override
    public LocalDate value() {
        return this.valor;
    }
}
