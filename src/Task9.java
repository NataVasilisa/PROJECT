public class Task9 {
    public static boolean nine(int a) {
        boolean b = !(!(a % 4 == 0) || ((a % 100 == 0) && !(a % 400 == 0)));
        return b;
    }
}
