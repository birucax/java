package secao15;

interface InterfacePagamento {
    //Método abstrato da interface

    void processarPagamento(double valor);

    //Método default da interface

    default void emitirRecibo(){
        System.out.println("O recibo foi emitido com sucesso.");
    }

}
