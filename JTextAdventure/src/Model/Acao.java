package Model;

//        Exemplo de Acao
//        String acao = "Abrir";
//        acao = acao.toUpperCase();
//        String objeto = "Porta";
//        Acao.valueOf(acao).executar(objeto);

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
    
    ABRIR{
        @Override
        void executar(String objeto) {
            System.out.println(this.name() + " " + objeto);
        }
};
    abstract void executar(String objeto);
}
