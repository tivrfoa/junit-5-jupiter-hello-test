package lsc.tests;

public class Hello {

    public static void main(String[] args) {
        System.out.println(new Hello().getHello());
    }

    public String getHello() {
        System.out.println("Hi github action");
        return "Hello =)";
    }
}
