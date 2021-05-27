package homework_24;

public class Main {
    public static void main(String[] args) {
        District district1 = new District("head1", "local1");
        District district2 = new District("head2", "local2");
        District district3 = new District("head3", "local3");
        District district4 = new District("head4", "local4");
        District district5 = new District("head5", "local5");

        City city1 = new City(new District[]{district1, district2});
        City city2 = new City(new District[]{district3});
        City city3 = new City(new District[]{district4, district5});

        Village village1 = new Village("head6", "local6");
        Village village2 = new Village("head7", "local7");

        city1.searchLocality("head2");
    }
}
