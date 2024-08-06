import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        int[][] set = new int[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                set[i][j] = scan.nextInt();
            }
        }

        int max = set[0][0];
        int maxX = 0;
        int maxY = 0;

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(max < set[i][j]){
                    max = set[i][j];
                    maxX = i;
                    maxY = j;
                }
            }
        }

        System.out.println(max);
        System.out.println((maxX+1) + " " + (maxY+1));

        scan.close();
    }
}