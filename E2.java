public class E2 {
    public static void main(String[] args) {
        String str=new String("Mississippi");
        str=str.replaceAll("1","11");
        System.out.println(str);
        System.out.println("len ="+str.length());
        str=str.replaceAll("55","5");
        System.out.println(str);
        System.out.println("len ="+str.length());
    }
}
