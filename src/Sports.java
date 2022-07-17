public class Sports {
    public Sports() {}

    String name;
    double years;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYears() {
        return years;
    }

    public void setYears(double years) {
        this.years = years;
    }

    public Sports (String name, double years){
        this.name = name;
        this.years = years;
    }

    // Sports Class:
      /*  Sports ufc = new Sports();
        ufc.setName("In Vegas ");
        ufc.setYears(30);
        System.out.print(ufc.getName());
        System.out.println(ufc.getYears());


        Sports football = new Sports("Champions League  ", 100);
        System.out.print(football.getName());
        System.out.println(football.getYears()); */


}
