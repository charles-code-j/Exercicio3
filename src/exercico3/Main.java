package exercico3;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.setCapacidadeElevador(10);
        elevador.setAndarAtual(0);
        elevador.setQuantasPessoasPossui(3);
        elevador.setTotalDeAndares(7);

        elevador.acrecentarPessoa();
        elevador.acrecentarPessoa();
        elevador.acrecentarPessoa();
        elevador.acrecentarPessoa();
        elevador.acrecentarPessoa();
        elevador.acrecentarPessoa();
        elevador.acrecentarPessoa();
        elevador.acrecentarPessoa();
        elevador.acrecentarPessoa();
        elevador.acrecentarPessoa();
        elevador.acrecentarPessoa();

        elevador.tirarPessoa();
        elevador.tirarPessoa();
        elevador.tirarPessoa();
        elevador.tirarPessoa();
        elevador.tirarPessoa();
        elevador.tirarPessoa();
        elevador.tirarPessoa();
        elevador.tirarPessoa();
        elevador.tirarPessoa();
        elevador.tirarPessoa();
        elevador.tirarPessoa();

        elevador.sobeElevador();
        elevador.sobeElevador();
        elevador.sobeElevador();
        elevador.sobeElevador();
        elevador.sobeElevador();
        elevador.sobeElevador();
        elevador.sobeElevador();
        elevador.sobeElevador();
        elevador.sobeElevador();
        elevador.sobeElevador();
        elevador.sobeElevador();
        elevador.sobeElevador();

        elevador.descerElevadro();
        elevador.descerElevadro();
        elevador.descerElevadro();
        elevador.descerElevadro();
        elevador.descerElevadro();
        elevador.descerElevadro();
        elevador.descerElevadro();
        elevador.descerElevadro();
        elevador.descerElevadro();
        elevador.descerElevadro();
        elevador.descerElevadro();


        elevador.imprimir();

    }
}
