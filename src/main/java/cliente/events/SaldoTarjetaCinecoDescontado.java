package cliente.events;

import co.com.sofka.domain.generic.DomainEvent;

public class SaldoTarjetaCinecoDescontado extends DomainEvent {
    private final Double saldo;

    public SaldoTarjetaCinecoDescontado(Double saldo) {
        super("sofkau.cliente.saldotarjetacinecodescontado");
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }
}
