package scannerexample;

import java.util.Scanner;

public class ScannerClassExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//in this class there is separate scanner class we use & parameter System.in required.
        System.out.println("please enter your no");
        int no = scanner.nextInt();
        for(int i=1;i<=no;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

    }
}
