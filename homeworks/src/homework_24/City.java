package homework_24;

public class City{
    private final District[] districts;

    public City(District[] districts) {
        this.districts = districts;
    }

    public void searchLocality(String head) {
        for (Locality district : districts) {
            if (district.isHead(head))
                System.out.printf("Руководитель населённого пункта: %s", district.getName());
        }
    }
}
