package homework_16.Task_A;

public class Fish {
    int quantity; //Кол-во рыбок, т.к. в задании написано "Рыбки"
    String species; //Вид
    boolean isFreshwater; //Пресноводная или нет
    void setQuantity(int quantity){
        this.quantity = quantity;
    }
    void setSpecies(String species){
        this.species = species;
    }
    void setFreshwater(boolean isFreshwater){
        this.isFreshwater = isFreshwater;
    }
    String getInfo(){
        if (quantity <= 0) return "Error";
        else return String.format("Кол-во рыбок: %s\nВид: %s\nПресноводные: %s",
                    quantity, species, isFreshwater);
    }
}
