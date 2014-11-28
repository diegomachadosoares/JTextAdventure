package Model;


public enum Acao
{
    ANDAR {  
        @Override
        public void executar(String objeto) {  
            System.out.println(this.name() + " " + objeto);
        }  
    },
    
    PEGAR {  
        @Override
        public void executar(String objeto) {  
            System.out.println(this.name() + " " + objeto);
        }  
    },
    
    ENTRAR{
        @Override
        void executar(String objeto) {
            System.out.println(this.name() + " " + objeto);
        }
    },
    USAR{
        @Override
        void executar(String objeto) {
            System.out.println(this.name() + " " + objeto);
        }
    },
    APERTAR{
        @Override
        void executar(String objeto) {
            System.out.println(this.name() + " " + objeto);
        }
    },
    PLANTAR{
        @Override
        void executar(String objeto) {
            System.out.println(this.name() + " " + objeto);
        }
    };
    abstract void executar(String objeto);
}
