package com.codedifferently.labs.lab25.partC;

public class Stamp {
    private String name;

    public Stamp(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
        return name;
    }

    public int hashCode(){
        return name.hashCode();
    }

    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Stamp stamp = (Stamp) obj;
        return name.equals(stamp.name);
    }
}
