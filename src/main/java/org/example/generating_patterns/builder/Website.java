package org.example.generating_patterns.builder;

public class Website {
    private  String name;
    private int price;
    private Cms cms;

    public  void setName(String name){ this.name = name;}

    public  void setPrice(int price){this.price = price;}

    public  void setCms(Cms cms){this.cms = cms;}

    @Override
    public String toString() {
        return "Name:" + name + ", Price:" + price + ", Cms:" + cms;
    }
}
