package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cine.Cine;
import domain.cine.commands.AgregarSalaCommand;

public class AgregarSalaUseCase extends UseCase<RequestCommand<AgregarSalaCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<AgregarSalaCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var cine = Cine.from(command.getIdCine(), retrieveEvents());

        cine.agregarSala(command.getNumeral(), command.getTipoProyeccion());
        emit().onResponse(new ResponseEvents(cine.getUncommittedChanges()));
    }
}
