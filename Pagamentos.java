package secao15;

public class Pagamentos {
    public static void main(String[] args) {
        CartaoCredito pagamentocartao = new CartaoCredito();
        pagamentocartao.processarPagamento(150);
        pagamentocartao.emitirRecibo();
        TransferenciaBancaria transferencia = new TransferenciaBancaria();
        transferencia.processarPagamento(150);
        transferencia.emitirRecibo();
        Pix pix = new Pix();
        pix.processarPagamento(130);
        pix.emitirRecibo();
        Boleto boleto =  new Boleto();
        boleto.processarPagamento(80);
        boleto.emitirRecibo();

    }
}
