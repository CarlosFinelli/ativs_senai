import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Fabrica {
    public static void main(String[] args) {

        //Criação do objeto responsavél por ler a informação digitado pelo úsuario
        Scanner scan = new Scanner(System.in);
        Carro veiculo = new Carro();
        //Solicitando informação ao Usuario
        int fechar = 0;
        while (fechar != 2) {
            System.out.println("1 = Carro");
            System.out.println("2 = Moto\n");
            System.out.print("Por favor, selecione o veículo que deseja adicionar: ");
            int opcao = scan.nextInt();
            System.out.flush();
            switch (opcao) {
                case 1:
                    Carro carro = new Carro();
                    carro.setTipo(1);
                    System.out.println("Inserção de dados de uma Carro");
                    System.out.print("Por favor, digite a cor da Carro: ");
                    String cor = scan.nextLine();
                    cor = scan.nextLine();
                    carro.setCor(cor);
                    System.out.print("Por favor, digite o ano da Carro: ");
                    int ano = scan.nextInt();
                    carro.setAno(ano);
                    System.out.print("Por favor, digite o modelo da Carro: ");
                    String modelo = scan.nextLine();
                    modelo = scan.nextLine();
                    carro.setModelo(modelo);
                    System.out.print("Por favor, digite a placa da Carro: ");
                    String placa = scan.nextLine();
                    carro.setPlaca(placa);
                    System.out.print("Por favor, digite o valor da Carro: ");
                    Double valorCarro = scan.nextDouble();
                    carro.setValor(valorCarro);
                    carro.fabricaVeiculo(carro);
                    break;

                case 2:
                    Moto moto = new Moto();
                    moto.setTipo(2);
                    System.out.println("Inserção de dados de uma Moto");
                    System.out.print("Por favor, digite a cor da Moto: ");
                    cor = scan.nextLine();
                    cor = scan.nextLine();
                    moto.setCor(cor);
                    System.out.print("Por favor, digite a ano da Moto: ");
                    ano = scan.nextInt();
                    moto.setAno(ano);
                    System.out.print("Por favor, digite o modelo da Moto: ");
                    modelo = scan.nextLine();
                    modelo = scan.nextLine();
                    moto.setModelo(modelo);
                    System.out.print("Por favor, digite a placa da Moto: ");
                    placa = scan.nextLine();
                    moto.setPlaca(placa);
                    System.out.print("Por favor, digite o valor da Moto: ");
                    Double valorMoto = scan.nextDouble();
                    moto.setValor(valorMoto);
                    moto.listVeiculo.add(moto);
                    break;
            }

            System.out.flush();
            for (int i = 0; i < veiculo.listVeiculo.size(); i++) {
                if (veiculo.listVeiculo.get(i) instanceof Carro) {
                    Carro carro = (Carro) veiculo.listVeiculo.get(i);
                    System.out.println("Dados do Carro " + i + ":");
                    System.out.println("Modelo: " + carro.getModelo());
                    System.out.println("Ano: " + carro.getAno());
                    System.out.println("Cor: " + carro.getCor());
                    System.out.println("Placa: " + carro.getPlaca());
                    System.out.println("Valor: " + carro.getValor());
                    System.out.println("");
                } else if (veiculo.listVeiculo.get(i) instanceof Moto) {
                    Moto moto = (Moto) veiculo.listVeiculo.get(i);
                    System.out.println("Dados da moto " + i + ":");
                    System.out.println("Modelo: " + moto.getModelo());
                    System.out.println("Ano: " + moto.getAno());
                    System.out.println("Cor: " + moto.getCor());
                    System.out.println("Placa: " + moto.getPlaca());
                    System.out.println("Valor: " + moto.getValor());
                    System.out.println("");
                }
            }
            System.out.print("Deseja remover algum veículo da lista? '1 = Sim, 2 = Não': ");
            int decisao = scan.nextInt();
            if (decisao == 1) {
                System.out.print("Insira a posição do veículo na lista: ");
                int posicao = scan.nextInt();
                veiculo.listVeiculo.remove(posicao);
            }
            System.out.println();
            System.out.print("Deseja inserir mais algum veículo? '1 = Sim, 2 = Não': ");
            fechar = scan.nextInt();
        }
    }
}