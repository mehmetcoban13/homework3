import java.util.Scanner;

public class DeviceApp {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int input;
        Device device;

        while (true) {
            System.out.println("Please Choose a Device (1.Computer & 2.Playstation & 3.Xbox): ");
            input = scanner.nextInt();
            if (input == 1) {
                device = new Computer();
                break;
            } else if (input == 2) {
                device = new Playstation();
                break;
            } else if (input == 3) {
                device = new Xbox();
                break;
            } else {
                System.out.println("Please enter a valid number to choose a device!");
            }
        }

        while (true) {
            System.out.println("Please Choose The Status of Device (1.Open & 2.Closed): ");
            input = scanner.nextInt();
            if (input == 1) {
                try {
                    device.openDevice();
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else if (input == 2) {
                try {
                    device.shutdownDevice();
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            } else {
                System.out.println("Please enter a valid number to choose a status!");
            }
        }

        while(true){
            System.out.println("Please Choose a Controller to Add to " + device.getName() + " (1.Playstation & 2.Xbox): ");
            input = scanner.nextInt();
            if(input == 1){
                try {
                    device.addController(new PlaystationController());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if(input == 2){
                try {
                    device.addController(new XboxController());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else{
                System.out.println("Please enter a valid number to add a controller!");
            }
        }

        device.playGame();

        scanner.close();
    }
}
