package com.codedifferently.labs.lab25.partA.example01;

public class CellCollection {

    private Cell[] cells;
    private int index;

    public CellCollection(int size){
        cells = new Cell[size];
        index = 0;
    }

    public void add(Cell c){
        cells[index] = c;
        index++;
    }

    public Cell get(int i){
        return cells[i];
    }
}
