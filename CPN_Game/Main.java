//cuarzo, papiro o navaja.

package game;

import game.data.*;

//Creacion de clase PIEDRA_PAPEL_O_TIJERA.
public class Main
    {
        public static void main(String args[]) //Metodo main()
            {
                //Creacion de la ventana..
                elements ventana = new elements();
                ventana.setLayout(null);
                ventana.setTitle("CPN The Game");
                ventana.setBounds(0, 0, 500, 300);
                ventana.setResizable(false);
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            }
    }