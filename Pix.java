package secao15;

public class Pix implements InterfacePagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("O pagamento de R$ " + valor + " foi efetuado via PIX");
    }
}
