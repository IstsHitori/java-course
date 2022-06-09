package proyectos;

public class Date {
    private String day;
    private String month;
    private String year;

    public Date(){

    }

    public Date(String day, String month, String year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String toSrting(){
        return "Dia : " + this.day + "Mes: " + this.month + "Año: " + this.year;
    }
}
