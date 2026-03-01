package com.certsys.finance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Controlador REST para expor os serviÃ§os financeiros na Web.
 * Esta Ã© a letra 'C' da arquitetura MVC.
 */
@RestController
@RequestMapping("/api/transactions") // Define a rota principal no navegador/API
public class TransactionController {

    // A InjeÃ§Ã£o de DependÃªncia conecta este Controlador ao nosso ServiÃ§o testado
    @Autowired
    private TransactionService transactionService;

    /**
     * Endpoint para receber pedidos de transferÃªncia.
     * @param payload Um pacote de dados contendo o saldo atual e o valor da transferÃªncia.
     */
    @PostMapping("/transfer")
    public ResponseEntity<String> transfer(@RequestBody Map<String, Double> payload) {
        
        // Extrai os dados enviados pelo usuÃ¡rio
        double currentBalance = payload.getOrDefault("currentBalance", 0.0);
        double amount = payload.getOrDefault("amount", 0.0);

        // Repassa a responsabilidade lÃ³gica para o ServiÃ§o
        boolean isAuthorized = transactionService.authorizeTransfer(currentBalance, amount);

        // Responde de volta para a internet com o Status HTTP correto
        if (isAuthorized) {
            return ResponseEntity.ok("âœ… TransferÃªncia autorizada com sucesso!");
        } else {
            return ResponseEntity.badRequest().body("âŒ Saldo insuficiente para a transferÃªncia.");
        }
    }
}