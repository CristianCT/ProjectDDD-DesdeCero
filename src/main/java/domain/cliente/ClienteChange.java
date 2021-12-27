package domain.cliente;

import domain.cliente.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class ClienteChange extends EventChange {
    public ClienteChange(Cliente cliente) {
        apply((ClienteCreado event) -> {
            cliente.nombre = event.getNombre();
            cliente.apellidos = event.getApellidos();
            cliente.fechaNacimiento = event.getFechaNacimiento();
            cliente.cuenta = null;
            cliente.visitas = new HashSet<>();
        });

        apply((EmailDeCuentaCambiado event) -> {
            cliente.cuenta.cambiarEmail(event.getEmail());
        });

        apply((PasswordCuentaCambiado event) -> {
            cliente.cuenta.cambiarPassword(event.getPassword());
        });

        apply((PuntosCuentaAgregados event) -> {
            cliente.cuenta.agregarPuntos(event.getPuntos());
        });

        apply((SaldoTarjetaCinecoRecargado event) -> {
            cliente.cuenta.tarjetaCineco().recargarSaldo(event.getSaldo());
        });

        apply((SaldoTarjetaCinecoDescontado event) -> {
            cliente.cuenta.tarjetaCineco().descontarSaldo(event.getSaldo());
        });

        apply((VisitaAgregada event) -> {
            cliente.visitas.add(
                new Visita(
                    event.getIdVisita(),
                    event.getDetalles(),
                    event.getFecha()
                )
            );
        });

        apply((DetallesVisitaModificados event) -> {
            cliente.visitas
                .stream()
                    .filter(visita -> visita.identity().equals(event.getIdVisita()))
                    .forEach(visita -> visita.modificarDetalles(event.getDetalles()));
        });

        apply((CuentaAsociada event) -> {
            cliente.cuenta = new Cuenta(
                    event.getIdCuenta(),
                    event.getEmail(),
                    event.getPassword(),
                    event.getPuntuacion()
            );
        });

        apply((TarjetaCinecoAsociada event) -> {
            cliente.cuenta.asociarTarjeta(
                new TarjetaCineco(
                    event.getIdTarjeta(),
                    event.getMembresia(),
                    event.getCVC(),
                    event.getFechaExpedicion(),
                    event.getFechaVencimiento(),
                    event.getSaldo()
                )
            );
        });
    }
}
