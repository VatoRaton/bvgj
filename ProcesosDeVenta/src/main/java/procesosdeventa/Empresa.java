package procesosdeventa;

public class Empresa extends Persona {
    
    private String CIF;
    private String web;

    public Empresa(String CIF, String web, String nombre, String correo,
            String clave, Tarjeta tarjetaCredito, Direccion dir, int numeroTelf) {
        super(nombre, correo, clave, tarjetaCredito, dir, numeroTelf);
        this.CIF = CIF;
        this.web = web;
    }

    public String getCIF() {
        return CIF;
    }

    public void setCIF(String CIF) {
        this.CIF = CIF;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "Empresa{" + "CIF=" + CIF + ", web=" + web + '}';
    }
    
    
}
