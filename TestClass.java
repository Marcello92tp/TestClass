public class TestClass {
    public static void main(String[] args) {
        int a = 15;

        a += 5;
        a -= 4;

        int b = a;
        b++;

        boolean caso1 = b % 2 != 0;
        boolean caso2 = (b * (b + 1)) % 3 == 0;

        if (caso1 && caso2) {
            System.out.println("Entrambe le affermazioni sono vere.");
        } else {
            System.out.println("Almeno una delle affermazioni è falsa.");
        }
    }
}

