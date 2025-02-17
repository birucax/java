package secao15;



    interface Imprimir {
        void imprimir();
        
    }
    interface Salvar {
        void salvar();
    
        
    }
    interface Alterar {
        void alterar();
    
        
    }
    //IMPLEMENTANDO AS INTERFACES

    public class Implementar implements Imprimir, Salvar, Alterar{
        private String implementar;
        public Implementar(String implementar){
            this.implementar = implementar;
        }
        @Override
        public void imprimir(){
            System.out.println("O documento " + implementar + " foi impresso");
        }
        
        public void salvar(){
            System.out.println("O documento " + implementar + " foi salvo");
        }
        
        public void alterar(){
            System.out.println("O documento " + implementar + " foi alterado");
        }

    }

