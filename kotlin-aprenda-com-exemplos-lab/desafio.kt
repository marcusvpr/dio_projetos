// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {
    //
    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        
        inscritos.add(usuario)
    }
}

fun main() {
    //
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val conteudo1 = ConteudoEducacional("Conteúdo 1")
    val conteudo2 = ConteudoEducacional("Conteúdo 2", 90)
    
    val formacao = Formacao("Formação A", listOf(conteudo1, conteudo2))
    
    val usuario1 = Usuario()
    val usuario2 = Usuario()
    
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
}
