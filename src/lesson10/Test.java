package lesson10;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            try {
                if (i == 1) {
                    throw new RuntimeException("Оконачние всего");
                }
            } catch (Exception e) {}
        }
    }
}
