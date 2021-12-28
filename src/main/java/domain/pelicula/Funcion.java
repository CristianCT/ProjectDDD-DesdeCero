package domain.pelicula;

import domain.genericos.Fecha;
import domain.genericos.PrecioBase;
import co.com.sofka.domain.generic.Entity;
import domain.pelicula.values.IdFuncion;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Funcion extends Entity<IdFuncion> {

    private PrecioBase precioBase;
    private Fecha fecha;
    private Set<Boleta> boletas;

    public Funcion(IdFuncion entityId, PrecioBase precioBase, Fecha fecha) {
        super(entityId);
        this.precioBase = Objects.requireNonNull(precioBase, "El precio base no puede ser null");
        this.fecha = Objects.requireNonNull(fecha, "La fehca no puede ser null");
        this.boletas = new HashSet<>();
    }

    public void cambiarFecha(Fecha fecha){
        this.fecha = Objects.requireNonNull(fecha, "La fehca no puede ser null");
    }

    public void cambiarPrecioBase(PrecioBase precioBase){
        this.precioBase = Objects.requireNonNull(precioBase, "El precio base no puede ser null");
    }

    public void agregarBoleta(Boleta boleta){
        this.boletas.add(Objects.requireNonNull(boleta, "La boleta no puede ser null"));
    }

    public PrecioBase precioBase() {
        return precioBase;
    }

    public Fecha fecha() {
        return fecha;
    }

    public Set<Boleta> boletas() {
        return boletas;
    }
}
