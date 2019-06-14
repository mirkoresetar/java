///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package ostatak.novca;
//
///**
// *
// * @author Mirko
// */import java.util.*;
//    
//public class OstatakNovca {
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String[] args) {
//        int iznos;   // iznos za usitnjavanje //
//        int n1000, n500, n200, n100, n50, n20, n10, n5, n2, n1; //broj novčanica  i kovanica //
//       
//            // ulaz novčanica se dobija preko tipkovnice //
//            Scanner tipkovnica = new Scanner(System.in);
//            
//            // učitavanje novčanog iznosa za usitnjavanje
//            System.out.print("Unesite iznos za usitnjavanje: ");
//            iznos = tipkovnica.nextInt();
//        // Izračunavanje brojeva novčanica usitnjenoog iznosa
//            n1000 = iznos/1000; //broj novčanica vrijednosti 1000
//            iznos = iznos % 1000;
//            n500 = iznos/500;
//            iznos = iznos % 500;
//            n200 = iznos/200;
//            iznos = iznos % 200;
//            n100 = iznos/100;
//            iznos = iznos % 100;
//            n50 = iznos/50;
//            iznos = iznos % 50;
//            n20 = iznos / 20;
//            iznos = (iznos % 20);
//            n10 = iznos / 10;
//            iznos = iznos % 10;
//            n5 = iznos / 5;
//            iznos = iznos % 5;
//            n2 = iznos / 2;
//            iznos = iznos % 2;
//            n1 = iznos / 1;
//            iznos = iznos +1;
//                //prikazivanje rezultata na ekranu //
//                    
//                System.out.print("Minimalan broj novčanica i kovanica za ");
//                System.out.println("dati iznos je: ");
//                System.out.println(n1000 + " novčanica vrijednosti 1000 kn");                    
//                System.out.println(n500 + " novčanica vrijednosti 500 kn");
//                System.out.println(n200 + " novčanica vrijednosti 200 kn");
//                System.out.println(n100 + " novčanica vrijednosti 100 kn");
//                System.out.println(n50 + " novčanica vrijednosti 50 kn");
//                System.out.println(n20 + " novčanica vrijednosti 20 kn");
//                System.out.println(n10 + " novčanica vrijednosti 10 kn");
//                System.out.println(n5 + " kovanica vrijednosti 5 kn");
//                System.out.println(n2 + " kovanica vrijednosti 2 kn");
//                System.out.println(n1 + " kovanica vrijednosti 1 kn");
//                
//    }
//    
//    public void calculateRest(int iznos){
//        
//    }
//}
//                
//                    
//            
//    
//    
