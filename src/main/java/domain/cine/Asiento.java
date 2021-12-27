package domain.cine;

import domain.cine.values.*;
import co.com.sofka.domain.generic.Entity;
import domain.genericos.PrecioBase;

public class Asiento extends Entity<IdAsiento> {

    private Fila fila;
    private Columna columna;
    private PrecioBase precioBase;
    private TipoAsiento tipoAsiento;

    public Asiento(IdAsiento entityId, Fila fila, Columna columna, PrecioBase precioBase, TipoAsiento tipoAsiento) {
        super(entityId);
        this.fila = fila;
        this.columna = columna;
        this.precioBase = precioBase;
        this.tipoAsiento = tipoAsiento;
    }

    public void cambiarTipoAsiento(TipoAsiento tipoAsiento){
        this.tipoAsiento = tipoAsiento;
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
