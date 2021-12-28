package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.cine.Cine;
import domain.cine.commands.AgregarEmpleadoCommand;

public class AgregarEmpleadoUseCase extends UseCase<RequestCommand<AgregarEmpleadoCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarEmpleadoCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var cine = Cine.from(command.getIdCine(), retrieveEvents());

        cine.agregarEmpleado(command.getNombre(), command.getApellidos(), command.getCargo(), command.getFechaNacimiento(), command.getTelefono());
        emit().onResponse(new ResponseEvents(cine.getUncommittedChanges()));
    }
}
