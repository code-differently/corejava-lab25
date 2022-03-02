package com.codedifferently.labs.lab25.partA.example04;

public class CoinTestDriver {

    public static void main(String[] args) {
        CoinCollection coinCollection = new CoinCollection();

        Coin coin1 = new Coin(1);
        Coin coin2 = new Coin(2);
        Coin coin5 = new Coin(5);
        Coin coin10 = new Coin(10);
        Coin coin20 = new Coin(20);
        Coin coin50 = new Coin(50);
        Coin coin100 = new Coin(100);

        coinCollection.addCoinToCollection(coin1);
        coinCollection.addCoinToCollection(coin2);
        coinCollection.addCoinToCollection(coin5);
        coinCollection.addCoinToCollection(coin10);
        coinCollection.addCoinToCollection(coin20);
        coinCollection.addCoinToCollection(coin50);
        coinCollection.addCoinToCollection(coin100);

        if(coinCollection.containsCoin(coin5))
            System.out.println("Coin " + coin5.getDenomination() + " is in the bag");

    }

}
