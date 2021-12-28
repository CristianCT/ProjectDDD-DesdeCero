package domain.cine;

import domain.cine.values.IdSala;
import domain.cine.values.Numeral;
import domain.cine.values.TipoProyeccion;
import co.com.sofka.domain.generic.Entity;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Sala extends Entity<IdSala> {

    private Numeral numeral;
    private TipoProyeccion tipoProyeccion;
    private Set<Asiento> asientos;

    public Sala(IdSala entityId, Numeral numeral, TipoProyeccion tipoProyeccion) {
        super(entityId);
        this.numeral = Objects.requireNonNull(numeral, "El numeral no puede ser null");
        this.tipoProyeccion = Objects.requireNonNull(tipoProyeccion, "El tipo de proyeccion no puede ser null");
        this.asientos = new HashSet<>();
    }

    public void agregarAsiento(Asiento asiento){
        this.asientos.add(Objects.requireNonNull(asiento, "El asiento no puede ser null"));
    }

    public void cambiarTipoProyeccion(TipoProyeccion tipoProyeccion){
        this.tipoProyeccion = Objects.requireNonNull(tipoProyeccion, "El tipo de proyeccion no puede ser null");;
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
