package cliente.commands;

import cliente.values.Detalles;
import cliente.values.IdCliente;
import cliente.values.IdVisita;
import co.com.sofka.domain.generic.Command;

public class ModificarDetallesVisitaCommand extends Command {
    private final IdCliente idCliente;
    private final IdVisita idVisita;
    private final Detalles detalles;

    public ModificarDetallesVisitaCommand(IdCliente idCliente, IdVisita idVisita, Detalles detalles) {
        this.idCliente = idCliente;
        this.idVisita = idVisita;
        this.detalles = detalles;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public IdVisita getIdVisita() {
        return idVisita;
    }

    public Detalles getDetalles() {
        return detalles;
    }
}
