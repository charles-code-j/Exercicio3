package exercico3;

public class Elevador {
    private Integer andarAtual = 0;
    private Integer totalDeAndares;
    private Integer capacidadeElevador;
    private Integer quantasPessoasPossui;

    public Elevador() {
        this.totalDeAndares = totalDeAndares;
        this.capacidadeElevador = capacidadeElevador;
    }


    public Integer getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(Integer andarAtual) {
        this.andarAtual = andarAtual;
    }

    public Integer getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(Integer totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public Integer getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public void setCapacidadeElevador(Integer capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public Integer getQuantasPessoasPossui() {
        return quantasPessoasPossui;
    }

    public void setQuantasPessoasPossui(Integer quantasPessoasPossui) {
        this.quantasPessoasPossui = quantasPessoasPossui;
    }

    public void acrecentarPessoa() {
        if (capacidadeElevador > quantasPessoasPossui) {
            System.out.println("Não pode entrar");
        } else {
            quantasPessoasPossui++;
        }

    }


    public void tirarPessoa() {
        if (quantasPessoasPossui <= 0) {
            System.out.println("Não tem ninguem!");
        } else {
            quantasPessoasPossui--;
        }

    }

    public void sobeElevador() {
        if (andarAtual > totalDeAndares) {
            System.out.println("Nao sobe mais!");
        } else {
            andarAtual++;
        }

    }

    public void descerElevadro() {
        if (andarAtual < totalDeAndares) {
            System.out.println("nao desce!");
        } else {
            andarAtual--;
        }
    }

    public void imprimir() {
        System.out.println("Andar atual: " + getAndarAtual());
        System.out.println("Quantidade pessoa: " + getQuantasPessoasPossui());
        System.out.println("Total de andares: " + getTotalDeAndares());
        System.out.println("Capacidade de pessoa: " + getCapacidadeElevador());
    }
}
