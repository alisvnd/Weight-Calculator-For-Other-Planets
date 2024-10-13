import java.util.Scanner ;

public class Lab02_Q2 {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in) ;

        final double Mars = 0.38 ;
        final double Jupiter = 2.34 ;
        final double Uranus = 0.92 ;
        final double Neptune = 1.19 ;
        
        System.out.print("Enter weight of first earthling(kg): ");
        double W1 = in.nextDouble() ;

        System.out.print("Enter weight of second earthling(kg): ");
        double W2 = in.nextDouble() ;

        System.out.printf("%47s %13s %15s %15s" , "Mars" , "Jupiter" , "Uranus" , "Neptune");

    
        System.out.printf("%n %7s Earthling One  (%.1f kg)    %10.1f    %10.1f      %10.1f      %10.1f    " , "" , W1 , W1*Mars , W1*Jupiter , W1*Uranus , W1*Neptune) ;


        System.out.printf("%n %7s Earthling Two (%.1f kg)    %10.1f    %10.1f      %10.1f      %10.1f    " , "" , W2 , W2*Mars , W2*Jupiter , W2*Uranus , W2*Neptune) ;




    }
    
    
}
