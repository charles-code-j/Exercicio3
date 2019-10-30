package exercico2;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setBairro("fwwefewfwe");
        endereco.setNumero(12);
        endereco.setRua("wefwefwef");

        Proprietario proprietario = new Proprietario();
        proprietario.setNome("ola");
        proprietario.setDataNacimento("23/12/43");
        proprietario.setCpf(12312312);
        proprietario.setRg("324324");

        Carro carro = new Carro();
        carro.setAno(2019);
        carro.setChassi("3wefwe12");
        carro.setCor("preta");
        carro.setMarca("volt");
        carro.setModelo("324ew");
        carro.setNumeroMarcha(5);
        carro.setQuantidadeCombustivel(20);
        carro.setVelocidadeAtual(120.4);
        carro.setVelocidadeMax(300.0);

        Marca marca = new Marca();
        marca.setDataDeFabricacao("24/12/1999");
        marca.setNome("gol");



    }
}
