public class helloworls{
    public static void main(String[] args){
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
        System.out.println("Hello World!");
    }
}