public class ListaSimples implements ListaOperacoes {
  String[] lista;

  public ListaSimples(int tamanho) {
    this.lista = new String[tamanho];
  }

  public void adicionarElemento(String elemento) {
    if (!estaCheia()) {
      this.lista[encontrarPosicaoVazia()] = elemento;
      System.out.println("Elemento " + elemento + " adicionado com sucesso!");
    }
  }

  private boolean estaVazio() {
    for (int i = 0; i < this.lista.length; i++) {
      if (this.lista[i] != null) {
        return false;
      }
    }
    System.out.println("A lista está vazia!");
    return true;
  }

  private int encontrarPosicaoVazia() {
    int i;
    for (i = 0; i < this.lista.length; i++) {
      if (this.lista[i] == null) {
        return i;
      }
    }
    return i;
  }

  public void removerElemento(String elemento) {
    if (!estaVazio()) {
      if (this.buscarElemento(elemento) >= 0) {
        this.lista[this.buscarElemento(elemento)] = null;
        System.out.println("Elemento " + elemento + " removido com sucesso!");
      }
    }
  }

  public int buscarElemento(String elemento) {
    int i;
    if (!estaVazio()) {
      for (i = 0; i < this.lista.length; i++) {
        if (this.lista[i].equals(elemento)) {
          return i;
        }
      }
    }
    System.out.println("Elemento não encontrado na lista.");
    return -1;
  }

  public void alterarElemento(String elementoASerAlterado, String alteracao) {
    if (buscarElemento(elementoASerAlterado) >= 0) {
      this.lista[buscarElemento(elementoASerAlterado)] = alteracao;
      System.out.println("Elemento " + elementoASerAlterado + " alterado com sucesso para " + alteracao);
    }
  }

  public void quantidadeElementos() {
    int cont = 0;
    if (!estaVazio()) {
      for (int i = 0; i < this.lista.length; i++) {
        if (this.lista[i] != null) {
          cont++;
        }
      }
    }
    System.out.println("A lista possui " + cont + " elementos!");
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

    return resultado;
  }

  public String obter(int indice) {
    if (indice >= lista.length || indice < 0) {
      return "Não encontrado";
    }
    return lista[indice];
  }

  public boolean inserir(int indice, String elemento) {
    if (indice < 0 || indice > (lista.length - 1) || estaCheia()) {
      return false;
    }

    for (int i = lista.length - 1; i > indice; i--) {
      lista[i] = lista[i - 1];
    }

    lista[indice] = elemento;

    return true;
  }

  public String removerPorIndice(int indice) {
    if (indice >= 0 && indice < lista.length) {
      lista[indice] = null;
      for (int i = indice; i < lista.length - 1; i++) {
        lista[i] = lista[i + 1];
      }
      lista[lista.length - 1] = null;
      return lista[indice];
    }
    return null;
  }

  public void limpar() {
    lista = new String[0];
  }

  public void exibirElementos() {
    for (String elemente : lista) {
      System.out.print("[" + elemente + "] ");
    }
    System.out.println(".");
  }

  public int ultimoIndiceDe(String elemento) {
    for (int i = lista.length - 1; i >= 0; i--) {
      if (lista[i] != null && lista[i].equals(elemento)) {
        return i;
      }
    }
    return -1;
  }

  public int contarOcorrencias(String elemento) {
    int quantidadeOcorrencias = 0;
    for (int i = 0; i < lista.length; i++) {
      if (lista[i] != null && lista[i].equals(elemento)) {
        quantidadeOcorrencias++;
      }
    }
    return quantidadeOcorrencias;
  }

  public int substituir(String antigo, String novo) {
    int quantidadeTrocas = 0;
    for (int i = 0; i < lista.length; i++) {
      if (lista[i] != null && lista[i].equals(antigo)) {
        lista[i] = novo;
        quantidadeTrocas++;
      }
    }
    return quantidadeTrocas;
  }
}
