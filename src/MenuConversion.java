import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

class MenuConversion {

    public static void main(String[] args) {
        //System.out.println("Hola mundo");
        
        String conversorMonedas = "Conversor de monedas";
        String conversorTemperatura = "Conversor de temperatura";


        //JOptionPane.showInputDialog(null, "Seleccione el conversor que necesite", "Conversor", JOptionPane.PLAIN_MESSAGE,null,opciones,"Selecciona");

        String lista = (JOptionPane.showInputDialog(null, "Selecciona la conversión", "Conversiones", JOptionPane.PLAIN_MESSAGE,null, new Object[] { conversorMonedas, conversorTemperatura}, "Selecciona")).toString();
    
        //JOptionPane.showMessageDialog(null, "Tu animal favorito es:  "+lista, "Animales", JOptionPane.PLAIN_MESSAGE);

        //if() {

        //}
    }


}