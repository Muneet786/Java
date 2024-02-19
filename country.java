// import java.util.Scanner;

// class Country {
//     private String name;
//     private double area;
//     private long population;
//     private double economicGrowth;

//     // Constructor
//     public Country(String name, double area, long population, double economicGrowth) {
//         this.name = name;
//         this.area = area;
//         this.population = population;
//         this.economicGrowth = economicGrowth;
//     }

//     // Method to print country details
//     public void printDetails() {
//         System.out.println("Country: " + name);
//         System.out.println("Area: " + area + " square kilometers");
//         System.out.println("Population: " + population);
//         System.out.println("Economic Growth: " + economicGrowth + "%");
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         // Creating objects for India, China, and Sri Lanka
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter details for India:");
//         System.out.print("Area (in square kilometers): ");
//         double indiaArea = scanner.nextDouble();
//         System.out.print("Population: ");
//         long indiaPopulation = scanner.nextLong();
//         System.out.print("Economic Growth (%): ");
//         double indiaEconomicGrowth = scanner.nextDouble();
//         Country india = new Country("India", indiaArea, indiaPopulation, indiaEconomicGrowth);

//         System.out.println("Enter details for China:");
//         System.out.print("Area (in square kilometers): ");
//         double chinaArea = scanner.nextDouble();
//         System.out.print("Population: ");
//         long chinaPopulation = scanner.nextLong();
//         System.out.print("Economic Growth (%): ");
//         double chinaEconomicGrowth = scanner.nextDouble();
//         Country china = new Country("China", chinaArea, chinaPopulation, chinaEconomicGrowth);

//         System.out.println("Enter details for Sri Lanka:");
//         System.out.print("Area (in square kilometers): ");
//         double sriLankaArea = scanner.nextDouble();
//         System.out.print("Population: ");
//         long sriLankaPopulation = scanner.nextLong();
//         System.out.print("Economic Growth (%): ");
//         double sriLankaEconomicGrowth = scanner.nextDouble();
//         Country sriLanka = new Country("Sri Lanka", sriLankaArea, sriLankaPopulation, sriLankaEconomicGrowth);

//         System.out.println("Details of all countries:");
//         india.printDetails();
//         china.printDetails();
//         sriLanka.printDetails();

//         scanner.close();
//     }
// }
