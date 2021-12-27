package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.Set;

public final class Membresia implements ValueObject<Membresia.Properties> {
    private final Designacion designacion;
    private final Set<Beneficio> beneficios;

    public Membresia(Designacion designacion, Set<Beneficio> beneficios) {
        this.designacion = Objects.requireNonNull(designacion, "La designacion no puede ser null");
        this.beneficios = Objects.requireNonNull(beneficios, "Los beneficios no pueden ser null");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public Designacion designacion() {
                return designacion;
            }

            @Override
            public Set<Beneficio> beneficios() {
                return beneficios;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Membresia membresia = (Membresia) o;
        return Objects.equals(designacion, membresia.designacion) && Objects.equals(beneficios, membresia.beneficios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(designacion, beneficios);
    }

    public interface Properties {
        Designacion designacion();
        Set<Beneficio> beneficios();
    }
}
