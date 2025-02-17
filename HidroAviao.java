package secao15.exercicios;

public class HidroAviao extends Barco  implements Pilotavel{
    @Override
    public void pilotar(){
        System.out.println(" o hidroavião está sendo pilotado ");
    }
    public void navegar(){
        System.out.println(" o hidroavião está navegando");
    }
    
}
