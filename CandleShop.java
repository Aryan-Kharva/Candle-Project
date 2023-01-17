import java.util.Scanner;
import java.text.NumberFormat;

public class CandleShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //ask shopkeeper info for candle 1
        System.out.println("\nEnter Candle Name: ");
        String name1 = scan.next();
        System.out.println("Enter the Candle Type (1, 2, or 3): ");
        int type1 = scan.nextInt();
        System.out.println("Enter the Candle Price: ");
        double cost1 = scan.nextDouble();
        System.out.println("Enter the Candle Burn Time (in hours): ");
        int burnTime1 = scan.nextInt();

        System.out.print("\nThe cost for Candle 1 is ");
        double totalCost1 = cost1;
        //double to currency format (from Stack Overflow) Link: https://stackoverflow.com/questions/13791409/java-format-double-value-as-dollar-amount
        NumberFormat formatter1 = NumberFormat.getCurrencyInstance();
        System.out.print(formatter1.format(totalCost1));
        
        //display burn time for candle 1
        int totalBurnTime1 = burnTime1;
        System.out.println("\nThe burn time for Candle 1 is " + totalBurnTime1 + " hours\n");

        Candle typeOne = new Candle(name1, type1, cost1, burnTime1);

           
        //ask shopkeeper info for candle 2
        System.out.println("Enter Candle Name: ");
        String name2 = scan.next();
        System.out.println("Enter the Candle Type (1, 2 or 3): ");
        int type2 = scan.nextInt();
        System.out.println("Enter the Candle Price: ");
        double cost2 = scan.nextDouble();
        System.out.println("Enter the Candle Burn Time (in hours): ");
        int burnTime2 = scan.nextInt();

        System.out.print("\nThe cost for Candle 2 is ");
        double totalCost2 = cost2;
        NumberFormat formatter2 = NumberFormat.getCurrencyInstance();
        System.out.print(formatter2.format(totalCost2));

        //display burn time for candle 2
        int totalBurnTime2 = burnTime2;
        System.out.println("\nThe burn time for Candle 2 is " + totalBurnTime2 + " hours\n");

        Candle typeTwo = new Candle(name2, type2, cost2, burnTime2);


        //ask shopkeeper info for candle 3
        System.out.println("Enter Candle Name: ");
        String name3 = scan.next();
        System.out.println("Enter the Candle Type (1, 2, or 3): ");
        int type3 = scan.nextInt();
        System.out.println("Enter the Candle Price: ");
        double cost3 = scan.nextDouble();
        System.out.println("Enter the Candle Burn Time (in hours): ");
        int burnTime3 = scan.nextInt();

        System.out.print("\nThe cost for Candle 3 is ");
        double totalCost3 = cost3;
        NumberFormat formatter3 = NumberFormat.getCurrencyInstance();
        System.out.print(formatter3.format(totalCost3));


        //display burn time for candle 3
        int totalBurnTime3 = burnTime3;
        System.out.println("\nThe burn time for Candle 3 is " + totalBurnTime3 + " hours\n");

        Candle typeThree = new Candle(name3, type3, cost3, burnTime3);


System.out.println("                 🛒>>>Shop<<<🛒");
System.out.println("");


        


//---------------------------------------------------------------------------------------------------
//asking user how many of each candle they want

System.out.println("How many " + name1 + " candles would you like to purchase?");

while (!scan.hasNextInt()){
    scan.next();
}
int candleNum1 = scan.nextInt();


System.out.println("How many " + name2 + " candles would you like to purchase?");

while (!scan.hasNextInt()){
    scan.next();
}
int candleNum2 = scan.nextInt(); 

System.out.println("How many " + name3 + " candles would you like to purchase?");

while (!scan.hasNextInt()){
    scan.next();
}
int candleNum3 = scan.nextInt();

//---------------------------------------------------------------------------------------------------

//displaying total costs
System.out.print("\nThe cost for Candle 1s are: ");
NumberFormat formatterTotal1 = NumberFormat.getCurrencyInstance();
System.out.print(formatterTotal1.format(totalCost1 * candleNum1));

System.out.print("\nThe cost for Candle 2s are: ");
NumberFormat formatterTotal2 = NumberFormat.getCurrencyInstance();
System.out.print(formatterTotal2.format(totalCost2 * candleNum2));

System.out.print("\nThe cost for Candle 3s are: ");
NumberFormat formatterTotal3 = NumberFormat.getCurrencyInstance();
System.out.print(formatterTotal3.format(totalCost3 * candleNum3));

