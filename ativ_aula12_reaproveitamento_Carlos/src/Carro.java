import java.util.ArrayList;

public class Carro implements Veiculo {

    private int ano;
    private String cor;
    private String modelo;
    private String placa;
    private int tipo;
    private Double valorVeiculo;


    @Override
    public int getAno() {
        return ano;
    }

    @Override
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getPlaca() {
        return placa;
    }

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public int getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public Double getValor() {
        return valorVeiculo;
    }

    @Override
    public void setValor(Double valorVeiculo) {
        this.valorVeiculo = valorVeiculo;
    }

    @Override
    public void fabricaVeiculo(Veiculo veiculo) {listVeiculo.add(veiculo);}

    @Override
    public void venderVeiculo(Veiculo veiculo) {
        listVeiculo.remove(veiculo);
    }
}

