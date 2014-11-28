package Model;


public enum Acao
{
    ANDAR {  
        @Override
        public void executar(String objeto, int numSala) {  
            
            switch(objeto){
                case "NORTE":
                    break;
                case "SUL":
                    break;
                case "LESTE":
                    break;
                case "OESTE":
                    break;
            }
        }  
    },
    
    PEGAR {  
        @Override
        public void executar(String objeto, int numSala) {  
            System.out.println(this.name() + " " + objeto);
        }  
    },
    
    ENTRAR{
        @Override
        public void executar(String objeto, int numSala) {
            System.out.println(this.name() + " " + objeto);
        }
    },
    USAR{
        @Override
        public void executar(String objeto, int numSala) {
            System.out.println(this.name() + " " + objeto);
        }
    },
    APERTAR{
        @Override
        public void executar(String objeto, int numSala) {
            System.out.println(this.name() + " " + objeto);
        }
    },
    PLANTAR{
        @Override
        public void executar(String objeto, int numSala) {
            System.out.println(this.name() + " " + objeto);
        }
    };
    public abstract void executar(String objeto, int numSala);
}
