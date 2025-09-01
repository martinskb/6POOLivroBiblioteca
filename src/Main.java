/*
6 Crie a classe Biblioteca com:
• Um vetor de Livro com tamanho definido no construtor.
• Um contador para controlar quantos livros foram adicionados.
• Métodos públicos:
◦adicionarLivro(Livro livro) → adiciona no vetor, se houver espaço.
◦emprestarLivro(String titulo) → procura no vetor e empresta o
livro correspondente.
◦devolverLivro(String titulo) → procura no vetor e devolve o livro
correspondente.
◦mostrarLivros() → exibe todos os livros e informa se estão
disponíveis ou emprestados.
No método main:
• Crie uma biblioteca com capacidade para 5 livros.
• Adicione pelo menos 3 livros.
• Mostre os livros cadastrados.
• Realize um empréstimo de um dos livros.
• Realize a devolução do mesmo livro.
• Mostre novamente o estado de todos os livros
*/
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(5);

        // Adicionando livros
        biblioteca.adicionarLivro(new Livro("Lord of the Mysteries", "Yuan Ye"));
        biblioteca.adicionarLivro(new Livro("Solo Leveling", "Chugong"));
        biblioteca.adicionarLivro(new Livro("Omniscient Reader's Viewpoint", "Sing Shong"));

        // Mostrando livros
        biblioteca.mostrarLivros();

        // Realizando empréstimo
        biblioteca.emprestarLivro("Solo Leveling");

        // Tentando emprestar livro já emprestado
        biblioteca.emprestarLivro("Solo Leveling");

        // Mostrando estado atual
        biblioteca.mostrarLivros();

        // Devolvendo livro
        biblioteca.devolverLivro("Solo Leveling");

        // Estado final
        biblioteca.mostrarLivros();
    }
}
