package Question4;

public class Main {
    public static void main(String[] args){
        try{
            throw new NewException("Custom Exception Created");
        } catch (NewException e){
            System.out.println(e.getMessage());
        }
    }
}
