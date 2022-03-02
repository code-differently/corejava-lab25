# Return Ready Lab 25

* Part A - Java Programming 3.2 - Collections Part 1
* Part B - Foundations 8-2
* Part C - Homework


## Part A

### Example 01

In the package `lab25.partA.example01` look at examine the files :

* Cell
* CellCollection
* CellCollectionDriver

Write comments for all of the code.

Once you have commented all the  code, its time to add Unit Testing. You want to convert `CellCollectionDriver` into `CoinCollectionTest` and have solid Unit Test for all of the functionality.

### Example 02

In the package `lab25.partA.example02` look at examine the file :

* CellGenericCollection

Write comments for all of the code.

Once you have commented all the  code, its time to add Unit Testing. Add test for the class in the `CellGenericCollectionTest`.

### Example 03

In the package `lab25.partA.example03` look at examine the file :

* StudentRoster
* StudentRosterDriver

Write comments for all of the code.

Once you have commented all the  code, its time to add Unit Testing. You want to convert `StudentRosterDriver` into `StudentRosterTest` and have solid Unit Test for all of the functionality.

### Example 04

In the package `lab25.partA.example04` look at examine the file :

* Coin
* CoinCollection
* CoinTestDriver

Write comments for all of the code.

Once you have commented all the  code, its time to add Unit Testing. You want to convert `CoinTestDriver` into `CoinCollectionTest` and have solid Unit Test for all of the functionality.

## Part B

This is a coding challenge, complete Time Converter:

```
/**
 * Time Convert function.
 *
 * @param num input number
 * @return the number of hours and minutes
 */
public String timeConvert(int num) {
    return null;
}
```

Given an integer, convert it into how many hours and minutes it equates to.

Example 

```
Integer input = 63;

String expected = "1:3"
```

Given the Integer input 63, the expected String would be "1:3", because 63 is 1 hour and 3 mins.

## Part C
In the package `lab25.partC` look at examine the file :

* Stamp


Write comments for all of the code.

Complete the class `StampCollection` that has :

* A HashSet called stamps
* A method called `addStamp(Stamp stamp)` that will return true if the a stamp with that value is not already contained.
* Complete the `StampCollectionTest`

```
StampCollection collection = new StampCollection();
Stamp stamp01 = new Stamp("Texas");
Stamp stamp02 = new Stamp("Texas");
System.out.println("Stamp with value "+ stamp01.getName() + " is in container: " +collection.addStamp(stamp01));
System.out.println("Stamp with value "+ stamp02.getName() + " is in container: " +collection.addStamp(stamp02));
```