double totalCostOverall = ((totalCost1 * candleNum1) + (totalCost2 * candleNum2) + (totalCost3 * candleNum3));

System.out.print("\nThe total cost is ");
NumberFormat formatterTotalOverall = NumberFormat.getCurrencyInstance();
System.out.print(formatterTotalOverall.format(totalCostOverall));

//displaying total burn time
int totalBurnTime = ((burnTime1 * candleNum1) + (burnTime2 * candleNum2) + (burnTime3 * candleNum3));
System.out.println("\nThe total burn time of your chosen candles is " + totalBurnTime + " hours.");


if (totalCostOverall > 20 && totalCostOverall <= 35){
    double deduction = totalCostOverall * .05;
    double deductionCost = totalCostOverall - deduction;

    System.out.print("\nThe total cost after a 5% discount is ");
    NumberFormat formatterDeduction1 = NumberFormat.getCurrencyInstance();
    System.out.print(formatterDeduction1.format(deductionCost));
    System.out.println(" ");

    int burnTimePerMinute = totalBurnTime * 60;
    double costPerMinute = deductionCost / burnTimePerMinute;
    System.out.print("The total cost per minute for your purchase is ");
    NumberFormat costMinute = NumberFormat.getCurrencyInstance();
    System.out.print(costMinute.format(costPerMinute));
    System.out.println(" ");

    
} else if (totalCostOverall > 35 && totalCostOverall <=55){
    double deduction = totalCostOverall * .07;
    double deductionCost = totalCostOverall - deduction;

    System.out.print("\nThe total cost after a 7% discount is ");
    NumberFormat formatterDeduction1 = NumberFormat.getCurrencyInstance();
    System.out.print(formatterDeduction1.format(deductionCost));
    System.out.println(" ");

    int burnTimePerMinute = totalBurnTime * 60;
    double costPerMinute = deductionCost / burnTimePerMinute;
    System.out.print("The total cost per minute for your purchase is ");
    NumberFormat costMinute = NumberFormat.getCurrencyInstance();
    System.out.print(costMinute.format(costPerMinute));
    System.out.println(" ");

} else if (totalCostOverall > 55 && totalCostOverall <=100){
    double deduction = totalCostOverall * .1;
    double deductionCost = totalCostOverall - deduction;

    System.out.print("\nThe total cost after a 10% discount is ");
    NumberFormat formatterDeduction1 = NumberFormat.getCurrencyInstance();
    System.out.print(formatterDeduction1.format(deductionCost));
    System.out.println(" ");

    int burnTimePerMinute = totalBurnTime * 60;
    double costPerMinute = deductionCost / burnTimePerMinute;
    System.out.print("The total cost per minute for your purchase is ");
    NumberFormat costMinute = NumberFormat.getCurrencyInstance();
    System.out.print(costMinute.format(costPerMinute));
    System.out.println(" ");

} else if (totalCostOverall > 100){
    double deduction = totalCostOverall * .2;
    double deductionCost = totalCostOverall - deduction;

    System.out.print("\nThe total cost after a 20% discount is ");
    NumberFormat formatterDeduction1 = NumberFormat.getCurrencyInstance();
    System.out.print(formatterDeduction1.format(deductionCost));
    System.out.println(" ");

    int burnTimePerMinute = totalBurnTime * 60;
    double costPerMinute = deductionCost / burnTimePerMinute;
    System.out.print("The total cost per minute for your purchase is ");
    NumberFormat costMinute = NumberFormat.getCurrencyInstance();
    System.out.print(costMinute.format(costPerMinute));
    System.out.println(" ");

} else {
    System.out.println("\nThank you for shopping with us! Come back soon!");
}
System.out.println(" ");
System.out.print(candleNum1 + " type " + type1 + " (" + name1 + ") candles: \n");
for (int i = 0; i < candleNum1; i++){
    System.out.print("🕯️");
}
System.out.println(" ");
System.out.print(candleNum1 + " type " + type2 + " (" + name2 + ") candles: \n");
for (int x = 0; x < candleNum2; x++){
    System.out.print("🕯️");
}
System.out.println(" ");
System.out.print(candleNum1 + " type " + type3 + " (" + name3 + ") candles: \n");
for (int y = 0; y < candleNum3; y++)
    System.out.print("🕯️");

    System.out.println(" ");


    }
 }

