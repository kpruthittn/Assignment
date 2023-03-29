interface First{
    boolean greatest(int n1,int n2);
}
interface Second{
    int increment(int n);
}
interface Third {
    String concat(String s1, String s2);
}
interface Fourth{
    String convertToString(String s3);
}
public class Question1 {
    public static void main(String[] args) {
        First fi = (n1,n2) -> {return n1>n2;};
        System.out.println("Output 1: "+fi.greatest(5,2));
        Second s = (n) -> {return ++n;};
        System.out.println("Output 2: "+s.increment(10));
        Third t = (s1,s2) -> {return s1+s2;};
        System.out.println("Output 3: " + t.concat("Pranshu ","Saluja"));
        Fourth fo = (s3) -> {return s3.toUpperCase();};
        System.out.println("Output 4: "+fo.convertToString("pRansHu"));
    }
}
