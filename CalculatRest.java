
package ostatak.novca;

/** This aplication calculate number of banknotes for rest
 *
 * @author Mirko
 */
public static class CalculateRest {
    
    int amount;
    
    public void calculateRest(int amount){
        int iznos = amount;   // amunth for change //
        int n1000, n500, n200, n100, n50, n20, n10, n5, n2, n1;
        
        // Calculate number of banknotes and coins//
        n1000 = iznos/1000; //number of banknotes value 1000 kn //
            iznos = iznos % 1000;
            n500 = iznos/500;
            iznos = iznos % 500;
            n200 = iznos/200;
            iznos = iznos % 200;
            n100 = iznos/100;
            iznos = iznos % 100;
            n50 = iznos/50;
            iznos = iznos % 50;
            n20 = iznos / 20;
            iznos = (iznos % 20);
            n10 = iznos / 10;
            iznos = iznos % 10;
            n5 = iznos / 5;
            iznos = iznos % 5;
            n2 = iznos / 2;
            iznos = iznos % 2;
            n1 = iznos / 1;
            iznos = iznos % 0;
                //print result on screen //
                    
        System.out.print("Minimum nuber of banknotes and coins are:  ");
                System.out.println("amount for refund : ");
                System.out.println(n1000 + " banknotes value of 1000 kn");
                System.out.println(n500 + " banknotes value of 500 kn");
                System.out.println(n200 + " banknotes value of 200 kn");
                System.out.println(n100 + " banknotes value of kn");
                System.out.println(n50 + " banknotes value of 50 kn");
                System.out.println(n20 + " banknotes value of 20 kn");
                System.out.println(n10 + " banknotes value of 10 kn");
                System.out.println(n5 + " coins value of 5 kn");
                System.out.println(n2 + " coins value of 2 kn");
                System.out.println(n1 + " coins value of 1 kn");
    }

    public CalculateRestRest(int amount) {
        this.amount = amount;
    }
    
}
