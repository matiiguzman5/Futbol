import java.util.Date;

public class Partido {
    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;


    public Resultado getResultado() {
        return resultado;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }
    Partido(Date fecha, Equipo local, Equipo visitante, Resultado resultado){
        this.fecha=fecha;
        this.local=getLocal();
        this.visitante=getVisitante();
        this.resultado=getResultado();
    }
}
