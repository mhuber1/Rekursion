package at.ac.htlsteyr.mhuber1;

public class Main {

    public static void main(String[] args) {

        Rekursion a = (Rekursion) new Rekursion();
        String s = (String) new String();

        s="OTa";


        System.out.println(a.Fibonacci(5));

        if(a.Palindrom(s)){
            System.out.println(s + " ist ein Palindrom");
        } else {
            System.out.println(s + " ist kein Palindrom");
        }

    }
}

class Rekursion{
    public int Fibonacci(int i){            // funktioniert noch nicht
        if (i == 1 || i == 2){
            return 1;
        }

        return Fibonacci(i-2)+Fibonacci(i-1);
    }

    public boolean Palindrom(String s){     //funktioniert
        boolean r;


        if (s.length() <= 1){
            return true;
        }

        if(s.charAt(s.length()-1)==s.charAt(0)){
            return Palindrom(s.substring(1,s.length()-1));
        } else {
            return false;
        }

    }

    public int AmalBrek(int a, int b){

        if (b){
            return  a + AmalBrek(a,b-1);
        } else {
            
        }


    }

    public int AmalBit(int a, int b){
        int r = 0;

        for (int i = 0; i < b; i++) {
            r+=a;
        }
        return r;
    }

}
