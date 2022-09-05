import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.0;
        double armutk,elmak,domatesk,muzk,patlicank,total=0.0;
        System.out.println("Armut kaç kilo ? ");
        armutk= scanner.nextDouble();
        System.out.println("Elma kaç kilo ? ");
        elmak= scanner.nextDouble();
        System.out.println("domates kaç kilo ? ");
        domatesk= scanner.nextDouble();
        System.out.println("muz kaç kilo ? ");
        muzk= scanner.nextDouble();
        System.out.println("patlıcan kaç kilo ? ");
        patlicank= scanner.nextDouble();

        total=armutk*armut+elmak*elma+domatesk*domates+muzk*muz+patlicank*patlican;
        System.out.println("toplam tutar: "+total);
    }
}
