public class libary {
    int a = 20;
    void books() {
        System.out.println(a);
    }
    }
    class comics extends libary{
        int b = 30;
        void notes() {
            System.out.println(b);
        }
    }
    class romanbook extends comics{
        int c = 40;
        void nbook() {
            System.out.println(c);
        }
    }
    class lowbook{
        public static void main(String[] args) {
        romanbook sc = new romanbook();
        sc.books();
        sc.notes();
        sc.nbook();
    
        }
    
    }
