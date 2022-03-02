package com.codedifferently.labs.lab25.partA.example04;

import java.util.HashSet;

public class CoinCollection {
    HashSet<Coin> bagOfCoins;

    public CoinCollection(){
        bagOfCoins = new HashSet<>();
    }

    public void addCoinToCollection(Coin coin){
        bagOfCoins.add(coin);
    }

    public Boolean containsCoin(Coin coin){
        return  bagOfCoins.contains(coin);
    }

    public HashSet<Coin> getAllCoins(){
        return bagOfCoins;
    }

    public Boolean isEmpty(){
        return bagOfCoins.isEmpty();
    }
}
