package cliente.events;

import co.com.sofka.domain.generic.DomainEvent;

public class PuntosCuentaAgregados extends DomainEvent {
    private final Integer puntos;

    public PuntosCuentaAgregados(Integer puntos) {
        super("sofkau.cliente.puntoscuentaagregados");
        this.puntos = puntos;
    }

    public Integer getPuntos() {
        return puntos;
    }
}
