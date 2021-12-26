package genericos;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDateTime;
import java.util.Objects;

public final class Fecha implements ValueObject<LocalDateTime> {
    private final LocalDateTime valor;

    public Fecha(LocalDateTime valor) {
        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
    }

    @Override
    public LocalDateTime value() {
        return this.valor;
    }
}
