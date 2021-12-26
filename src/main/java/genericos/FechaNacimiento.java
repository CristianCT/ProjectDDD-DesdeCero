package genericos;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;
import java.util.Objects;

public final class FechaNacimiento implements ValueObject<LocalDate> {
    private final LocalDate valor;

    public FechaNacimiento(LocalDate valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if(this.valor.isBefore(LocalDate.now())) throw new IllegalArgumentException("El valor no es valido");
    }

    @Override
    public LocalDate value() {
        return this.valor;
    }
}
