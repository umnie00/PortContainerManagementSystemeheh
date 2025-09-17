import java.util.ArrayDeque;

public class PortManager {
    private ArrayDeque<Continer> containerStack = new ArrayDeque<>();
    private ArrayDeque<Ship> shipQueue = new ArrayDeque<>();

    // Store a container
public void storeContainer(Continer cont) {
    containerStack.push(cont);
    System.out.println("Stored: " + cont);
}

    // View all containers
public void viewPortContainers() {
    if (containerStack.isEmpty()) {
        System.out.println("No containers at port.");
        return;
    }
    System.out.println("TOP →");
    for (Continer cont : containerStack) {
        System.out.println(cont);
    }
    System.out.println("← BOTTOM");
}

    // Register a ship
public void registerShip(Ship shi) {
    shipQueue.offer(shi);
    System.out.println("Registered: " + shi);
}

// View waiting ships
public void viewWaitingShips() {
    if (shipQueue.isEmpty()) {
        System.out.println("No ships waiting.");
        return;
    }
    System.out.println("FRONT →");
    for (Ship s : shipQueue) {
        System.out.println(s);
    }
    System.out.println("← REAR");
}

// Load next ship
public void loadNextShip() {
    if (containerStack.isEmpty()) {
        System.out.println("No containers to load.");
        return;
    }
    if (shipQueue.isEmpty()) {
        System.out.println("No ships waiting.");
        return;
    }

    Continer c = containerStack.pop();
    Ship s = shipQueue.poll();
    System.out.println("Loaded: " + c + " → " + s);
    System.out.println("Remaining containers: " + containerStack.size());
    System.out.println("Remaining ships waiting: " + shipQueue.size());
    }
}
