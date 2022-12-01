public class Resultado {
    private int golesLocal;
    private int golesVisitante;



    public int getGolesLocal() {
        return golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public boolean ganoLocal() {
        if (golesLocal < golesVisitante) {
            return true;

        } else {
            return false;
        }
    }
    public boolean empate(){
        if (golesLocal==golesVisitante){
            return true;
        } else {
            return false;
        }
    }
    Resultado (){
    golesLocal= (int)(Math.random()*9);
    golesVisitante = (int)(Math.random()*9);
    }
}
