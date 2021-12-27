package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;
import domain.genericos.Descripcion;
import domain.genericos.Descuento;

import java.util.Objects;

public final class Beneficio implements ValueObject<Beneficio.Properties> {
    private final Descuento descuento;
    private final Descripcion descripcion;

    public Beneficio(Descuento descuento, Descripcion descripcion) {
        this.descuento = Objects.requireNonNull(descuento, "El descuento no puede ser null");
        this.descripcion = Objects.requireNonNull(descripcion, "La descripcion no puede ser null");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public Descuento descuento() {
                return descuento;
            }

            @Override
            public Descripcion descripcion() {
                return descripcion;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beneficio beneficio = (Beneficio) o;
        return Objects.equals(descuento, beneficio.descuento) && Objects.equals(descripcion, beneficio.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descuento, descripcion);
    }

    public interface Properties {
        Descuento descuento();
        Descripcion descripcion();
    }
}
