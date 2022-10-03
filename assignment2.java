public class App {
    public static void main(String[] args) throws Exception {

        for (int firstNameCount = 5; firstNameCount != 0; firstNameCount--) {
             if (firstNameCount == 4) {
                break;
                
            }
             System.out.println("Celine Margarette");
        }
        int surNameCount = 5; 
        
        do {
            System.out.println("Vergara");
            surNameCount--;
        } while (surNameCount != 0);
        
        int nickNameCount = 5;
        while (nickNameCount != 0) {
            
        nickNameCount--;
        if (nickNameCount == 3) {
               continue;
            }
             System.out.println("Meg");
        }
    }
}
