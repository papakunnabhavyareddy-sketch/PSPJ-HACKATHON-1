
 import java.util.Scanner;

class WasteCollection {

    static double calculateTotalWaste(double pointWaste1, double pointWaste2) {
        return pointWaste1 + pointWaste2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter waste collected in point 1:");
        double point1Waste = sc.nextDouble();

        System.out.println("Enter waste collected in point 2:");
        double point2Waste = sc.nextDouble();

        double totalWaste = calculateTotalWaste(point1Waste, point2Waste);

        System.out.println("Total waste collected: " + totalWaste + " kg");

    
    }
}