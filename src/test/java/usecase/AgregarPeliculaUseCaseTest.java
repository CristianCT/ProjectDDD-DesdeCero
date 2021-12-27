package usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import domain.cine.Cine;
import domain.cine.commands.AgregarPeliculaCommand;
import domain.cine.events.CineCreado;
import domain.cine.events.PeliculaAgregada;
import domain.cine.values.*;
import domain.pelicula.values.IdPelicula;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AgregarPeliculaUseCaseTest {

    @Mock
    DomainEventRepository repository;

    @Test
    public void agregarPelicula(){


    }


}