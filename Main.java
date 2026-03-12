public class Main {
  public static void main(String[] args) {

    ListaSimples lista = new ListaSimples(10);

    System.out.println("Adicionar elementos");
    lista.adicionarElemento("A");
    lista.adicionarElemento("B");
    lista.adicionarElemento("C");
    lista.exibirElementos();

    System.out.println("Buscar elemento B");
    System.out.println(lista.buscarElemento("B"));

    System.out.println("Alterar B para D");
    lista.alterarElemento("B", "D");
    lista.exibirElementos();

    System.out.println("Quantidade de elementos");
    lista.quantidadeElementos();

    System.out.println("Contar elementos");
    System.out.println(lista.contar());

    System.out.println("Inserir X no indice 1");
    lista.inserir(1, "X");
    lista.exibirElementos();

    System.out.println("Obter elemento indice 2");
    System.out.println(lista.obter(2));

    System.out.println("Limpando a lista");
    lista.limpar();

    System.out.println("Adicionar varios");
    String[] novos = { "E", "F", "G" };
    lista.adicionarVarios(novos);

    System.out.println("Adicionar novos elementos apos limpar");
    lista = new ListaSimples(10);
    lista.adicionarElemento("P");
    lista.adicionarElemento("Q");
    lista.adicionarElemento("R");
    lista.exibirElementos();

    System.out.println("Inserir elemento no indice 0");
    lista.inserir(0, "INICIO");
    lista.exibirElementos();

    System.out.println("Inserir elemento no indice 2");
    lista.inserir(2, "MEIO");
    lista.exibirElementos();

    System.out.println("Buscar elemento R");
    System.out.println(lista.buscarElemento("R"));

    System.out.println("Ultimo indice de R");
    System.out.println(lista.ultimoIndiceDe("R"));

    System.out.println("Adicionar elementos repetidos");
    lista.adicionarElemento("R");
    lista.adicionarElemento("R");
    lista.exibirElementos();

    System.out.println("Contar ocorrencias de R");
    System.out.println(lista.contarOcorrencias("R"));

    System.out.println("Substituir R por S");
    System.out.println(lista.substituir("R", "S"));
    lista.exibirElementos();

    System.out.println("Remover elemento S");
    lista.removerElemento("S");
    lista.exibirElementos();

    System.out.println("Quantidade de elementos");
    lista.quantidadeElementos();

    System.out.println("Contar elementos");
    System.out.println(lista.contar());

    System.out.println("Lista esta cheia?");
    System.out.println(lista.estaCheia());

  }
}
