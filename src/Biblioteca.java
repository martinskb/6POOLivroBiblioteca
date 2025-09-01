public class Biblioteca {
    private Livro[] livros;
    private int contador;

    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        contador = 0;
    }

    public void adicionarLivro(Livro livro) {
        if (contador < livros.length) {
            livros[contador] = livro;
            contador++;
            System.out.println("Livro '" + livro.getTitulo() + "' adicionado à biblioteca!");
        } else {
            System.out.println("Biblioteca cheia! Não foi possível adicionar o livro.");
        }
    }

    public void emprestarLivro(String titulo) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                livros[i].emprestar();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Livro '" + titulo + "' não encontrado na biblioteca!");
        }
    }

    public void devolverLivro(String titulo) {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                livros[i].devolver();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Livro '" + titulo + "' não encontrado na biblioteca!");
        }
    }

    public void mostrarLivros() {
        System.out.println("\n=== LIVROS NA BIBLIOTECA ===");
        if (contador == 0) {
            System.out.println("Nenhum livro cadastrado na biblioteca.");
            return;
        }

        for (int i = 0; i < contador; i++) {
            String status = livros[i].isDisponivel() ? "Disponível" : "Emprestado";
            System.out.println((i + 1) + ". " + livros[i].getTitulo() +
                    " - " + livros[i].getAutor() +
                    " [" + status + "]");
        }
    }
}
