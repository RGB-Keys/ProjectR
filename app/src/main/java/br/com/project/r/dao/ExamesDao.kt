package br.com.project.r.dao

import br.com.project.r.model.Exame
import java.math.BigDecimal

class ExamesDao {

    fun adiciona(exame: Exame) {
        exames.add(exame)
    }

    fun buscaTodos(): List<Exame> {
        return exames.toList()
    }

    companion object {
        private val exames = mutableListOf<Exame>(
            Exame(
                nome = "Hemograma",
                descricao = "Completo",
                horario = "19/05/23 - 08:00",
                valor = BigDecimal("50.00")
            ),
            Exame(
                nome = "Endoscopia",
                descricao = "Digestiva",
                horario = "22/05/23 - 07:00",
                valor = BigDecimal("70.00")
            )
        )
    }

}