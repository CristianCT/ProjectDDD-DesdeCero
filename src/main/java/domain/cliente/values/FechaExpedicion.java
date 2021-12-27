package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;

public final class FechaExpedicion implements ValueObject<LocalDate> {
    private final LocalDate valor;

    public FechaExpedicion() {
        this.valor = LocalDate.now();
    }

    @Override
    public LocalDate value() {
        return this.valor;
    }
}
