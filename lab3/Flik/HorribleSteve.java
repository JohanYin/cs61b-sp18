public class HorribleSteve {
    public static void main(String[] args) {
        int i = 0;
        for (int j = 0; i < 500; ++i, ++j) {
            if (!Flik.isSameNumber(i, j)) {
                System.out.println("mismatch:" + i + " " + j);
            }
        }
    }
}
