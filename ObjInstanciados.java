package secao15.exercicios;

public class ObjInstanciados {
    public static void main(String[] args) {
        Barco barco = new Barco();
        barco.navegar();
        Aviao aviao = new Aviao();
        aviao.pilotar();
        HidroAviao hidroAviao =  new HidroAviao();
        hidroAviao.navegar();
        hidroAviao.pilotar();
    }

}
