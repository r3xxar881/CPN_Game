//Elementos de ventana

package game.data;

//Librerias..
import javax.swing.*;
import java.awt.event.*;
import java.lang.Math;

public class elements extends JFrame implements ActionListener
    {
        //IA:
        public static int inteligArtif()
            {
                int min = 1;
                int max = 3;
                int rango = max - min + 1;
                //inteligencia artificial cutre..
                int RG = (int)(Math.random() * rango) + min;
                return RG;
            }
        int IA; //Variable IA declarada antes para poder solucionar probelmas con metodos *mensOPT*

        
        public void esconder()
            {
                //esconde los botones y pregunta si queres jugar denuevo..
                cuarzo.setVisible(false);
                add(cuarzo);
                papiro.setVisible(false);
                add(papiro);
                navaja.setVisible(false);
                add(navaja);
                IntelArtifEleccion.setVisible(false);
                add(IntelArtifEleccion);
                IAEleccion.setVisible(false);
                add(IAEleccion);
                vuelta.setVisible(true);
                add(vuelta);
                
                return;
            }
                
        public void esconder2()
            {
                //esconde botones..
                cuarzo.setVisible(true);
                add(cuarzo);
                papiro.setVisible(true);
                add(papiro);
                navaja.setVisible(true);
                add(navaja);
                IntelArtifEleccion.setVisible(true);
                add(IntelArtifEleccion);
                IAEleccion.setText("");
                IAEleccion.setVisible(false);
                add(IAEleccion);
                
                return; 
            }
        
        public void mensOPT() //metodo que muestra en pantalla que eligio la IA
            {
                if(IA == 1)
                    {
                        IAEleccion.setText("El oponente ah elegido cuarzo!");
                        IAEleccion.setVisible(true);
                        add(IAEleccion);
                    }
                else
                    {
                        if(IA == 2)
                            {
                                IAEleccion.setText("El oponente ah elegido papiro!");
                                IAEleccion.setVisible(true);
                                add(IAEleccion);
                            }
                        else
                            {
                                if(IA == 3);
                                    {
                                        IAEleccion.setText("El oponente ah elegido navaja!");
                                        IAEleccion.setVisible(true);
                                        add(IAEleccion);
                                    }
                            }
                    }

                return;
            }
        

        //ELEMENTOS:
        
        //botones..
        JButton cuarzo;
        JButton papiro;
        JButton navaja;
        JButton vuelta;
        JButton salir;
        JButton jugar;

        //mensajes..
        private JLabel mensaje;
        private JLabel mensjWin;
        private JLabel IntelArtifEleccion;
        private JLabel IAEleccion;
        

            public elements() //Contructor.
                {
                    //DISEÑO DE ELEMENTOS:

                    //Mensaje..
                    mensaje = new JLabel("Bienvenido a cuarzo, papiro y navaja!");
                    setLayout(null);
                    mensaje.setBounds(140, 25, 230, 20); //X, Y, Ancho, Alto.
                    add(mensaje);

                    mensjWin = new JLabel("");
                    setLayout(null);
                    mensjWin.setBounds(200, 100, 100, 20);
                    mensjWin.setVisible(false);
                    add(mensjWin);

                    IntelArtifEleccion = new JLabel("El oponente esta eligiendo... elige cuando estes listo!");
                    setLayout(null);
                    IntelArtifEleccion.setBounds(90, 100, 300, 20);
                    IntelArtifEleccion.setVisible(false);
                    add(IntelArtifEleccion);

                    IAEleccion = new JLabel("");
                    setLayout(null);
                    IAEleccion.setBounds(150, 50, 200, 20);
                    IAEleccion.setVisible(false);
                    add(IAEleccion);


                    //Botones..
                    jugar = new JButton("JUGAR");
                    setLayout(null);
                    jugar.setBounds(200, 110, 80, 30);
                    jugar.setVisible(true);
                    jugar.addActionListener(this);
                    add(jugar);

                    cuarzo = new JButton("Cuarzo");
                    setLayout(null);
                    cuarzo.setBounds(100, 160, 80, 30);
                    cuarzo.setVisible(false);
                    cuarzo.addActionListener(this);
                    add(cuarzo);
                    
                    papiro = new JButton("Papiro");
                    setLayout(null);
                    papiro.setBounds(200, 160, 80, 30);
                    papiro.setVisible(false);
                    papiro.addActionListener(this);
                    add(papiro);

                    navaja = new JButton("Navaja");
                    setLayout(null);
                    navaja.setBounds(300, 160, 80, 30);
                    navaja.setVisible(false);
                    navaja.addActionListener(this);
                    add(navaja);

                    salir = new JButton("SALIR");
                    setLayout(null);
                    salir.setBounds(15, 220, 70, 30);
                    salir.addActionListener(this);
                    add(salir);

                    vuelta = new JButton("Volv\u00e9r a jugar");
                    setLayout(null);
                    vuelta.setBounds(170, 160, 130, 30);
                    vuelta.setVisible(false);
                    vuelta.addActionListener(this);
                    add(vuelta);


                    setDefaultCloseOperation(EXIT_ON_CLOSE);
                }

            public void actionPerformed(ActionEvent b)
                {
                    if(b.getSource() == jugar) //Cuando se presiona *JUGAR*
                        {
                            esconder2();

                            jugar.setVisible(false);
                            add(jugar);
                            mensaje.setVisible(false);
                            add(mensaje);
                            IntelArtifEleccion.setVisible(true);
                            add(IntelArtifEleccion);
                        }

                    inteligArtif(); //LLamado a IA
                    IA = inteligArtif();

                    if(b.getSource() == salir)
                        {
                            System.exit(0);
                        }

                    if(b.getSource() == cuarzo) //Cuando se presiona Cuarzo
                        {
                            if(IA == 1)
                                {
                                    mensjWin.setText("     Empate!");
                                    mensjWin.setVisible(true);
                                    add(mensjWin);

                                    esconder();
                                    mensOPT();
                                }
                            if(IA == 2)
                                {
                                    mensjWin.setText("Has Perdido!");
                                    mensjWin.setVisible(true);
                                    add(mensjWin);

                                    esconder();
                                    mensOPT();
                                }
                            if(IA == 3)
                                {
                                    mensjWin.setText("Has Gan\u00e1do!");
                                    mensjWin.setVisible(true);
                                    add(mensjWin);

                                    esconder();
                                    mensOPT();
                                }
                        }
                    
                    if(b.getSource() == papiro) //Cuando se presiona Papiro
                        {
                            if(IA == 1) //Cuarzo
                                {
                                    mensjWin.setText("Has Gan\u00e1do!");
                                    mensjWin.setVisible(true);
                                    add(mensjWin);

                                    esconder();
                                    mensOPT();
                                }
                            if(IA == 2) //papiro
                                {
                                    mensjWin.setText("     Empate!");
                                    mensjWin.setVisible(true);
                                    add(mensjWin);

                                    esconder();
                                    mensOPT();
                                }
                            if(IA == 3) //navaja
                                {
                                    mensjWin.setText("Has Perdido!");
                                    mensjWin.setVisible(true);
                                    add(mensjWin);

                                    esconder();
                                    mensOPT();
                                }
                        }
                    
                    if(b.getSource() == navaja) //Cuando se presiona Navaja
                        {
                            if(IA == 1)
                                {
                                    mensjWin.setText("Has Perdido!");
                                    mensjWin.setVisible(true);
                                    add(mensjWin);

                                    esconder();
                                    mensOPT();
                                }
                            if(IA == 2)
                                {
                                    mensjWin.setText("Has Gan\u00e1do!");
                                    mensjWin.setVisible(true);
                                    add(mensjWin);

                                    esconder();
                                    mensOPT();
                                }
                            if(IA == 3)
                                {
                                    mensjWin.setText("     Empate!");
                                    mensjWin.setVisible(true);
                                    add(mensjWin);

                                    //esconde los botones y pregunta si queres jugar denuevo..
                                    esconder();
                                    mensOPT();
                                }
                        }
                    
                    if(b.getSource() == vuelta) //Cuando se presiona *VOLVER A JUGAR*
                        {
                            mensjWin.setText("");
                            mensjWin.setVisible(false);
                            add(mensjWin);

                            esconder2();

                            vuelta.setVisible(false);
                            add(vuelta);

                            IAEleccion.setText("");
                            IAEleccion.setVisible(false);
                            add(IAEleccion);
                        }
                }
    }