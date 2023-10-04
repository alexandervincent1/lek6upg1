import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner tangentbord = new Scanner(System.in)){
            System.out.println("Skrv in 2 tal");
            int tal1 = tangentbord.nextInt();
            int tal2 = tangentbord.nextInt();
            System.out.println(tal1==tal2);
            System.out.println(tal1<tal2);
            System.out.println(tal1>tal2);

            int[] talen = {4,5,2};
            System.out.print(talen[0]>talen[1]);
            System.out.println(talen[0]>talen[2]);
            System.out.print(talen[0]<talen[1]);
            System.out.println(talen[0]<talen[2]);
            System.out.print(talen[0]==talen[1]);
            System.out.println(talen[0]==talen[2]);

            System.out.println("Tänk på ett tal och skriv det");
            int tänktal = tangentbord.nextInt();
            int st = tänktal;
            tänktal+= 7;
            tänktal*=2;
            tänktal-=6;
            tänktal/=2;
            tänktal+=3;
            tänktal-=st;
            System.out.println(tänktal==7);
        }
        
    }
}
