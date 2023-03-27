public class Calendar {

    Holyday[] holydays = {
            new Holyday("01/01/2023", "Confraternização mundial"),
            new Holyday("21/02/2023", "Carnaval"),
            new Holyday("17/04/2023", "Páscoa"),
            new Holyday("21/04/2023", "Tiradentes"),
            new Holyday("01/05/2023", "Dia do trabalho"),
            new Holyday("08/06/2023", "Corpus Cristi"),
            new Holyday("07/09/2023", "Independência do Brasil"),
            new Holyday("12/10/2023", "Nossa Senhora Aparecida"),
            new Holyday("02/11/2023", "Finados"),
            new Holyday("15/11/2023", "Proclamação da República"),
            new Holyday("25/12/2023", "Natal"),
    };

    public String getHolyday(String date) {

        for (int i = 0; i < holydays.length; i++) {
            if (date.equals(holydays[i].getDate())) {
                return "A data " + date + "é feriado de " + holydays[i].getDescription() + ".";
            }
        }

        return "A data " + date + " não é feriado.";
    }

    public Holyday[] getAllHolydays() {
        return holydays;
    }
}
