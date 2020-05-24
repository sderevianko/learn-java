package application;

import clove.Clove;
import flower.Flower;
import rose.Rose;
import tulip.Tulip;
import violet.Violet;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Clove clove = new Clove("Romania", 10, 50);
	    Rose rose = new Rose("England", 15, 90);
	    Tulip tulip = new Tulip("Netherlands", 10, 70);
        Violet violet = new Violet("Italy", 20, 110);
        Flower flower = new Flower();

        List<Flower> bouquet = new ArrayList<>();
        bouquet.add(clove);
        bouquet.add(clove);
        bouquet.add(clove);
        bouquet.add(rose);
        bouquet.add(tulip);
        bouquet.add(violet);
        bouquet.add(rose);
        bouquet.add(rose);
        bouquet.add(tulip);
        bouquet.add(tulip);
        bouquet.add(tulip);

        System.out.print("Price of bouquet = ");
        flower.bouquetCalculated(bouquet);
        System.out.println(Flower.bouquetPrice);

        System.out.print("Number of cloves = ");
        System.out.println(Flower.numberOfClove);
        System.out.print("Number of roses = ");
        System.out.println(Flower.numberOfRose);
        System.out.print("Number of tulips = ");
        System.out.println(Flower.numberOfTulip);
        System.out.print("Number of violets = ");
        System.out.println(Flower.numberOfViolet);
    }
}
