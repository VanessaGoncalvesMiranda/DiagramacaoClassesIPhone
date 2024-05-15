public class AparelhoTelefonico {

    // ligar, atender, iniciarCorreioVoz

private int numero;
private int numeroRecebido;
private int numeroCorreioVoz;

public void ligar(int numero) {
    this.numero = numero;
    System.out.printf("Digite o número para iniciar a ligação: %d\n", numero);
}

public void atenderLigacao(int numeroRecebido) {
    this.numeroRecebido = numeroRecebido;
    System.out.printf("Está recebendo ligação do número: %d.\n", numeroRecebido);
}

public void iniciarCorreioVoz(int numeroCorreioVoz) {
    this.numeroCorreioVoz = numeroCorreioVoz;
    System.out.printf("Acessar a caixa de correio de voz do número: %d.\n\n", numeroCorreioVoz);
}
    
}
