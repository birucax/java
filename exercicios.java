package secao15.exercicios;

public class exercicios{
 
    public static void main(String[] args) {
        Navegavel meuBarco = new Barco();
        
        Pilotavel meuAviao = new Aviao();
        
        Pilotavel meuHidroAviao =  new HidroAviao();
        operarVeiculo(meuHidroAviao);
        operarVeiculo(meuAviao);
        operarVeiculo(meuBarco);
        
        
    }
    public static void operarVeiculo(Object veiculo){
        if (veiculo instanceof Pilotavel) {
            System.out.println("O veículo é pilotável");
            
        } 
        if(veiculo instanceof Navegavel){
            System.out.println("O veículo é navegável");
        }
    }
 

}
