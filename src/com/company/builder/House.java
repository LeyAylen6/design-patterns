package src.com.company.builder;

public class House {
    private final String pared;
    private final String techo;
    private final String ventana;
    private final String puerta;
    private final String calefaccion;
    private final String garage;
    private final String pileta;

    public House(Builder builder) {
        this.pared = builder.pared;
        this.techo = builder.techo;
        this.ventana = builder.ventana;
        this.puerta = builder.puerta;
        this.calefaccion = builder.calefaccion;
        this.garage = builder.garage;
        this.pileta = builder.pileta;
    }

    public String getPared() {
        return pared;
    }

    public String getTecho() {
        return techo;
    }

    public String getVentana() {
        return ventana;
    }

    public String getPuerta() {
        return puerta;
    }

    public String getCalefaccion() {
        return calefaccion;
    }

    public String getGarage() {
        return garage;
    }

    public String getPileta() {
        return pileta;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "House{" +
                "pared='" + pared + '\'' +
                ", techo='" + techo + '\'' +
                ", ventana='" + ventana + '\'' +
                ", puerta='" + puerta + '\'' +
                ", calefaccion='" + calefaccion + '\'' +
                ", garage='" + garage + '\'' +
                ", pileta='" + pileta + '\'' +
                '}';
    }

    public static class Builder {
        private String pared;
        private String techo;
        private String ventana;
        private String puerta;
        private String calefaccion;
        private String garage;
        private String pileta;

        public Builder withPared(String pared) {
            this.pared = pared;
            return this;
        }

        public Builder withTecho(String techo) {
            this.techo = techo;
            return this;
        }

        public Builder withVentana(String ventana) {
            this.ventana = ventana;
            return this;
        }

        public Builder withPuerta(String puerta) {
            this.puerta = puerta;
            return this;
        }

        public Builder withCalefaccion(String calefaccion) {
            this.calefaccion = calefaccion;
            return this;
        }

        public Builder withGarage(String garage) {
            this.garage = garage;
            return this;
        }

        public Builder withPileta(String pileta) {
            this.pileta = pileta;
            return this; // se pone para hacer newBuilder().withTecho("Soy un techo").withTecho("Soy un techo").....
        }

        public House build() {
            return new House(this);
        }
    }
}
