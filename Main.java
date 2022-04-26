import java.util.Scanner;
class Main {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 1;
        int f = 1;
        while (n>=m){
            f = f * m;
            m++;
        }
        System.out.println(f);
  }
}