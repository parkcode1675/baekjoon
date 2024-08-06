import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int [][] set = new int[100][100];

        int num = scan.nextInt();

        int x,y;

        int result = 0;

        for(int i=0;i<num;i++){
            x = scan.nextInt();
            y = scan.nextInt();
            for(int j=x;j<x+10;j++){
                for(int c=y;c<y+10;c++){
                    set[j][c] = 1;
                }
            }
        }

        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                //System.out.print(set[i][j] + " ");
                result += set[i][j];
            }
            //System.out.println();
        }

        System.out.println(result);

        scan.close();
    }
}