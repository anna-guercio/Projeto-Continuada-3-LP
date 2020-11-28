
package br.com.bandtec.projetocontinuada3.anna;


public class Jogador extends Atletas{
    
    public Jogador(){
    idade = 20;
    sexo = "masculino";
    altura = 1.85;

    }

    @Override
    public String treinar() {
        String texto = "O treino de futebol para as Olimpíadas é muito puxado";
        return texto;
    }
    
}
