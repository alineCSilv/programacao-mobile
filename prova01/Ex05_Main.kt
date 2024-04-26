import java.time.LocalDate
import java.time.format.DateTimeFormatter
// Exercício 05
// Crie uma classe Tarefa que represente uma tarefa a ser realizada com atributos como título, descrição, data de vencimento e prioridade. Crie uma classe GerenciadorDeTarefas que gerencie uma lista de tarefas. Implemente métodos para adicionar, remover, buscar, marcar como concluída e listar tarefas por data de vencimento.
// João Monteiro e Aline

import java.util.*

fun main() {
    val taskManager = TaskManager()
    val scanner = Scanner(System.`in`)
    val brazilianFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")

    while (true) {
        println("\nMenu de Opções:")
        println("1. Adicionar Tarefa")
        println("2. Remover Tarefa")
        println("3. Buscar Tarefa por Título")
        println("4. Marcar Tarefa como Concluída")
        println("5. Listar Tarefas por Data de Vencimento")
        println("6. Sair")
        print("Escolha uma opção: ")

        when (scanner.nextInt()) {
            1 -> {
                print("Título da Tarefa: ")
                val title = readLine()!!
                print("Descrição da Tarefa: ")
                val description = readLine()!!
                print("Data de Vencimento (dd/MM/yyyy): ")
                val dueDate = LocalDate.parse(readLine()!!, brazilianFormatter)
                print("Prioridade (número): ")
                val priority = readLine()!!.toInt()

                taskManager.addTask(Task(title, description, dueDate, priority))
                println("Tarefa adicionada com sucesso!")
            }
            2 -> {
                print("Título da Tarefa para remover: ")
                val title = readLine()!!
                val task = taskManager.findTaskByTitle(title)
                if (task != null) {
                    taskManager.removeTask(task)
                    println("Tarefa removida com sucesso!")
                } else {
                    println("Tarefa não encontrada.")
                }
            }
            3 -> {
                print("Título da Tarefa para buscar: ")
                val title = readLine()!!
                val task = taskManager.findTaskByTitle(title)
                if (task != null) {
                    println("Tarefa encontrada: ${task.title} - Data: ${task.dueDate.format(brazilianFormatter)}, Prioridade: ${task.priority}, Concluída: ${if (task.isCompleted) "Sim" else "Não"}")
                } else {
                    println("Tarefa não encontrada.")
                }
            }
            4 -> {
                print("Título da Tarefa para marcar como concluída: ")
                val title = readLine()!!
                taskManager.markTaskAsCompleted(title)
                println("Tarefa marcada como concluída.")
            }
            5 -> {
                println("Tarefas listadas por data de vencimento:")
                taskManager.listTasksByDueDate().forEach {
                    println("${it.title} - Data: ${it.dueDate.format(brazilianFormatter)}, Prioridade: ${it.priority}, Concluída: ${if (it.isCompleted) "Sim" else "Não"}")
                }
            }
            6 -> {
                println("Saindo do programa.")
                return
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}
