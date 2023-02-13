package week03;

public class CarMenu {
    Car[] cars = new Car[20];
    int count = 0;

    private KeyboardReader kbr;

    public CarMenu() {
        kbr = new KeyboardReader();
    }

    public void RunMenu() {
        String display = "1. Enter details for car" + "\n2. Display all car details" + "\n3. Exit";

        boolean exit = false;

        while (!exit) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println(display);

            int choice = kbr.getInt("Select a menu option");
            switch (choice) {
                case 1 -> enterCarDetails();
                case 2 -> displayCars();
                case 3 -> exit = true;
            }
        }
        System.exit(0);
    }

    private void enterCarDetails() {
        int maxCars = 20;
        if (count >= maxCars) {
            System.out.println("Sorry, you have reached the maximum number of cars");
            kbr.getString("Press enter to continue");
            RunMenu();
            return;
        }
        String name = kbr.getString("Please enter the name of your car");
        String colour = kbr.getString("Please enter the colour of your car");
        int speed = kbr.getInt("Please enter the speed of your car");
        cars[count] = new Car(name);
        cars[count].addCarDetails(colour, speed);
        count++;
        RunMenu();
    }

    private void displayCars() {
        if (null == cars[0]) System.out.println("Car : NOT YET DEFINED!");
        else {
            for (int i = 0; i < cars.length; i++) {
                if (null != cars[i]) System.out.println((i + 1) + "." + cars[i].showCarDetails());
            }
        }
        kbr.getString("Press enter to continue");
    }
}
