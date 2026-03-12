public class ListaSimples implements ListaOperacoes {
  String[] lista;

  public ListaSimples(int tamanho) {
    this.lista = new String[tamanho];
  }

  public int removerTodas(String elementos) {
    int quantidadeRemovida = 0;
    if (estaVazia())
      return 0;
    for (int i = 0; i < lista.length; i++) {
      if (lista[i].equals(elementos)) {
        lista[i] = null;
        quantidadeRemovida++;
      }
    }
    return quantidadeRemovida;
  }

  public boolean estaVazia() {
    int vazios = 0;
    for (String itemLista : lista) {
      if (itemLista == null) {
        vazios++;
      }
    }
    if (vazios == lista.length) {
      return true;
    } else {
      return false;
    }
  }

  public int contar() {
    int contador = 0;
    for (int i = 0; i < lista.length; i++) {
      if (lista[i] != null) {
        contador++;
      }
    }
    return contador;
  }

  public int adicionarVarios(String[] elementos) {
    int quantidadeAdicionada = 0;
    if (estaCheia()) {
      return quantidadeAdicionada;
    }
    for (int i = 0; i < elementos.length; i++) {
      for (int j = 0; j < lista.length; j++) {
        if (lista[j] == null) {
          lista[i] = elementos[j];
          quantidadeAdicionada++;
          break;
        }
      }
    }
    return quantidadeAdicionada;
  }

  public boolean estaCheia() {
    int contadorItemsComValor = 0;
    for (String itemLista : lista) {
      if (itemLista != null) {
        contadorItemsComValor++;
      }
    }
    boolean resultado = contadorItemsComValor == lista.length ? true : false;
    System.out.println("Lista está cheia? " + resultado + ".");

    return resultado;
  }

  public String obter(int indice) {
    if (indice >= lista.length || indice < 0) {
      return "Não encontrado";
    }
    return lista[indice];
  }

  public inserir(int indice, String elemento) {
    
  }

  public void sout() {
    for (String elemente : lista) {
      System.out.println(elemente);
    }
  }

}
