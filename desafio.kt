// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

    class Usuario(val nome: String, val email: String, val celular: Long)

    data class ConteudoEducacional(val nome: String, val duracao: Int = 0, val basico: Nivel)


    data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {
        var matriculados = mutableListOf<Usuario>()
        fun matricular(usuario: Usuario) {
            matriculados.add(usuario)
        }

        fun listaMatriculados(){
            for (pessoasMatriculadas in matriculados){
                println(pessoasMatriculadas.nome)
            }
        }

        fun listaConteudos(){
            for (conteudosEspecificos in conteudos )
                println(conteudosEspecificos.nome)
        }
    }

    fun main() {
        //usuarios
        val carlos = Usuario("Carlos Henrique", "carlos@hotmail.com", 36941878912)
        val roberta = Usuario("Roberta Nacimento", "roberta@yahoo.com", 41965478313)

        //Blocos de estudo
        val bloco_1 = ConteudoEducacional("Principio de Agilidade e Desenvolvimento de Software",17, Nivel.BASICO)
        val bloco_2 = ConteudoEducacional ("Dominando a Linguagem de Programação Kotlin", 10, Nivel.BASICO)
        val bloco_3 = ConteudoEducacional("Refinando Sua Técnica com Desafios de Código em Kotlin", 5, Nivel.INTERMEDIARIO )
        val bloco_4 = ConteudoEducacional("Fortalecendo Seu Perfil Profissional", 5, Nivel.BASICO)
        val bloco_5 = ConteudoEducacional("Criando uma Aplicação de Vendas", 20, Nivel.DIFICIL)


        val blocosKotlinEstudo = mutableListOf<ConteudoEducacional>()
        blocosKotlinEstudo.add(bloco_1)
        blocosKotlinEstudo.add(bloco_2)
        blocosKotlinEstudo.add(bloco_3)
        blocosKotlinEstudo.add(bloco_4)
        blocosKotlinEstudo.add(bloco_5)


        val kotlin_experience = Formacao("Kotlin Experience", blocosKotlinEstudo,Nivel.INTERMEDIARIO)


        kotlin_experience.matricular(carlos)
        kotlin_experience.matricular(roberta)

        println()
        println("Curso: ${kotlin_experience.nome}")
        println("Matriculados no Curso: ")
        println("${kotlin_experience.listaMatriculados()}")
        println("Blocos de estudo: ")
        println("${kotlin_experience.listaConteudos()}")

    }

