package br.com.fiap.model;

import java.time.LocalDate;

public abstract class Conta {
    private final int id;
    private final String numeroConta;
    private final String agencia;
    private final LocalDate dataAbertura;

    // Construtor de criação, para futura inserção no banco
    public Conta(String numeroConta, String agencia, int id) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.dataAbertura = LocalDate.now();
        this.id = id;
    }

    // Construtor para leitura do banco
    public Conta(String numeroConta, String agencia, int id, LocalDate dataAbertura) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.id = id;
        this.dataAbertura = dataAbertura;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public int getId() {
        return id;
    }

    public abstract double getSaldo();

    public abstract boolean depositar(float valor);
}

