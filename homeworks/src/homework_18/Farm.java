package homework_18;

public class Farm {
    String address;
    Cow[] cows;
    Sheep[] sheeps;
    Horse[] horses;
    String fullNameOfOwner;
    public Farm(){
        this.address = "some address";
        this.cows = new Cow[0];
        this.sheeps = new Sheep[0];
        this.horses = new Horse[0];
        this.fullNameOfOwner = "owner's name";
    }
    public Farm(String address, Cow[] cows, Sheep[] sheeps, Horse[] horses, String fullNameOfOwner) {
        this.address = address;
        this.cows = cows;
        this.sheeps = sheeps;
        this.horses = horses;
        this.fullNameOfOwner = fullNameOfOwner;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Sheep[] getSheeps() {
        return sheeps;
    }

    public void setSheeps(Sheep[] sheeps) {
        this.sheeps = sheeps;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public String getFullNameOfOwner() {
        return fullNameOfOwner;
    }

    public void setFullNameOfOwner(String fullNameOfOwner) {
        this.fullNameOfOwner = fullNameOfOwner;
    }

    @Override
    public String toString() {
        return String.format("address: %s\n" +
                "cows count: %s\n" +
                "sheeps count: %s\n" +
                "horses count: %s\n" +
                "owner: %s",
                this.address, this.cows.length, this.sheeps.length,this.horses.length, this.fullNameOfOwner);
    }
}
