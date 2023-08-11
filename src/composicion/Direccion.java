package composicion;

public class Direccion {

    private String calle;
    private String numeroExterno;
    private String numeroInterno;
    private String ciudad;
    private String municipio;

    public Direccion(String calle, String numeroExterno, String numeroInterno, String ciudad, String municipio) {
        this.calle = calle;
        this.numeroExterno = numeroExterno;
        this.numeroInterno = numeroInterno;
        this.ciudad = ciudad;
        this.municipio = municipio;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumeroExterno() {
        return numeroExterno;
    }

    public String getNumeroInterno() {
        return numeroInterno;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumeroExterno(String numeroExterno) {
        this.numeroExterno = numeroExterno;
    }

    public void setNumeroInterno(String numeroInterno) {
        this.numeroInterno = numeroInterno;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", numeroExterno='" + numeroExterno + '\'' +
                ", numeroInterno='" + numeroInterno + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", municipio='" + municipio + '\'' +
                '}';
    }
}
