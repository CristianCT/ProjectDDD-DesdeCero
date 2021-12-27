package domain.cliente.commands;

import domain.cliente.values.IdCliente;
import co.com.sofka.domain.generic.Command;

public class RecargarSaldoTarjetaCinecoCommand extends Command {
    private final IdCliente idCliente;
    private final Double saldo;

    public RecargarSaldoTarjetaCinecoCommand(IdCliente idCliente, Double saldo) {
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
