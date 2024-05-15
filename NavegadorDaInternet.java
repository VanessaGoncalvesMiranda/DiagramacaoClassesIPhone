public class NavegadorDaInternet {

    //exibirPagina, adicionarNovaAba, atualizarPagina

    private String pagina;
    private String novaAba;
    private String paginaAtualizada;

    public void exibirPagina (String pagina) {
        this.pagina = pagina;
        System.out.printf("A página: %s, está sendo exibida!\n", pagina);
    }

    public void adicionarNovaAba (String novaAba) {
        this.novaAba = novaAba;
        System.out.printf("Foi adicionada a aba %s no navegador!\n", novaAba);
    }

    public void atualizarPagina (String paginaAtualizada) {
        this.paginaAtualizada = paginaAtualizada;
        System.out.printf("A página %s foi atualizada.\n", paginaAtualizada);
    }
    
}
