package model;

public class DeliveryPartner implements User{
    private long id;
    private String name;

    public DeliveryPartner(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId(){
        return id;
    }

    public String getName() {
        return name;
    }
}
