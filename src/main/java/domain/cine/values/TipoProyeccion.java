package domain.cine.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class TipoProyeccion implements ValueObject<TipoProyeccion.Properties> {
    private final String nombre;
    private final String caracteristicas;

    public TipoProyeccion(String nombre, String caracteristicas) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser null");
        if(this.nombre.isBlank()) throw new IllegalArgumentException("El nombre no puede ser vacio");
        if(this.nombre.length() < 3) throw new IllegalArgumentException("El nombre no es valido");

        this.caracteristicas = Objects.requireNonNull(caracteristicas, "Las caracteristicas no pueden ser null");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String caracteristicas() {
                return caracteristicas;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoProyeccion that = (TipoProyeccion) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(caracteristicas, that.caracteristicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, caracteristicas);
    }

    public interface Properties {
        String nombre();
        String caracteristicas();
    }
}
