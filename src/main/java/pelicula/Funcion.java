package pelicula;

import genericos.Fecha;
import genericos.PrecioBase;
import co.com.sofka.domain.generic.Entity;
import pelicula.values.IdFuncion;

import java.util.HashSet;
import java.util.Set;

public class Funcion extends Entity<IdFuncion> {

    private PrecioBase precioBase;
    private Fecha fecha;
    private Set<Boleta> boletas;

    public Funcion(IdFuncion entityId, PrecioBase precioBase, Fecha fecha) {
        super(entityId);
        this.precioBase = precioBase;
        this.fecha = fecha;
        this.boletas = new HashSet<>();
    }

    public void cambiarFecha(Fecha fecha){
        this.fecha = fecha;
    }

    public void cambiarPrecioBase(PrecioBase precioBase){
        this.precioBase = precioBase;
    }

    public void agregarBoleta(Boleta boleta){
        this.boletas.add(boleta);
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
