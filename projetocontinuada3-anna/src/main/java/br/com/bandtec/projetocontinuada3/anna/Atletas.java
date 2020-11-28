
package br.com.bandtec.projetocontinuada3.anna;


public abstract class Atletas {
    
    protected Integer idade;
    protected String sexo;
    protected Double altura;
    
    
    public abstract String treinar();
    
    
    // ATRIBUTO DE CLASSE CONSTANTE
    public static String NACIONALIDADE = "brasileiro(a)";
    
    // MÉTODO ESTÁTICO
      public static String beberAgua(){
          String agua = "Bebo água todos os dias";
          return agua;
    
    }
      
    
}
