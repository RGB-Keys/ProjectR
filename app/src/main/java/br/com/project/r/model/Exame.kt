package br.com.project.r.model

import java.math.BigDecimal

data class Exame(
        val nome: String,
        val descricao: String,
        val horario: String,
        val valor: BigDecimal
)
