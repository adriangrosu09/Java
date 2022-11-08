public class Main {
    //structura din spatele unei sortari TIP: foloseste debug
    public static void sortare(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int min = i;
            for (int j = i; j < num.length; j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
            }

            int tmp;
            tmp = num[i];
            num[i] = num[min];
            num[min] = tmp;
        }
    }

    public static void main(String[] args) {
        int []numere = new int[10];
        for (int i = 0; i < numere.length; i++) {
            numere[i] = (int) (Math.random() * 100);

        }
        System.out.println("Afisare elemete vector inainte de a fi sortate");
        for (int i = 1; i < numere.length; i++) {
            System.out.println(numere[i]);
        }
        System.out.println("Numere dupa sortare");
        sortare(numere);
        for (int i = 0; i < numere.length; i++) {
            System.out.println(numere[i]);
        }

    }

}