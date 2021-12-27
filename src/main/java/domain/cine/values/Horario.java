package domain.cine.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;
import java.util.Set;

public final class Horario implements ValueObject<Horario.Properties> {
    private final FechaInicio fechaInicio;
    private final FechaFin fechaFin;
    private final Set<Dia> dias;

    public Horario(FechaInicio fechaInicio, FechaFin fechaFin, Set<Dia> dias) {
        this.fechaInicio = Objects.requireNonNull(fechaInicio,"La fecha de inicio no puede ser null");
        this.fechaFin = Objects.requireNonNull(fechaFin,"la fecha de fin no puede ser null");
        this.dias = Objects.requireNonNull(dias,"Los dias no puede ser null");
        if (this.dias.size() > 7) throw new IllegalArgumentException("La cantidad de dias no puede ser superior al numero de dias de la semana");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public FechaInicio fechaInicio() {
                return fechaInicio;
            }

            @Override
            public FechaFin fechaFin() {
                return fechaFin;
            }

            @Override
            public Set<Dia> dias() {
                return dias;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horario horario = (Horario) o;
        return Objects.equals(fechaInicio, horario.fechaInicio) && Objects.equals(fechaFin, horario.fechaFin) && Objects.equals(dias, horario.dias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaInicio, fechaFin, dias);
    }

    public interface Properties {
        FechaInicio fechaInicio();
        FechaFin fechaFin();
        Set<Dia> dias();
    }
}
