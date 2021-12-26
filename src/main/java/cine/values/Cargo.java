package cine.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Cargo implements ValueObject<Cargo.Properties> {
    private final String nombre;
    private final String descripcion;

    public Cargo(String nombre, String descripcion) {
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser null");
        if (this.nombre.isBlank()) throw new IllegalArgumentException("El nombre no puede ser vacio");

        this.descripcion = Objects.requireNonNull(descripcion, "La descripcion no puede ser null");
        if (this.descripcion.isBlank()) throw new IllegalArgumentException("La descripcion no puede ser vacio");
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
        Cargo cargo = (Cargo) o;
        return Objects.equals(nombre, cargo.nombre) && Objects.equals(descripcion, cargo.descripcion);
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
