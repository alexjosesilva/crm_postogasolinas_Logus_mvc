package view;

import controller.ControllerUsuario;
import model.BombaCombustivel;
import model.ModeloVeiculo;
import model.TipoCombustivel;

import java.util.Scanner;
public class InterfaceUsuario {

    ControllerUsuario controllerUsuario = new ControllerUsuario();
    public void exibirMenu() {
        int opcao;

        do{
            System.out.println("===== Menu Principal =====");
            System.out.println("1. Incluir novo modelo de veículo");
            System.out.println("2. Incluir novo tipo de combustível");
            System.out.println("3. Incluir nova bomba de combustível");
            System.out.println("4. Mudar critério de enfileiramento");
            System.out.println("5. Sair");
            System.out.println("==========================");
            System.out.print("Escolha uma opção: ");

            Scanner scanner = new Scanner(System.in);

            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    incluirNovoModeloVeiculo();
                    break;
                case 2:
                    incluirNovoTipoCombustivel();
                    break;
                case 3:
                    incluirNovaBombaCombustivel();
                    break;
                case 4:
                    mudarCriterioEnfileiramento();
                    break;
                case 5:
                    System.out.println("Saindo do programa...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }while (opcao!=5);
    }

    private void incluirNovoModeloVeiculo() {
        Scanner scanner = new Scanner(System.in);
        // Implemente aqui a lógica para incluir um novo modelo de veículo
        System.out.println("Bem vindo a inclusão de um novo Modelo.");

        System.out.println("Inserir nome do Modelo: ");
        String novoModeloNome = scanner.nextLine();

        System.out.println("Inserir consumoEtanol: ");
        String consumoEtanol = scanner.nextLine();
        int iconsumoEtanol = Integer.parseInt(consumoEtanol);

        System.out.println("Inserir consumoGasolina: ");
        String consumoGasolina = scanner.nextLine();
        int iconsumoGasolina = Integer.parseInt(consumoGasolina);

        System.out.println("Inserir consumoDiesel: ");
        String consumoDiesel = scanner.nextLine();
        int iconsumoDiesel = Integer.parseInt(consumoDiesel);

        ModeloVeiculo novoModelo = new ModeloVeiculo(novoModeloNome,iconsumoEtanol,iconsumoGasolina,iconsumoDiesel);
        controllerUsuario.incluirNovoModeloVeiculo(novoModelo);
        controllerUsuario.exibirTodosModelos();

        System.out.println("Obrigado e Volte Sempre");

    }

    private void incluirNovoTipoCombustivel() {
        Scanner scanner = new Scanner(System.in);
        // Implemente aqui a lógica para incluir um novo tipo de combustível
        System.out.println("Bem vindo a inclusão de um novo Tipo de Combustivel.");
        System.out.println("Inserir nome do combustivel : ");
        String nomeCombustivel = scanner.nextLine();

        TipoCombustivel novotipo = new TipoCombustivel(nomeCombustivel);
        controllerUsuario.incluirNovoTipoCombustivel(novotipo);
        controllerUsuario.exibirTodosCombustiveis();
        System.out.println("Obrigado e Volte Sempre");
    }

    private void incluirNovaBombaCombustivel() {
        Scanner scanner = new Scanner(System.in);
        // Implemente aqui a lógica para incluir uma nova bomba de combustível
        System.out.println("Bem vindo a inclusão de um nova Bomba.");

        System.out.println("Inserir Identificador da Bomba : ");
        String identificadorBomba = scanner.nextLine();

        System.out.println("Inserir nome do combustivel : ");
        String nomeCombustivel = scanner.nextLine();
        TipoCombustivel novotipocombustivel = new TipoCombustivel(nomeCombustivel);

        BombaCombustivel bomba = new BombaCombustivel(identificadorBomba,novotipocombustivel);
        controllerUsuario.incluirNovaBombaCombustivel(bomba);

        System.out.println("Obrigado e Volte Sempre");
    }

    private void mudarCriterioEnfileiramento() {
        Scanner scanner = new Scanner(System.in);
        // Implemente aqui a lógica para mudar o critério de enfileiramento
        System.out.println("Bem vindo a Muda Enfileiramento.");

        System.out.println("Obrigado e Volte Sempre");
    }

}
