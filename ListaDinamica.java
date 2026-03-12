public class ListaDinamica implements ListaOperacoes {

  No inicio;

  public ListaDinamica() {
    this.inicio = new No(null);
  }

  public ListaDinamica(No inicio) {
    this.inicio = inicio;
  }

  public void adicionarElemento(String valor) {

    if (!temInicio()) {
      inicio.setConteudo(valor);
      return;
    }

    No aux = inicio;

    while (aux.getProx() != null) {
      aux = aux.getProx();
    }

    aux.setProx(new No(valor));
  }

  private boolean temInicio() {
    return inicio.getConteudo() != null;
  }

  public void exibirElementos() {

    if (!temInicio()) {
      return;
    }

    No aux = inicio;

    while (aux != null) {
      aux = aux.getProx();
    }
  }

  public int removerTodas(String elemento) {

    int removidos = 0;

    if (!temInicio())
      return removidos;

    while (inicio != null && inicio.getConteudo().equals(elemento)) {
      inicio = inicio.getProx();
      removidos++;
    }

    No atual = inicio;

    while (atual != null && atual.getProx() != null) {

      if (atual.getProx().getConteudo().equals(elemento)) {
        atual.setProx(atual.getProx().getProx());
        removidos++;
      } else {
        atual = atual.getProx();
      }
    }

    return removidos;
  }

  public int contar() {

    int total = 0;

    No aux = inicio;

    while (aux != null) {

      if (aux.getConteudo() != null)
        total++;

      aux = aux.getProx();
    }

    return total;
  }

  public int adicionarVarios(String[] elementos) {

    int adicionados = 0;

    if (!temInicio()) {

      inicio = new No(elementos[0]);
      adicionados++;

      No aux = inicio;

      for (int i = 1; i < elementos.length; i++) {

        No novo = new No(elementos[i]);
        aux.setProx(novo);
        aux = novo;

        adicionados++;
      }

    } else {

      No aux = inicio;

      while (aux.getProx() != null) {
        aux = aux.getProx();
      }

      for (String item : elementos) {

        No novo = new No(item);
        aux.setProx(novo);
        aux = novo;

        adicionados++;
      }
    }

    return adicionados;
  }

  public String obter(int indice) {

    if (indice < 0) {
      return null;
    }

    No aux = inicio;
    int posicao = 0;

    while (aux != null) {

      if (posicao == indice) {
        return aux.getConteudo();
      }

      aux = aux.getProx();
      posicao++;
    }

    return null;
  }

  public boolean inserir(int indice, String elemento) {

    if (indice < 0) {
      return false;
    }

    No novoNo = new No(elemento);

    if (indice == 0) {

      novoNo.setProx(inicio);
      inicio = novoNo;

      return true;
    }

    No aux = inicio;
    int pos = 0;

    while (aux != null) {

      if (pos == indice - 1) {

        novoNo.setProx(aux.getProx());
        aux.setProx(novoNo);

        return true;
      }

      aux = aux.getProx();
      pos++;
    }

    return false;
  }

  public String removerPorIndice(int indice) {

    if (indice < 0) {
      return null;
    }

    if (indice == 0) {

      String removido = inicio.getConteudo();
      inicio = inicio.getProx();

      return removido;
    }

    No aux = inicio;
    int pos = 0;

    while (aux != null && aux.getProx() != null) {

      if (pos == indice - 1) {

        String removido = aux.getProx().getConteudo();
        aux.setProx(aux.getProx().getProx());

        return removido;
      }

      aux = aux.getProx();
      pos++;
    }

    return null;
  }

  public void limpar() {

    if (!temInicio()) {
      return;
    }

    inicio.setConteudo(null);
    inicio.setProx(null);

  }

  public int ultimoIndiceDe(String elemento) {

    int pos = 0;
    int ultimo = -1;

    No aux = inicio;

    while (aux != null) {

      if (aux.getConteudo().equals(elemento)) {
        ultimo = pos;
      }

      aux = aux.getProx();
      pos++;
    }

    if (ultimo == -1)
    else

    return ultimo;
  }

  public int contarOcorrencias(String elemento) {

    int total = 0;
    No aux = inicio;

    while (aux != null) {

      if (aux.getConteudo().equals(elemento)) {
        total++;
      }

      aux = aux.getProx();
    }

    return total;
  }

  public int substituir(String antigo, String novo) {

    int alteracoes = 0;
    No aux = inicio;

    while (aux != null) {

      if (aux.getConteudo().equals(antigo)) {
        aux.setConteudo(novo);
        alteracoes++;
      }

      aux = aux.getProx();
    }

    return alteracoes;
  }
}
