package com.certsys.finance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * RepositÃ³rio para gerenciar os dados no Banco de Dados.
 */
@Repository
public interface TransactionRepository extends JpaRepository<TransactionRecord, Long> {

    /**
     * REQUISITO DA VAGA: ConstruÃ§Ã£o de consultas a bancos de dados em linguagem SQL.
     * Consulta nativa para contar transaÃ§Ãµes com sucesso.
     */
    @Query(value = "SELECT COUNT(*) FROM transactions WHERE status = 'APPROVED'", nativeQuery = true)
    long countApprovedTransactionsSQL();
}