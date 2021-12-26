package cine.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Dia implements ValueObject<Dia.Properties> {
    private final DiaSemana diaSemana;
    private final HorasActividad horasActividad;

    public Dia(DiaSemana diaSemana, HorasActividad horasActividad) {
        this.diaSemana = Objects.requireNonNull(diaSemana, "El dia de la semana no puede ser null");
        this.horasActividad = Objects.requireNonNull(horasActividad, "Las horas de actividad no pueden ser null");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public DiaSemana diaSemana() {
                return diaSemana;
            }

            @Override
            public HorasActividad horasActividad() {
                return horasActividad;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dia dia = (Dia) o;
        return Objects.equals(diaSemana, dia.diaSemana) && Objects.equals(horasActividad, dia.horasActividad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diaSemana, horasActividad);
    }

    public interface Properties {
        DiaSemana diaSemana();
        HorasActividad horasActividad();
    }
}
