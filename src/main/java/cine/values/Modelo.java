package cine.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Modelo implements ValueObject<Modelo.Properties> {
    private final Marca marca;
    private final Referencia referencia;

    public Modelo(Marca marca, Referencia referencia) {
        this.marca = marca;
        this.referencia = referencia;
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public Marca marca() {
                return marca;
            }

            @Override
            public Referencia referencia() {
                return referencia;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Modelo modelo = (Modelo) o;
        return Objects.equals(marca, modelo.marca) && Objects.equals(referencia, modelo.referencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, referencia);
    }

    public interface Properties {
        Marca marca();
        Referencia referencia();
    }
}
