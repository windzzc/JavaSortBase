package SortArray;

public class TestLife {
    public static void main(String[] args) {
        boolean alive =true;
        while (alive){
            eat();
            sleep();
            code();
            basketball();
        }
    }
    private static void eat(){
        System.out.println("吃饭");
    }
    private static void sleep(){
        System.out.println("睡觉");
    }
    private static void code(){
        System.out.println("编码");
    }
    private static void basketball(){
        System.out.println("篮球");
    }
}
