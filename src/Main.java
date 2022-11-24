public class Main {
public static void main(String[] args){
    Flight E750 = new Flight("15:00", "20:00", "Novosibirsk to Moscow. GATE-3");
    String infoE750 = E750.getFlightInfo();
    System.out.println(infoE750);
    }

}

class Flight {
    String departure;
    String arrival;
    String infoFlight;

    public Flight(String departure, String arrival, String infoFlight) {
        this.departure = departure;
        this.arrival = arrival;
        this.infoFlight = infoFlight;
    }
    public String getFlightInfo(){
        return this.departure + " " + this.arrival + " " + this.infoFlight;
    }
}