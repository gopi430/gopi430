public class lcm {
    public static void main(String[] args) {
    
            int a = 15;
            int b = 25;
            int hcf = 0;
    
            for (int i = 1; i <= a && i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                  hcf = i;
                }
            }
            int lcm = (a * b) / hcf;
            System.out.println("The LCM of two numbers:" + lcm);
    
        }
    
    }
