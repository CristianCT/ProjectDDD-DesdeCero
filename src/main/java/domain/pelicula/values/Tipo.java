package domain.pelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Tipo implements ValueObject<Tipo.Properties> {
    private final String nombre;
    private final String descripcion;

    public Tipo(String nombre, String descripcion) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser null");
        if (this.nombre.isBlank()) throw new IllegalArgumentException("El nombre no puede ser vacio");
        if (this.nombre.length() < 3) throw new IllegalArgumentException("El nombre no es valido");

        this.descripcion = Objects.requireNonNull(descripcion, "La descripcion no puede ser null");
        if (this.descripcion.isBlank()) throw new IllegalArgumentException("La descripcion no puede ser vacio");
        if (this.descripcion.length() < 3) throw new IllegalArgumentException("La descripcion no es valida");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public String descripcion() {
                return descripcion;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tipo tipo = (Tipo) o;
        return Objects.equals(nombre, tipo.nombre) && Objects.equals(descripcion, tipo.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion);
    }

    public interface Properties {
        String nombre();
        String descripcion();
    }
}
