import java.time.LocalDateTime;

public class SolicitarMonedas {
    private String monedaBase;
    private String monedaConvertir;
    private double cantidadMonedaConvertir;
    private double cantidadConvertir;
    private LocalDateTime fecha;

    public SolicitarMonedas(SolicitarAPI record) {
        this.monedaBase = record.base_code();
        this.monedaConvertir = record.conversion_rate();
        this.cantidadConvertir = record.conversion_result();
        this.fecha = LocalDateTime.now();
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public void setMonedaBase(String monedaBase) {
        this.monedaBase = monedaBase;
    }

    public String getMonedaConvertir() {
        return monedaConvertir;
    }

    public void setMonedaConvertir(String monedaConvertir) {
        this.monedaConvertir = monedaConvertir;
    }

    public double getCantidadMonedaConvertir() {
        return cantidadMonedaConvertir;
    }

    public void setCantidadMonedaConvertir(double cantidadMonedaConvertir) {
        this.cantidadMonedaConvertir = cantidadMonedaConvertir;
    }

    public double getCantidadConvertir() {
        return cantidadConvertir;
    }

    public void setCantidadConvertir(double cantidadConvertir) {
        this.cantidadConvertir = cantidadConvertir;
    }

    @Override
    public String toString() {
        return "La conversion se realizo la fecha: " + fecha + cantidadConvertir;
    }
}
