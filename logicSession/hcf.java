public class hcf {
public static void main(String[] args) {
    
            int a = 5;
            int b = 6;
            int hcf = 0;
    
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    hcf = i;
                }
            }
            System.out.println("The HCF of Two numbers: " + hcf);
    
        }
    
    }
