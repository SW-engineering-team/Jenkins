package scanner;

public class main {

    public static String gugudan(int dan) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 9; i++) {
            sb.append(dan)
              .append(" x ")
              .append(i)
              .append(" = ")
              .append(dan * i)
              .append("\n");
        }

        return sb.toString();
    }
}