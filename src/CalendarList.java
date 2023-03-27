import java.util.ArrayList;
import java.util.List;

public class CalendarList {

    List<Holyday> holydays = new ArrayList<>();

    public CalendarList() {
        holydays.add(new Holyday("01/01/2023", "Confraternização mundial"));
        holydays.add(new Holyday("21/02/2023", "Carnaval"));
        holydays.add(new Holyday("17/04/2023", "Páscoa"));
        holydays.add(new Holyday("21/04/2023", "Tiradentes"));
        holydays.add(new Holyday("01/05/2023", "Dia do trabalho"));
        holydays.add(new Holyday("08/06/2023", "Corpus Cristi"));
        holydays.add(new Holyday("07/09/2023", "Independência do Brasil"));
        holydays.add(new Holyday("12/10/2023", "Nossa Senhora Aparecida"));
        holydays.add(new Holyday("02/11/2023", "Finados"));
        holydays.add(new Holyday("15/11/2023", "Proclamação da República"));
        holydays.add(new Holyday("25/12/2023", "Natal"));
    };

    public String getHolyday(String date) {

        for (int i = 0; i < holydays.size(); i++) {
            if (date.equals(holydays.get(i).getDate())) {
                return "A data " + date + "é feriado de " + holydays.get(i).getDescription() + ".";
            }
        }

        return "A data " + date + " não é feriado.";
    }

    public List<Holyday> getAllHolydays() {
        return holydays;
    }
}
