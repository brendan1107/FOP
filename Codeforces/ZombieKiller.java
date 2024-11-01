package Codeforces;
import java.util.Random;
import java.util.Scanner;

public class ZombieKiller {
    public static void main(String[] args) {
        System.out.println("\nWelcome to our zombie killing program");
        String backpack[] = { "Shotgun for 0", "Assault Rifle for 1", "Sniper for 2" };
        String zombies[] = { "close-ranged zombie (Weakness: Shotgun)", "Mid-ranged zombie (Weakness: Assault Rifle)",
                "Long-ranged zombie (Weakness: Sniper)" };
        System.out.println("These are the weapons in your backpack, make use of them to fight zombies!");
        System.out.println(backpack[0] + "\n" + backpack[1] + "\n" + backpack[2]);
        System.out.println("\nThese are the zombies, FIGHT THEM!!!");
        System.out.println(zombies[0] + "\n" + zombies[1] + "\n" + zombies[2]);
        Random random = new Random();
        int zombiesNum;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            zombiesNum = random.nextInt(3);
            System.out.println(zombies[zombiesNum] + "is approaching! Choose your weapon!");
            int WeaponNum = scanner.nextInt();
            if (WeaponNum == zombiesNum) {
                System.out.println("You killed " + zombies[zombiesNum] + " using " + backpack[WeaponNum]);
            } else {
                System.out.println("You died, Game Over");
                scanner.close();
                return;
            }
        }
        System.out.println("You survived zombie apocalypse!, You won");
        scanner.close();

    }
}