public class App {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("14 Pro Max");

        iphone.tocar();
        iphone.selecionarMusica("Bohemian Rhapsody");
        iphone.pausar();

        iphone.ligar("11999999999");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://openai.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
