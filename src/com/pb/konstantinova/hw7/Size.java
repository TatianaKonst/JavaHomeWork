package com.pb.konstantinova.hw7;

public class Size {
    XXS("Детский размер ","32"),
    XS("Взрослый размер ","34"),
    S("Взрослый размер ","36"),
    M("Взрослый размер ","38"),
    L("Взрослый размер ","40");

    public String description;
    public String euroSize;

    Size(String description,String euroSize) {
        this.description = description;
        this.euroSize=euroSize;
    }

    public String getDescription(){
        return description;
    }

    public String getEuroSize(){
        return euroSize;
    }

    @Override
    public String toString() {
        return description + euroSize;
    }
}
