package domain.cliente.commands;

import domain.cliente.values.IdCliente;
import co.com.sofka.domain.generic.Command;

public class DescontarSaldoTarjetaCinecoCommand extends Command {
    private final IdCliente idCliente;
    private final Double saldo;

    public DescontarSaldoTarjetaCinecoCommand(IdCliente idCliente, Double saldo) {
        this.idCliente = idCliente;
        this.saldo = saldo;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Double getSaldo() {
        return saldo;
    }
}
