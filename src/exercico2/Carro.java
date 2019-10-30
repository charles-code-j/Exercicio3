package exercico2;

public class Carro {
    private String modelo;
    private String cor;
    private Integer ano;
    private String marca;
    private String Chassi;
    private Proprietario proprietario;
    private Double velocidadeMax;
    private Double velocidadeAtual;
    private Integer numeroMarcha;
    private Integer quantidadeCombustivel;

    public Carro() {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return Chassi;
    }

    public void setChassi(String chassi) {
        Chassi = chassi;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public Double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(Double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public Double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(Double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Integer getNumeroMarcha() {
        return numeroMarcha;
    }

    public void setNumeroMarcha(Integer numeroMarcha) {
        this.numeroMarcha = numeroMarcha;
    }

    public Integer getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(Integer quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public void acelera() {
        for (int i = 0; i < velocidadeAtual; i++) {
            if (velocidadeAtual <= velocidadeMax) {
                velocidadeAtual++;
            } else {
                System.out.println("Velocidade esta no maximo!");
            }

        }

    }

    public void freia() {
        for (int i = 0; i < velocidadeAtual; i++) {
            if (velocidadeAtual > velocidadeMax) {
                velocidadeAtual--;
            } else {
                System.out.println("O carro ja parou!");
            }

        }
    }

    public void trocaMarchar() {
        for (int i = 1; i < numeroMarcha; i++) {
            if (numeroMarcha <= numeroMarcha) {
                numeroMarcha++;
            } else {
                numeroMarcha--;
            }

        }
    }

    public void reduzMarcha() {
        for (int j = 0; j < numeroMarcha; j++) {
            if (numeroMarcha >= numeroMarcha) {
                numeroMarcha--;
            } else {
                if(velocidadeAtual > 0){
                    System.out.println("Não pode trocar marcha");
                }
            }
        }
    }
    public void calculaAutonomia(Integer consumoMedia){
        int consumo;
        consumo = (quantidadeCombustivel * consumoMedia);

    }

}
