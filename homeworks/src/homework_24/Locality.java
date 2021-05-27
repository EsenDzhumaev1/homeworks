package homework_24;

public abstract class Locality {
    private String name;
    private static int id;
    private String head;

    public Locality(String head, String name) {
        this.head = head;
        this.name = name;
        id++;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public boolean isHead(String head) {
        return this.head.equals(head);
    }
}
