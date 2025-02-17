package pratica;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class Pratica {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.print("A hora do sistema é: ");
        System.out.println(relogio.toString());
        
        Locale lugar = Locale.getDefault();
        System.out.print("Seu sistema está em ");
        System.out.println(lugar.toLanguageTag());
        
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.print("Sua tela tem resolução ");
        System.out.println(tela.width + " x " + tela.height);
    }
}
