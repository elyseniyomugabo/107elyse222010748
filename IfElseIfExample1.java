public class IfElseIfExample1 {  
    public static void main(String[] args) {  
        int marks=65;  
          
        if(marks<50){  
            
            System.out.println("fourth class");  
        }  
        else if(marks>=70 && marks<80){  
            System.out.println("third class");  
        }  
        else if(marks>=80 && marks<90){  
            System.out.println("second class");  
        }else if(marks>=90 && marks<100){  
            System.out.println("first class");  
        }else{  
            System.out.println("invalid marks");  
        }  
    }  
    }
}  