package br.com.fiap.main;

import br.com.fiap.bean.Televisor;

public class Main {
    public static void main(String[] args) {
        Televisor tv1 = new Televisor();
        tv1.setCanal(5);
        tv1.setVolume(9);
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        System.out.printf("Canal: %d\nVolume: %d\n", tv1.getCanal(), tv1.getVolume());
    }
}
