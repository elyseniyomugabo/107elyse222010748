public class agegroupe {  
    public static void main(String[] args) {  
        int age = 25;  
          
        if(age <= 12){  
            System.out.println("Child");  
        }  
        else if(age > 12 && age <= 19){  
            System.out.println("Teenager");  
        }  
        else if(age > 19 && age <= 30){  
            System.out.println("Young Adult");  
        }  
        else if(age > 30 && age <= 50){  
            System.out.println("Adult");  
        }  
        else if(age > 50 && age <= 65){  
            System.out.println("Senior Adult");  
        }
        else if(age > 65){  
            System.out.println("Elderly");  
        }
        else {  
            System.out.println("Invalid age!");  
        }  
    }  
}
