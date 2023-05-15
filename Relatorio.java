package trab2pooi;

import java.util.Scanner;

public class Relatorio {
    public static void main(String[] args) {
        // VETOR DOS GASTOS -----------------------------------------------
        Gasto[] gastos = new Gasto[30];
        Ganho[] ganhos = new Ganho[30];
        int opcaoMenu = 0;
        int posicaoAtual = 0;
        int totalAlimentacao = 0;
        int totalTransporte = 0;
        int totalDebito = 0;
        int totalCredito = 0;
        int totalFreelancer = 0;
        int totalSalario = 0;
        int totalDividendos = 0;
        int totalGanhos = 0;
        int totalGastos = 0;
            //MENU DO USUÁRIO----------------------------------------------
        Scanner scanner = new Scanner(System.in);
        
        while(opcaoMenu != 6){
            System.out.println("Gestão Financeira");
            System.out.println("___________________");
            System.out.println("1 - Adicionar gasto");
            System.out.println("2 - Adicionar ganho");
            System.out.println("3 - Relatório de gastos");
            System.out.println("4 - Relatório de ganhos");
            System.out.println("5 - Relatório mensal");
            System.out.println("6 - Sair");
            System.out.println("Selecione uma opção");
            opcaoMenu = new Scanner(System.in).nextInt();
            // OPÇÃO 1 -----------------------------------------
                if (opcaoMenu == 1){
                    System.out.println("_______________________________");
                    System.out.println("Selecione o tipo de gasto: ");
                    System.out.println("1 - Alimentação");
                    System.out.println("2 - Transporte");
                    System.out.println("_______________________________");
                    int tipoGasto;
                    tipoGasto = scanner.nextInt();
                    System.out.println("_______________________________");
                    System.out.println("Informe a data do gasto: ");
                    System.out.println("_______________________________");
                    String dataGasto;
                    scanner.nextLine();
                    dataGasto = scanner.nextLine();
                    System.out.println("________________________________");
                    System.out.println("Informe a forma de pagamento: ");
                    System.out.println("1 - Débito");
                    System.out.println("2 - Crédito");
                    System.out.println("_______________________________");
                    int formaPagamento;
                    formaPagamento = scanner.nextInt();
                    System.out.println("________________________________");
                    System.out.println("Informe o valor do gasto: ");
                    System.out.println("_______________________________");
                    int valGasto;
                    valGasto = scanner.nextInt();
                    // SALVANDO O GASTO NO VETOR GASTO[]
            
                    Gasto novoGasto = new Gasto(tipoGasto, dataGasto, formaPagamento, valGasto);
                    gastos[opcaoMenu-1] = novoGasto; 
                    for (int i = 0; i < gastos.length; i++){
                        if (gastos[i] == null){
                            gastos[i] = novoGasto;
                            break;
                        }
                    }
                    System.out.println("Gasto salvo com sucesso!");
                    System.out.println("Tipo de gasto: " + novoGasto.getTipoGasto());
                    System.out.println("Data do gasto: " + novoGasto.getDataGasto());                        System.out.println("Forma de pagamento do gasto: " + novoGasto.getFormaPagamento());
                    System.out.println("Valor do gasto: R$" + novoGasto.getValGasto() + ".00");
                    posicaoAtual++;
                    System.out.println("Gasto #" + posicaoAtual);   
                    
            } 
            //OPÇÃO 2 --------------------------------------
            else if(opcaoMenu == 2) {
                System.out.println("_______________________________");
                System.out.println("Digite o tipo de ganho: ");
                System.out.println("1 - Salario");
                System.out.println("2 - Freelancer");
                System.out.println("3 - Dividendos");
                System.out.println("_______________________________");
                int tipoGanho;
                tipoGanho = scanner.nextInt();
                scanner.nextLine();

                System.out.println("_______________________________");
                System.out.println("Digite a data do ganho: ");
                System.out.println("_______________________________");
                String dataGanho;
                dataGanho = scanner.nextLine();

                System.out.println("_______________________________");
                System.out.println("Digite o valor do ganho: ");
                System.out.println("_______________________________");
                int valGanho;
                valGanho = scanner.nextInt();
                // SALVANDO O GANHO NO VETOR GANHO[]
                Ganho novoGanho = new Ganho(tipoGanho, dataGanho, valGanho);
                ganhos[opcaoMenu - 1] = novoGanho;
                for (int i = 0; i <ganhos.length; i++){
                    if (ganhos[i] == null) {
                        ganhos[i] = novoGanho;
                        break;
                    }
                }
                System.out.println("Ganho salvo com sucesso!");
                System.out.println("Tipo de ganho: " + novoGanho.getTipoGanho());
                System.out.println("Data do ganho: " + novoGanho.getDataGanho());
                System.out.println("Valor do ganho: " + novoGanho.getValGanho());
                posicaoAtual++;
                System.out.println("Ganho #"+ posicaoAtual);
            } 
            // OPÇÃO 3 ----------------------------------
            else if (opcaoMenu == 3) {
                // ACUMULAR TIPO DE GASTO
                for (int i = 0; i < gastos.length; i++) { // percorrer o vetor de gastos
                    Gasto gasto = gastos[i];
                    if (gasto != null) {
                        // verificar o tipo de gasto e adicionar seu valor ao total correspondente
                        if (gasto.getTipoGasto() == 1) {
                            totalAlimentacao += gasto.getValGasto();
                        } else if (gasto.getTipoGasto() == 2) {
                            totalTransporte += gasto.getValGasto();
                        }
                        if (gasto.getFormaPagamento() == 1) {
                            totalDebito += gasto.getValGasto();
                        } else if (gasto.getFormaPagamento() == 2) {
                            totalCredito += gasto.getValGasto();
                        }
                    }
                }
                // imprimir os totais acumulados para cada tipo de gasto
                System.out.println("Relatório de gastos");
                System.out.println("___________________");
                System.out.println("Alimentação: R$" + totalAlimentacao + ".00");
                System.out.println("Transporte: R$" + totalTransporte + ".00");
                System.out.println("Total gasto em Débito: " + totalDebito + ".00");
                System.out.println("Total gasto em Crédito: " + totalCredito + ".00");
            } 
            // OPÇÃO 4
            else if (opcaoMenu == 4){
                // ACUMULAR TIPO DE GANHO
                for (int i = 0; i < ganhos.length; i++) { // percorrer o vetor de ganhos
                    Ganho ganho = ganhos[i];
                    if (ganho != null) {
                        // verificar o tipo de ganho e adicionar seu valor ao total correspondente
                        if (ganho.getTipoGanho() == 1) {
                            totalSalario += ganho.getValGanho();
                        } else if (ganho.getTipoGanho() == 2) {
                            totalFreelancer += ganho.getValGanho();
                        } else if (ganho.getTipoGanho() == 3) {
                            totalDividendos += ganho.getValGanho();
                        }
                    }
                }
                // imprimir os totais acumulados para cada tipo de ganho
                System.out.println("Relatório de ganhos");
                System.out.println("___________________");
                System.out.println("Salário: R$" + totalSalario);
                System.out.println("Freelancer: R$" + totalFreelancer);
                System.out.println("Dividendos: R$" + totalDividendos);
            } 
            // OPÇÃO 5
            else if (opcaoMenu == 5){
                for (int i = 0; i < gastos.length; i++) { //PERCORRER VETOR DE GASTOS E SOMAR
                    Gasto gasto = gastos[i];
                    if (gasto != null) {
                        totalGastos += gasto.getValGasto();
                    }
                }
                for (int i = 0; i < ganhos.length; i++) { // PERCORRER VETOR DE GANHOS E SOMAR
                    Ganho ganho = ganhos[i];
                    if (ganho != null) {
                        totalGanhos += ganho.getValGanho();
                    }
                }
                int saldoMensal = totalGanhos - totalGastos;

                System.out.println("Relatório Mensal");
                System.out.println("___________________");
                System.out.println("Total de gastos: R$" + totalGastos + ".00");
                System.out.println("Total de ganhos: R$" + totalGanhos + ".00");
                System.out.println("Saldo Mensal: R$" + saldoMensal + ".00");
            }
            // OPÇÃO 6
            else if (opcaoMenu == 6){
                System.out.println("Saiu com sucesso");
            }
        }
        scanner.close();
    }
}