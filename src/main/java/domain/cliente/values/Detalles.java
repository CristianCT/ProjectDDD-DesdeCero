package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Detalles implements ValueObject<Detalles.Properties> {
    private final NumeroPersonas numeroPersonas;
    private final Observacion observacion;

    public Detalles(NumeroPersonas numeroPersonas, Observacion observacion) {
        this.numeroPersonas = Objects.requireNonNull(numeroPersonas, "El numero de personas no puede ser null");
        this.observacion = Objects.requireNonNull(observacion, "Las observaciones no pueden ser null");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public NumeroPersonas numeroPersonas() {
                return numeroPersonas;
            }

            @Override
            public Observacion observacion() {
                return observacion;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detalles detalles = (Detalles) o;
        return Objects.equals(numeroPersonas, detalles.numeroPersonas) && Objects.equals(observacion, detalles.observacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroPersonas, observacion);
    }

    public interface Properties {
        NumeroPersonas numeroPersonas();
        Observacion observacion();
    }
}
