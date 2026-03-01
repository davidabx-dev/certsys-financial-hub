; Rotina MUMPS Legada - CACHÉ 2010.2
; Modulo de Transferencia Financeira a ser migrado para Java
Transfer(contaOrigem, contaDestino, valor)
    new saldoAtual
    set saldoAtual = ^BancoDados("Contas", contaOrigem, "Saldo")
    if saldoAtual < valor do  quit "SALDO INSUFICIENTE"
    . write "Erro de saldo",!
    ; Realiza a transação CMT legada
    set ^BancoDados("Contas", contaOrigem, "Saldo") = saldoAtual - valor
    set ^BancoDados("Contas", contaDestino, "Saldo") = ^BancoDados("Contas", contaDestino, "Saldo") + valor
    quit "TRANSFERENCIA APROVADA"
