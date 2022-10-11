package com.github.iurysalino.service.impl;

import com.github.iurysalino.service.SuporteBalanceadoService;

import java.util.ArrayDeque;
import java.util.Deque;

public class SuporteBalanceadoServiceImpl implements SuporteBalanceadoService {

    private static final String COLCHETES_ABERTURA = "({[";
    private static final String COLCHETES_FECHAMENTO = ")}]";
    private static final String MENSAGEM_VALIDO = " é válido";
    private static final String MENSAGEM_INVALIDO = " não é válido";

    @Override
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isOpenBrecket(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    @Override
    public boolean isOpenBrecket(char c) {
        return COLCHETES_ABERTURA.indexOf(c) != -1;
    }

    @Override
    public boolean isMatching(char open, char close) {
        return COLCHETES_ABERTURA.indexOf(open) == COLCHETES_FECHAMENTO.indexOf(close);
    }

    @Override
    public void isEmpty(String valorEntrada, boolean returnIsValid) {
        if (returnIsValid) {
            System.out.println(valorEntrada + MENSAGEM_VALIDO);
        } else {
            System.out.println(valorEntrada + MENSAGEM_INVALIDO);
        }
    }
}
