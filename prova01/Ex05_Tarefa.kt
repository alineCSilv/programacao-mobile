// Exercício 05
// Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título, descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas. Implemente métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.
// João Monteiro e Aline

import java.time.LocalDate

data class Task(
    val title: String,
    val description: String,
    val dueDate: LocalDate,
    val priority: Int,
    var isCompleted: Boolean = false
)
