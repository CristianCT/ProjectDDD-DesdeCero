package domain.cine;

import domain.cine.values.*;
import co.com.sofka.domain.generic.Entity;
import domain.genericos.PrecioBase;

import java.util.Objects;

public class Asiento extends Entity<IdAsiento> {

    private Fila fila;
    private Columna columna;
    private PrecioBase precioBase;
    private TipoAsiento tipoAsiento;

    public Asiento(IdAsiento entityId, Fila fila, Columna columna, PrecioBase precioBase, TipoAsiento tipoAsiento) {
        super(entityId);
        this.fila = Objects.requireNonNull(fila, "La fila no puede ser null");
        this.columna = Objects.requireNonNull(columna, "La columna no puede ser null");
        this.precioBase = Objects.requireNonNull(precioBase, "El precio base no puede ser null");
        this.tipoAsiento = Objects.requireNonNull(tipoAsiento, "El tipo de asiento no puede ser null");
    }

    public void cambiarTipoAsiento(TipoAsiento tipoAsiento){
        this.tipoAsiento = Objects.requireNonNull(tipoAsiento, "El tipo de asiento no puede ser null");
    }

    public Fila fila() {
        return fila;
    }

    public Columna columna() {
        return columna;
    }

    public PrecioBase precioBase() {
        return precioBase;
    }

    public TipoAsiento tipoAsiento() {
        return tipoAsiento;
    }
}
