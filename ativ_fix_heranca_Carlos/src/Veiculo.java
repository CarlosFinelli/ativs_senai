import java.util.ArrayList;

public interface Veiculo {

    ArrayList<Veiculo> listVeiculo = new ArrayList<>();

    public int getAno();

    public void setAno(int ano);

    public String getCor();

    public void setCor(String cor);

    public String getModelo();

    public void setModelo(String modelo);

    public String getPlaca();

    public void setPlaca(String placa);

    public int getTipo();

    public void setTipo(int tipo);

    public Double getValor();

    public void setValor(Double valorVeiculo);

    public void venderVeiculo(Veiculo veiculo);

    public void fabricaVeiculo(Veiculo veiculo);
}
