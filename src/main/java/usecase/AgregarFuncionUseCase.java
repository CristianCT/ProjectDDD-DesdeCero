package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.pelicula.Pelicula;
import domain.pelicula.commands.AgregarFuncionCommand;

public class AgregarFuncionUseCase extends UseCase<RequestCommand<AgregarFuncionCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarFuncionCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var pelicula = Pelicula.from(command.getIdPelicula(), retrieveEvents());

        pelicula.agregarFuncion(command.getPrecioBase(), command.getFecha());
        emit().onResponse(new ResponseEvents(pelicula.getUncommittedChanges()));
    }
}
