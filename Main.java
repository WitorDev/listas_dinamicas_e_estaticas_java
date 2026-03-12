public class Main {
  public static void main(String[] args) {
    ListaSimples objetoLista = new ListaSimples(10);
    String[] lista = objetoLista.lista;
    String[] listaElementos = { "bob1", "bob2", "bob3", "bob4" };

    objetoLista.adicionarVarios(listaElementos);

  }
}
