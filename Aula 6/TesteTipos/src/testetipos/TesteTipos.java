package testetipos;

public class TesteTipos {
    public static void main(String[] args) {
        /* int idade = 30;
        
         *  Falhas
         *  String valor = idade;
         *  String valor = (String)idade;
        
        String valor = Integer.toString(idade); 
        
        */
        
        String valor = "30.5";
        
        /*
        *  Falhas
        *  int idade = valor;
        *  int idade = (int)valor;
        */
        
        float idade = Float.parseFloat(valor);
        
        System.out.printf("%.1f", idade);
    }
}
