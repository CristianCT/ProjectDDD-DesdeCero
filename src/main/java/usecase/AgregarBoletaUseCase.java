package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.pelicula.Pelicula;
import domain.pelicula.commands.AgregarBoletaFuncionCommand;

public class AgregarBoletaUseCase extends UseCase<RequestCommand<AgregarBoletaFuncionCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarBoletaFuncionCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var pelicula = Pelicula.from(command.getIdPelicula(), retrieveEvents());

        pelicula.agregarBoletaFuncion(command.getIdFuncion(), command.getIdAsiento(), command.getIdCliente(), command.getTipo(), command.getPrecio(), command.getPago());
        emit().onResponse(new ResponseEvents(pelicula.getUncommittedChanges()));
    }
}
