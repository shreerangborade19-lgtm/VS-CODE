public class Implicit{

    public static void main(String[] args) {
        int num = 250;
        long l = num; 
        float f = num; 
        double d = num; 
        System.out.println("Original int: " + num);
        System.out.println("As long: " + l);
        System.out.println("As float: " + f);
        System.out.println("As double: " + d);
}
}