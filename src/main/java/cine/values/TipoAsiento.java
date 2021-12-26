package cine.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class TipoAsiento implements ValueObject<TipoAsiento.Properties> {

    private final Distintivo distintivo;
    private final Modelo modelo;

    public TipoAsiento(Distintivo distintivo, Modelo modelo) {
        this.distintivo = Objects.requireNonNull(distintivo, "El distintivo no puuede ser null");
        this.modelo = Objects.requireNonNull(modelo, "El modelo no puuede ser null");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public Distintivo distintivo() {
                return distintivo;
            }

            @Override
            public Modelo modelo() {
                return modelo;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoAsiento that = (TipoAsiento) o;
        return Objects.equals(distintivo, that.distintivo) && Objects.equals(modelo, that.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(distintivo, modelo);
    }

    public interface Properties {
        Distintivo distintivo();
        Modelo modelo();
    }
}
