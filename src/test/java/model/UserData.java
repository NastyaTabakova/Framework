package model;

public class UserData {
    private String street;
    private String house;
    private String apartment;
    private String index;
    private String name;

    public UserData(String street, String house, String apartment, String index, String name){
        this.street=street;
        this.house=house;
        this.apartment=apartment;
        this.index = index;
        this.name = name;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String street){
        this.street=street;
    }

    public String getHouse(){
        return house;
    }

    public void setHouse(String house){
        this.house=house;
    }

    public String getApartment(){
        return apartment;
    }

    public void setApartment(String apartment){
        this.apartment=apartment;
    }

    public String getIndex(){
        return index;
    }

    public void setIndex(String index){
        this.index=index;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }
}
