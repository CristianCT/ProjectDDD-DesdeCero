package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;

public class SaldoTarjetaCinecoRecargado extends DomainEvent {
    private final Double saldo;

    public SaldoTarjetaCinecoRecargado(Double saldo) {
        super("sofkau.domain.cliente.saldotarjetacinecorecargado");
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }
}
