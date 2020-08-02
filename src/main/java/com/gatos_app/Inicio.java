package com.gatos_app;

import javax.swing.*;

public class Inicio {
    public static void main(String[] args){
        int opcionMenu = -1;
        String[] botones={"1.Ver Gatos","2.Salir"};

        do {
            String option= (String) JOptionPane.showInputDialog(null, "Gatitos Java", "Menu Principal",
                    JOptionPane.INFORMATION_MESSAGE,null,botones, botones[0]);

            for (int i = 0; i < botones.length; i++){

                if (option.equals(botones[i])){
                    opcionMenu=i;
                }

                switch (opcionMenu){
                    case 0:
                        GatoService.verGatitos();
                        break;
                    default:
                        break;
                }

            }

        }while (opcionMenu!=1);
    }
}
