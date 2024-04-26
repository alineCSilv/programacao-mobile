// Exercício 05
// Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título, descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas. Implemente métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.
// João Monteiro e Aline

import java.time.LocalDate

class TaskManager {
    private val tasks = mutableListOf<Task>()

    fun addTask(task: Task) {
        tasks.add(task)
    }

    fun removeTask(task: Task) {
        tasks.remove(task)
    }

    fun findTaskByTitle(title: String): Task? {
        return tasks.find { it.title == title }
    }

    fun markTaskAsCompleted(taskTitle: String) {
        tasks.find { it.title == taskTitle }?.isCompleted = true
    }

    fun listTasksByDueDate(): List<Task> {
        return tasks.sortedBy { it.dueDate }
    }
}
