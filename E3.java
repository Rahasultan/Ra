public class E3 {
    public static void main(String[] args) {
        String str=new String("Mississippi");
        str=str.replace('1','!');
        str=str.replace('5','$');
        System.out.println("result ="+str);
        System.out.println("expectad result = M!$$!$$!PP ");
    }
}
