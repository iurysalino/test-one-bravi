package com.github.iurysalino;

import com.github.iurysalino.service.impl.SuporteBalanceadoServiceImpl;

import java.util.Scanner;

public class SuporteBalanceado {

    public static void main(String[] args) {
        SuporteBalanceadoServiceImpl suporteBalanceadoService = new SuporteBalanceadoServiceImpl();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        suporteBalanceadoService.isEmpty(s, suporteBalanceadoService.isValid(s));
    }
}
