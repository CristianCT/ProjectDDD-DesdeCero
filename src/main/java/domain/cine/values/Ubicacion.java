package domain.cine.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Ubicacion implements ValueObject<Ubicacion.Properties> {
    private final Ciudad ciudad;
    private final Direccion direccion;

    public Ubicacion(Ciudad ciudad, Direccion direccion) {
        this.ciudad = Objects.requireNonNull(ciudad, "La ciudad no puede ser null");
        this.direccion = Objects.requireNonNull(direccion, "La direccion no puede ser null");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public Ciudad ciudad() {
                return ciudad;
            }

            @Override
            public Direccion direccion() {
                return direccion;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ubicacion ubicacion = (Ubicacion) o;
        return Objects.equals(ciudad, ubicacion.ciudad) && Objects.equals(direccion, ubicacion.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ciudad, direccion);
    }

    public interface Properties {
        Ciudad ciudad();
        Direccion direccion();
    }
}
