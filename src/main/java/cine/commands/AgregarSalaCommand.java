package cine.commands;

import cine.values.IdCine;
import cine.values.Numeral;
import cine.values.TipoProyeccion;
import co.com.sofka.domain.generic.Command;

public class AgregarSalaCommand extends Command{
    private final IdCine idCine;
    private final Numeral numeral;
    private final TipoProyeccion tipoProyeccion;


    public AgregarSalaCommand(IdCine idCine, Numeral numeral, TipoProyeccion tipoProyeccion) {
        this.idCine = idCine;
        this.numeral = numeral;
        this.tipoProyeccion = tipoProyeccion;
    }

    public IdCine getIdCine() {
        return idCine;
    }

    public Numeral getNumeral() {
        return numeral;
    }

    public TipoProyeccion getTipoProyeccion() {
        return tipoProyeccion;
    }
}
