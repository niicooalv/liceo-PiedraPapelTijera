package com.liceolapaz.des.nap;
import javax.swing.*;
import java.util.*;

public class Principal {
    private static final int PIEDRA = 1;
    private static final int PAPEL = 2;
    private static final int TIJERA = 3;
    private static int OPCIONESINVALIDAS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    ---Menu---
                    1. Piedra
                    2. Papel
                    3. Tijera
                    0. Salir
                    Escoje una opción:
                    """);
            int opcion = scanner.nextInt();
            switch (opcion) {
                case PIEDRA:
                    sacar("piedra");
                    break;
                case PAPEL:
                    sacar("papel");
                    break;
                case TIJERA:
                    sacar("tijera");
                    break;
                default:
                    opcionNoValida();
                    break;
            }
        }
    }

    private static void opcionNoValida() {
        if (OPCIONESINVALIDAS >= 10) {
            System.out.println("¡YA BASTA haber si te enteras de que hay 4 opciones 4 no es tan dificil de entender!");
            int repuesta = JOptionPane.showConfirmDialog(null, "¿SABES LEER?", "Una Pregunta", JOptionPane.YES_NO_OPTION);
            switch (repuesta) {
                case 0:
                    JOptionPane.showConfirmDialog(null, "Sinceramente no lo parece", "Pues no lo parece", JOptionPane.DEFAULT_OPTION);
                    break;
                case 1:
                    JOptionPane.showConfirmDialog(null, "Ya se nota", "Se nota", JOptionPane.DEFAULT_OPTION);
                    break;
            }
            System.out.println("404 ERROR");
            System.exit(0);
        } else if (OPCIONESINVALIDAS >= 4) {
            System.out.println("Haber fijate bien que te has equivocado " + OPCIONESINVALIDAS + " veces");
            OPCIONESINVALIDAS ++;
        } else {
            System.out.println("Opción invalida");
            OPCIONESINVALIDAS ++;
        }
    }

    private static void sacar(String sel) {
        String selAuto = "nada";
        Random aleatorio = new Random();
        int sacarAuto = aleatorio.nextInt(3) + 1;
        switch (sacarAuto) {
            case 1:
                selAuto = "piedra";
                if (sel == "piedra") {
                    System.out.println("Empate el pc saco " + selAuto );
                    break;
                } else if (sel == "papel") {
                    System.out.println("Perdiste el pc saco " + selAuto);
                    break;
                } else if (sel == "tijera") {
                    System.out.println("Ganaste el pc saco " + selAuto);
                    break;
                }
                break;
            case 2:
                selAuto = "papel";
                if (sel == "piedra") {
                    System.out.println("Ganaste el pc saco " + selAuto);
                    break;
                } else if (sel == "papel") {
                    System.out.println("Empate el pc saco " + selAuto);
                    break;
                } else if (sel == "tijera") {
                    System.out.println("Perdiste el pc saco " + selAuto);
                    break;
                }
                break;
            case 3:
                selAuto = "tijera";
                if (sel == "piedra") {
                    System.out.println("Perdiste el pc saco " + selAuto);
                    break;
                } else if (sel == "papel") {
                    System.out.println("Ganaste el pc saco " + selAuto);
                    break;
                } else if (sel == "tijera") {
                    System.out.println("Empate el pc saco " + selAuto);
                    break;
                }
                break;
        }
    }
}
