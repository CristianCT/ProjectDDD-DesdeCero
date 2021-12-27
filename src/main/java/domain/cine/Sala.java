package domain.cine;

import domain.cine.values.IdSala;
import domain.cine.values.Numeral;
import domain.cine.values.TipoProyeccion;
import co.com.sofka.domain.generic.Entity;

import java.util.HashSet;
import java.util.Set;

public class Sala extends Entity<IdSala> {

    private Numeral numeral;
    private TipoProyeccion tipoProyeccion;
    private Set<Asiento> asientos;

    public Sala(IdSala entityId, Numeral numeral, TipoProyeccion tipoProyeccion) {
        super(entityId);
        this.numeral = numeral;
        this.tipoProyeccion = tipoProyeccion;
        this.asientos = new HashSet<>();
    }

    public void agregarAsiento(Asiento asiento){
        this.asientos.add(asiento);
    }

    public void cambiarTipoProyeccion(TipoProyeccion tipoProyeccion){
        this.tipoProyeccion = tipoProyeccion;
    }

    public Numeral numeral() {
        return numeral;
    }

    public TipoProyeccion tipoProyeccion() {
        return tipoProyeccion;
    }

    public Set<Asiento> asientos() {
        return asientos;
    }
}
