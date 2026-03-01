package com.certsys.finance;

import jakarta.persistence.*;

/**
 * Entidade JPA que representa a tabela de transaÃ§Ãµes no Banco de Dados.
 */
@Entity
@Table(name = "transactions")
public class TransactionRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double amount;
    private String status;

    // Construtores
    public TransactionRecord() {}
    public TransactionRecord(double amount, String status) {
        this.amount = amount;
        this.status = status;
    }
}