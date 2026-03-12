public class MainDinamica {
  static void main() {

    ListaDinamica listaDinamica = new ListaDinamica();

    System.out.println("Adicionar elementos");
    listaDinamica.adicionarElemento("Ana");
    listaDinamica.adicionarElemento("Bruno");
    listaDinamica.adicionarElemento("Carlos");
    listaDinamica.adicionarElemento("Ana");
    listaDinamica.exibirElementos();

    System.out.println("Remover todas as ocorrencias de Carlos");
    listaDinamica.removerTodas("Carlos");
    listaDinamica.exibirElementos();

    System.out.println("Contar elementos da lista");
    listaDinamica.contar();
    listaDinamica.exibirElementos();

    System.out.println("Adicionar varios elementos");
    listaDinamica.adicionarVarios(new String[] { "Daniel", "Eduardo", "Fernanda", "Gabriel", "Ana" });
    listaDinamica.exibirElementos();

    System.out.println("Obter elemento do indice 3");
    listaDinamica.obter(3);
    listaDinamica.exibirElementos();

    System.out.println("Inserir elemento no indice 2");
    listaDinamica.inserir(2, "Helena");
    listaDinamica.exibirElementos();

    System.out.println("Remover elemento do indice 4");
    listaDinamica.removerPorIndice(4);
    listaDinamica.exibirElementos();

    System.out.println("Ultimo indice da ocorrencia de Ana");
    listaDinamica.ultimoIndiceDe("Ana");
    listaDinamica.exibirElementos();

    System.out.println("Contar ocorrencias de Ana");
    listaDinamica.contarOcorrencias("Ana");
    listaDinamica.exibirElementos();

    System.out.println("Substituir Ana por Lucas");
    listaDinamica.substituir("Ana", "Lucas");
    listaDinamica.exibirElementos();

    System.out.println("Limpar a lista");
    listaDinamica.limpar();
    listaDinamica.exibirElementos();
  }
}
