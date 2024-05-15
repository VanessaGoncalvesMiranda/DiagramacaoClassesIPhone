public class Main {
    public static void main(String[] args) {

       ReprodutorMusical musical = new ReprodutorMusical();
    
       musical.tocarMusica("Sonho Meu");
       musical.pausarMusica();
       musical.selecionarMusica();


       AparelhoTelefonico numero1 = new AparelhoTelefonico();

       numero1.ligar(111111111);
       numero1.atenderLigacao(22222222);
       numero1.iniciarCorreioVoz(3333333);

       NavegadorDaInternet pagina1 = new NavegadorDaInternet();

       pagina1.exibirPagina("Dio - Bootcamp Santander");
       pagina1.adicionarNovaAba("Santander");
       pagina1.atualizarPagina("Dio - Bootcamp Santander");
    }
}