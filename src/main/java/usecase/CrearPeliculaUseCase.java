package usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import domain.pelicula.Pelicula;
import domain.pelicula.commands.CrearPeliculaCommand;

public class CrearPeliculaUseCase extends UseCase<RequestCommand<CrearPeliculaCommand>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearPeliculaCommand> requestCommand) {
        var command = requestCommand.getCommand();
        var pelicula = new Pelicula(command.getIdPelicula(), command.getTitulo(), command.getDuracion(), command.getCategoria());
        emit().onResponse(new ResponseEvents(pelicula.getUncommittedChanges()));
    }
}
