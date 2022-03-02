package com.codedifferently.labs.lab25.partA.example01;

public class Cell {
    private String data;

    public Cell(){
    }

    public Cell(String data){
        this.data = data;
    }

    public void setValue(String celldata){
        data = celldata;
    }

    public String getValue(){
        return data;
    }

    public String toString(){
        return data;
    }
}
