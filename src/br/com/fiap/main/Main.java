package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor();
//        tv1.setCanal(5);
//        tv1.setVolume(9);
//        tv1.aumentarVolume();
//        tv1.aumentarVolume();
//        tv1.aumentarVolume();
//        System.out.printf("Canal: %d\nVolume: %d\n", tv1.getCanal(), tv1.getVolume());
//    }
        Scanner scan;
        int escolha;
        try {
            scan = new Scanner(System.in);
            System.out.println("Escolha um canal e defina um volume para sua TV.");
            tv1.setCanal(scan.nextInt());
            tv1.setVolume(scan.nextInt());

            System.out.println("Faça sua escolha\n(1) Trocar canal\n(2) Trocar Volume\n(3) Aumentar Volume\n(4) Diminuir Volume");
            escolha = scan.nextInt();

            if ( escolha == 1 ) {
                System.out.println("Digíte um canal NOVO");
                tv1.setCanal(scan.nextInt());
            } else if ( escolha == 2 ) {
                System.out.println("Digíte um volume NOVO");
                tv1.setVolume(scan.nextInt());
            } else if ( escolha == 3 ) {
                tv1.aumentarVolume();
                System.out.println("Aumentando volume...");
            } else if ( escolha == 4) {
                tv1.diminuirVolume();
                System.out.println("Diminuindo volume...");
            } else {
                System.out.println("Opção inválida.");
            }


            System.out.printf("Canal: %d\nVolume: %d\n", tv1.getCanal(), tv1.getVolume());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
