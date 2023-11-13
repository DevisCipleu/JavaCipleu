package lab3;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("\n\n\n1.Exercitiu gasire elemente comune intre 2 sire.\n" +
                    "2.Exercitiu gasire numere pare dintr-un sir de numere.\n" +
                    "3.Exercitiu afisare secventa Fibonacci pentru pana la un numar citit de la tastatura.\n" +
                    "4.Exercitiu verificare daca un cuvant este palindrom.\n" +
                    "5.Quit");
            System.out.println("\n\nIntroduceti numarul  optiunii pe care doriti sa o accesati: ");
            n = scanner.nextInt();

            switch (n){
                case 1:{
                    Ex1();
                    break;
                }
                case 2:{
                    Ex2();
                    break;
                }
                case 3: {
                    Ex3();
                    break;
                }
                case 4:{
                    Ex4();
                    break;
                }
                default:
                    if( n != 5) {
                        System.out.println("Optiune invalida!");
                    }
            }
        }while ( n != 5);

    }
    public static void Ex1(){

        Scanner scanner = new Scanner(System.in);
        String[] sir1 = new String[3];
        String[] sir2 = new String[3];

        for (int i = 0; i < sir1.length; i++){
            System.out.println("Introduceti cuvantul "+(i+1)+" al primului sir: ");
            sir1[i] = scanner.nextLine();
        }
        for (int i = 0; i < sir2.length; i++){
            System.out.println("Introduceti cuvantul "+(i+1)+" al celui de al doilea sir: ");
            sir2[i] = scanner.nextLine();
        }

        for (int i = 0; i < sir1.length; i++ ){
            for (int j = 0 ; j < sir2.length; j++){
                if(sir1[i].equals(sir2[j])){
                    System.out.println("elementul comun al sirurilor este:  "+sir1[i]+"  !");
                }
            }
        }

    }

    public static void Ex2(){
        Scanner scanner = new Scanner(System.in);

        int [] arr = new int[10];
        int x;

        System.out.println("sirul are 10 elemente!!");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println("Introduceti numarul "+(i+1)+" al sirului: ");
            arr[i] = scanner.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            x = 0;
            for(int j = 2; j <= arr[i]/2; j++ ){

                if (arr[i] % j == 0){
                    x=1;
                }
            }
            if(x == 0)
                System.out.println("\nnumarul "+arr[i]+" este prim!");
        }
    }

    public static void Ex3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un numar, pana la care se va afisa seria Fibonacci: ");
        int n = scanner.nextInt();
        int[] sir = new int[n];

        sir[0] = 0;
        sir[1] = 1;
        System.out.print(sir[0]+" "+sir[1]);
        for (int i = 2 ; i < sir.length ; i++) {
            sir[i] = sir[i - 1] + sir[i - 2];
            if (sir[i] > sir.length){
                sir[i] = 0;
                break;
            }
            System.out.print(" "+sir[i]);
        }
    }

    public static void Ex4(){
        Scanner scanner = new Scanner(System.in);

        String cuvant;
        System.out.println("introduceti un cuvant: ");
        cuvant = scanner.nextLine();

        StringBuilder invers = new StringBuilder();
        invers.append(cuvant);
        invers.reverse();

        if (cuvant.equals(invers.toString()))
            System.out.println("cuvantul este palindrom!");

        else
            System.out.println("cuvantul nu este palindrom!");

    }
}
