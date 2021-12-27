package domain.cliente;

import domain.cliente.values.Detalles;
import domain.cliente.values.IdVisita;
import co.com.sofka.domain.generic.Entity;
import domain.genericos.Fecha;

public class Visita extends Entity<IdVisita> {

    private Detalles detalles;
    private final Fecha fecha;

    public Visita(IdVisita entityId, Detalles detalles, Fecha fecha) {
        super(entityId);
        this.detalles = detalles;
        this.fecha = fecha;
    }

    public void modificarDetalles(Detalles detalles){
        this.detalles = detalles;
    }

    public Detalles detalles() {
        return detalles;
    }

    public Fecha fecha() {
        return fecha;
    }
}