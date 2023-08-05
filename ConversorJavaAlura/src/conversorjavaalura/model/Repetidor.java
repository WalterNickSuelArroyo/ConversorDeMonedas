package conversorjavaalura.model;

import javax.swing.JOptionPane;

public class Repetidor {
    public boolean intentaRepetir(){
        int respuesta;
        respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?");
        if (respuesta != 0) {
            JOptionPane.showMessageDialog(null, "Programa terminado");
            return false;
        }
        return true;
    }
}
