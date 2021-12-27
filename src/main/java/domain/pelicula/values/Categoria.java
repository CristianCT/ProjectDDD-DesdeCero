package domain.pelicula.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Categoria implements ValueObject<Categoria.Properties> {
    private final String nombre;
    private final Double precio;

    public Categoria(String nombre, Double precio) {
        this.nombre = Objects.requireNonNull(nombre, "El nombreno puede ser null");
        if (this.nombre.isBlank()) throw new IllegalArgumentException("El nombre no puede ser vacio");
        if (this.nombre.length()<3) throw new IllegalArgumentException("El nombre no es valido");

        this.precio = Objects.requireNonNull(precio, "El precio no puede ser null");
        if (this.precio < 0) throw new IllegalArgumentException("El precio no puede ser negativo");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String nombre() {
                return nombre;
            }

            @Override
            public Double precio() {
                return precio;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Categoria categoria = (Categoria) o;
        return Objects.equals(nombre, categoria.nombre) && Objects.equals(precio, categoria.precio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, precio);
    }

    public interface Properties {
        String nombre();
        Double precio();
    }
}
