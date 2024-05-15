import java.util.Scanner;

public class ReprodutorMusical {

        //tocar, pausar, selecionarMusica

        private String musica;

        public void tocarMusica (String musica) {
            this.musica = musica;
            System.out.printf("A musica: %s, está sendo tocada!!\n", musica);

        }

        public void pausarMusica(){
            System.out.printf("A musica: %s, foi pausada.\n", musica);
        }

        public void selecionarMusica() {
            System.out.println("Selecione outra música a ser tocada.\n\n");
        }
}

