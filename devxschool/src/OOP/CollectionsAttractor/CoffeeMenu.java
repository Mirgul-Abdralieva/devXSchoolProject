package OOP.CollectionsAttractor;

public class CoffeeMenu {


    private static CupSize[] coffeeCupSizes;

    public static void main(String[] args) {
        String [] coffeeNames = {"Espresso", "Latte", "Americano"};
        double [] coffeePrices = {5.3, 4, 7.7};

        print(coffeeNames, coffeePrices, coffeeCupSizes);
    }
    static void print(String [] names, double [] prices,CupSize[]sizes){
        for (int i =0; i < names.length; ++i){
            printLine(names[i], prices[i], sizes[i]);
        }
        }
        static void printLine(String name, double price, CupSize size){
        String fmt = "| %-20s -> %-3s$  [%s] |";
        String line = String.format(fmt, name, price,size);
            System.out.println(line);
        }
        enum CupSize { S, M, L}
 //       CupSize[] coffeeCupSizes = {CupSize.S, CupSize.L, CupSize.M};

}

