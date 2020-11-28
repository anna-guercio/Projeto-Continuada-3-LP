
package br.com.bandtec.projetocontinuada3.anna;


public class Nadadora extends Atletas{
 
        public Nadadora(){
        idade = 20;
        sexo = "feminino";
        altura = 1.78;
    }

    @Override
    public String treinar() {
        String texto = "Treinando para competir na raia dos 100m";
        return texto; 
    }
    
}
