package domain.cliente.commands;

import domain.cliente.values.*;
import co.com.sofka.domain.generic.Command;

public class AsociarTarjetaCuentaCommand extends Command {
    private final IdCliente idCliente;
    private final Membresia membresia;
    private final CodigoCVC CVC;
    private final FechaVencimiento fechaVencimiento;
    private final Saldo saldo;

    public AsociarTarjetaCuentaCommand(IdCliente idCliente, Membresia membresia, CodigoCVC CVC, FechaVencimiento fechaVencimiento, Saldo saldo) {
        this.idCliente = idCliente;
        this.membresia = membresia;
        this.CVC = CVC;
        this.fechaVencimiento = fechaVencimiento;
        this.saldo = saldo;
    }

    public IdCliente getIdCliente() {
        return idCliente;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public CodigoCVC getCVC() {
        return CVC;
    }

    public FechaVencimiento getFechaVencimiento() {
        return fechaVencimiento;
    }

    public Saldo getSaldo() {
        return saldo;
    }
}
