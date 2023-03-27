import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma data válida (DD/MM/AAA) ou 'todas' para exibir todos os feriados");

        String date = scan.nextLine();

        Calendar calendar = new Calendar();

        if (date.equals("todos")) {
            System.out.println(calendar.getAllHolydays());
        }

        System.out.println(calendar.getHolyday(date));
    }
}
