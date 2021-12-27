package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;

public class SaldoTarjetaCinecoDescontado extends DomainEvent {
    private final Double saldo;

    public SaldoTarjetaCinecoDescontado(Double saldo) {
        super("sofkau.domain.cliente.saldotarjetacinecodescontado");
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }
}
