package com.codedifferently.labs.lab25.partA.example01;

public class CellCollectionDriver {
    public static void main(String[] args) {
        CellCollection cells = new CellCollection(5);

        cells.add(new Cell());
        cells.add(new Cell());
        cells.add(new Cell("Third Cell"));

        System.out.println(cells.get(0));
        System.out.println(cells.get(1));
        System.out.println(cells.get(2));

        cells.get(0).setValue("First Cell");
        cells.get(1).setValue("Second Cell");

        System.out.println(cells.get(0));
        System.out.println(cells.get(1));

    }
}
