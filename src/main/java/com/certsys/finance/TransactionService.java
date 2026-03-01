package com.certsys.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repository;

    /**
     * REQUISITO DA VAGA: Gerenciamento de TransaÃ§Ãµes (CMT).
     * O @Transactional garante que se o banco falhar, o dinheiro nÃ£o Ã© perdido (Rollback).
     */
    @Transactional
    public boolean authorizeTransfer(double currentBalance, double transferAmount) {
        if (currentBalance >= transferAmount) {
            // Salva o histÃ³rico no banco de dados com seguranÃ§a transacional
            repository.save(new TransactionRecord(transferAmount, "APPROVED"));
            return true;
        } else {
            repository.save(new TransactionRecord(transferAmount, "DENIED"));
            return false;
        }
    }
}