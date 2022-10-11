package com.github.iurysalino.service;

public interface SuporteBalanceadoService {
    boolean isValid(String s);
    boolean isOpenBrecket(char c);
    boolean isMatching(char open, char close);
    void isEmpty(String valorEntrada, boolean returnIsValid);
}
