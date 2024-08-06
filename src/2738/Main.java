import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int[][] setA = new int[num1][num2];
        int[][] setB = new int[num1][num2];

        for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                setA[i][j] = scan.nextInt();
            }
        }

        for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                setB[i][j] = scan.nextInt();
            }
        }

        for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                System.out.print((setA[i][j] + setB[i][j]) + " ");
            }
            System.out.println();
        }

        /*for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                System.out.println("setA : " + setA[i][j]);
            }
        }

        for(int i=0;i<num1;i++){
            for(int j=0;j<num2;j++){
                System.out.println("setB : " + setB[i][j]);
            }
        }*/

        scan.close();
    }
}