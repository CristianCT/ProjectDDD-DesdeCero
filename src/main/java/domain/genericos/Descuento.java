package domain.genericos;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public final class Descuento implements ValueObject<Descuento.Properties> {
    private final String concepto;
    private final Double valor;

    public Descuento(String concepto, Double valor) {
        this.concepto = Objects.requireNonNull(concepto, "El concepto no puede ser null");
        if(this.concepto.isBlank()) throw new IllegalArgumentException("El concepto no puede ser vacio");
        if(this.concepto.length() < 3) throw new IllegalArgumentException("El concepto no es valido");

        this.valor = Objects.requireNonNull(valor, "El valor no puede ser null");
        if (this.valor < 0) throw new IllegalArgumentException("El valor no puede ser negativo");
        if(this.valor > 100) throw  new IllegalArgumentException("El valor no puede ser superior a 100%");
    }

    @Override
    public Properties value() {
        return new Properties() {
            @Override
            public String concepto() {
                return concepto;
            }

            @Override
            public Double valor() {
                return valor;
            }
        };
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Descuento descuento = (Descuento) o;
        return Objects.equals(concepto, descuento.concepto) && Objects.equals(valor, descuento.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(concepto, valor);
    }

    public interface Properties {
        String concepto();
        Double valor();
    }
}
