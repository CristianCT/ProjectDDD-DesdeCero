package domain.cliente;

import domain.cliente.values.Detalles;
import domain.cliente.values.IdVisita;
import co.com.sofka.domain.generic.Entity;
import domain.genericos.Fecha;

import java.util.Objects;

public class Visita extends Entity<IdVisita> {

    private Detalles detalles;
    private final Fecha fecha;

    public Visita(IdVisita entityId, Detalles detalles, Fecha fecha) {
        super(entityId);
        this.detalles = Objects.requireNonNull(detalles, "Los detalles no pueden ser null");
        this.fecha = Objects.requireNonNull(fecha, "La fecha no puede ser null");
    }

    public void modificarDetalles(Detalles detalles){
        this.detalles = Objects.requireNonNull(detalles, "Los detalles no pueden ser null");
    }

    public Detalles detalles() {
        return detalles;
    }

    public Fecha fecha() {
        return fecha;
    }
}
