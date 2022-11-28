import java.util.Date;

public class Partido {
    private Date fecha;
    private String local;
    private String visitante;
    private int resultado;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    Partido(Date fecha, String local, String visitante){
        setFecha(fecha);
        setLocal(local);
        setVisitante(visitante);
    }
}