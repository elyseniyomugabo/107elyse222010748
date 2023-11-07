public class beverage {  
    public static void main(String[] args) {  
        String beverage = "Coffee";  

        switch(beverage) {  
            case "Coffee": 
                System.out.println("You've chosen food!");  
                break;
            case "Juice": 
                System.out.println("You've chosen a fruity drink!");  
                break;
            case "Water": 
                System.out.println("You've chosen a hydrating drink!");  
                break;
            case "Soda": 
                System.out.println("You've chosen a carbonated drink!");  
                break;
            default:
                System.out.println("Unknown beverage!");  
        }  
    }  
}