import java.util.Scanner;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> nums = new LinkedList<Integer>();

        while (nums.size() < 5) {
            System.out.print("Entrez un entier (" + (nums.size() + 1) + "/5) : ");
            // vérifie si la prochaine entrée est bien un entier
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                nums.add(num);
            }
            else {
                System.out.println("Entrée invalide, veuillez entrer un entier");
                sc.next();
            }
        }

        // iterator permet de parcourir la liste élément par élément
        Iterator<Integer> it = nums.iterator();
        int sum = 0;
        while (it.hasNext()) {
            sum += it.next();
        }

        System.out.println("Somme = " + sum);
    }
}
