package behavioralpattern;

/**
 * @author : Cory Jia on 11/30/19
 */
public class Test {
    public static void main(String[] args) {
        String s1 = new StringBuilder("1").append("23").toString();
        System.out.println(s1.intern().hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s1.intern() == s1);

        String s2 = new StringBuilder("1").append("2").toString();
        System.out.println(s2.hashCode());
        System.out.println(s2.intern().hashCode());
        System.out.println(s2.intern() == s2);
    }

}
