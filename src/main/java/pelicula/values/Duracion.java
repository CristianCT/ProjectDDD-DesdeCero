package pelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Duracion implements ValueObject<Duracion.Properties> {
    private final String unidadMedida;
    private final Double valor;

    public Duracion(String unidadMedida, Double valor) {
        this.unidadMedida = Objects.requireNonNull(unidadMedida, "La unidad de medida no puede ser null");
        if (this.unidadMedida.isBlank()) throw new IllegalArgumentException("La unidad de medida no puede ser vacio");

        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if (this.valor < 0) throw new IllegalArgumentException("El valor no puede ser negativo");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String unidadMedida() {
                return unidadMedida;
            }

            @Override
            public Double valor() {
                return valor;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duracion duracion = (Duracion) o;
        return Objects.equals(unidadMedida, duracion.unidadMedida) && Objects.equals(valor, duracion.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unidadMedida, valor);
    }

    public interface Properties {
        String unidadMedida();
        Double valor();
    }
}
