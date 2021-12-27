package cliente.commands;

import cliente.values.Detalles;
import cliente.values.IdCliente;
import co.com.sofka.domain.generic.Command;
import genericos.Fecha;

public class AgregarVisitaCommand extends Command {
    private final IdCliente idCliente;
    private final Detalles detalles;
    private final Fecha fecha;

    public AgregarVisitaCommand(IdCliente idCliente, Detalles detalles, Fecha fecha) {
        this.idCliente = idCliente;
        this.detalles = detalles;
        this.fecha = fecha;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Detalles getDetalles() {
        return detalles;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
