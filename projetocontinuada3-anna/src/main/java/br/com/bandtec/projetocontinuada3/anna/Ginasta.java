
package br.com.bandtec.projetocontinuada3.anna;


public class Ginasta extends Atletas {
    
    public Ginasta(){
        idade = 18;
        sexo = "feminino";
        altura = 1.70;
    }

    @Override
    public String treinar() {
        String texto = "Estou fazendo muitas estrelinhas no meu treino";
        return texto;
    }
    
}
