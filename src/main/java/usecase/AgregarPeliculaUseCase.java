package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cine.Cine;
import domain.cine.commands.AgregarPeliculaCommand;

public class AgregarPeliculaUseCase  extends UseCase<RequestCommand<AgregarPeliculaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarPeliculaCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var cine = Cine.from(command.getIdCine(), retrieveEvents());

        cine.agregarPelicula(command.getIdPelicula());
        emit().onResponse(new ResponseEvents(cine.getUncommittedChanges()));
    }
}
