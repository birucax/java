package secao15;

public class TransferenciaBancaria implements InterfacePagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("O pagamento de R$ " + valor + " foi efetuado via transferência bancária");
        
    }
}
