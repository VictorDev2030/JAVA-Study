public class Metodos {
    public static void test(){
        System.out.println("Test");
    }

    public static void main(String[] args) {
        test();
        coordinates(10, 20, 30);

    }

    public static int coordinates(int x, int y, int z){
        System.out.println("The sum of "+x+" + "+y+" = " + (x+y));
        return x+y;
    }
}
