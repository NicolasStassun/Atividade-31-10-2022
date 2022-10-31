import java.util.Scanner;

public class atv1 {

    static Scanner sc = new Scanner(System.in);

    public static void main (String [] args){

        int opcao=0;
        double salario=0;

        System.out.println("Escolha uma opção: \n" +
                "1 - Novo salário. \n" +
                "2 - Férias. \n" +
                "3 - Décima teceiro. \n" +
                "4 - Sair.");
        opcao = sc.nextInt();

        switch(opcao){

            case 1:

                System.out.println("Informe seu salário:  ");

                salario = sc.nextDouble();

                if(salario<350) {
                    salario*=1.15;
                    System.out.println("R$"+salario);
                }
                else if(salario>=350 || salario<600){
                    salario*=1.10;
                    System.out.println("R$"+salario);
                }
                else{
                    salario*=1.05;
                    System.out.println("R$"+salario);
                }

            break;

            case 2:

                System.out.println("Informe seu salário: ");

                salario = sc.nextDouble();

                salario=(salario/3)+salario;

                System.out.println("R$"+salario);

            break;

            case 3:

                int meses=0;

                System.out.println("Informe seu salário: ");

                salario = sc.nextDouble();

                System.out.println("Informe quantos meses foram trabalhados: ");

                meses = sc.nextInt();

                salario=(salario*meses)/12;

                if(meses>12){
                    System.out.println("Erro!");
                }
                else{
                    System.out.println("R$"+salario);
                }

            break;
        }




    }

}
