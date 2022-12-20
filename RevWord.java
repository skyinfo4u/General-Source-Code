import java.util.Scanner;

public class RevWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Etner a String : ");
        String str= sc.nextLine();
        
        String [] arrofstr= str.split(" ");
        int len=arrofstr.length;
        String str1="";
        for(int i=len-1;i>=0;i--)
        {
            str1=str1+arrofstr[i]+" ";

        }
        System.out.println(str1);
        sc.close();
    }
}
