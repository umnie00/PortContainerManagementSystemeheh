import java.util.Scanner;

public class PortContainerManagementSystem {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    PortManager tigManageNi = new PortManager();
    int choice;

    do {
        System.out.println("\n=== Port Container Management System ===");
System.out.println("[1] Store container (push)\n[2] View port containers\n[3] Register arriving ship (enqueue)\n[4] View waiting ships\n[5] Load next ship\n[0] Exit\nChoose: ");

choice = sc.nextInt();
sc.nextLine(); 

switch (choice) {
    case 1:
        System.out.print("Enter Container ID: ");
        String id = sc.nextLine();
        System.out.print("Enter Description: ");
        String desc = sc.nextLine();
        System.out.print("Enter Weight: ");
        double weight = sc.nextDouble();
        sc.nextLine();
        tigManageNi.storeContainer(new Continer(id, desc, weight));
        break;

    case 2:
        tigManageNi.viewPortContainers();
        break;

    case 3:
        System.out.print("Enter Ship Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Captain Name: ");
        String captain = sc.nextLine();
        tigManageNi.registerShip(new Ship(name, captain));
        break;

    case 4:
        tigManageNi.viewWaitingShips();
        break;

    case 5:
        tigManageNi.loadNextShip();
        break;

    case 0:
        System.out.println("Exiting system...");
        break;

    default:
        System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
