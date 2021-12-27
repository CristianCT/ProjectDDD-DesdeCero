package pelicula.commands;

import co.com.sofka.domain.generic.Command;
import pelicula.values.IdBoleta;
import pelicula.values.IdFuncion;
import pelicula.values.IdPelicula;
import pelicula.values.Pagado;

public class MarcarPAgoComoPagadoCommand extends Command {
    private final IdPelicula idPelicula;
    private final IdFuncion idFuncion;
    private final IdBoleta idBoleta;
    private final Pagado pagado;

    public MarcarPAgoComoPagadoCommand(IdPelicula idPelicula, IdFuncion idFuncion, IdBoleta idBoleta, Pagado pagado) {
        this.idPelicula = idPelicula;
        this.idFuncion = idFuncion;
        this.idBoleta = idBoleta;
        this.pagado = pagado;
    }

    public IdPelicula getIdPelicula() {
        return idPelicula;
    }

    public IdFuncion getIdFuncion() {
        return idFuncion;
    }

    public IdBoleta getIdBoleta() {
        return idBoleta;
    }

    public Pagado getPagado() {
        return pagado;
    }
}
