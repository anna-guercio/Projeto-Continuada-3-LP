
package br.com.bandtec.projetocontinuada3.anna;


public class Lutadora extends Atletas{
    
        public Lutadora(){
        idade = 22;
        sexo = "feminino";
        altura = 1.75;
    }

        @Override
    public String treinar(){
        String texto = "Me preparando para o primeiro Round";
        return texto;
    }
    
}
