import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        String [][] set = new String[5][15];

        String input = "";

        for(int i=0;i<5;i++){
            input = scan.nextLine();
            for(int j=0;j<input.length();j++){
                set[i][j] = input.charAt(j) + "";
            }
        }

        for(int j=0;j<15;j++){
            for(int i=0;i<5;i++){
                if(set[i][j] != null){
                    System.out.print(set[i][j]);
                }
            }
        }

        scan.close();
    }
}