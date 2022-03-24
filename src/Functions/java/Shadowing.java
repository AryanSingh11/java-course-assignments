package Functions.java;

public class Shadowing {
    static  int x=23;


    public static void main(String[] args) {
        System.out.println(x);
        int x=89;
        System.out.println(x);
        fjfj();
    }

    public static void ghj(){
        System.out.println(x);
    }

    private static void fjfj(){
        x=67;
        System.out.println(x);
    }


}
