package pl.camp.it.enumy;

public class App {
    public static void main(String[] args) {
        Client client = new Client();
        client.sex = Sex.MEN;
        client.sex = Sex.WOMEN;

        Console c = Console.PLAY_STATION_3;

        c.setBrand("sadffasdfasdf");

        Console c2 = Console.PLAY_STATION_3;
        System.out.println(c2.getBrand());
    }
}
