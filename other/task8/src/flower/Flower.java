package flower;

import clove.Clove;
import rose.Rose;
import tulip.Tulip;
import violet.Violet;

import java.util.List;
import java.util.Objects;

public class Flower {
    private String producerCountry;
    private int bestBefore;
    private double price;
    public static double bouquetPrice;
    public static int numberOfClove;
    public static int numberOfRose;
    public static int numberOfTulip;
    public static int numberOfViolet;

    public Flower () {
    }
    public Flower (String producerCountry, int bestBefore, double price) {
        this.producerCountry = producerCountry;
        this.bestBefore = bestBefore;
        this.price = price;
    }

    public String getProducerCountry() {
        return producerCountry;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public double getPrice() {
        return price;
    }
    
    public void bouquetCalculated (List<Flower> bouquet) {
        Clove clove = new Clove("Romania", 10, 50);
        Rose rose = new Rose("England", 15, 90);
        Tulip tulip = new Tulip("Netherlands", 10, 70);
        Violet violet = new Violet("Italy", 20, 110);
        for (Flower flower : bouquet) {
            if (flower.equals(clove)) {
                bouquetPrice = bouquetPrice + clove.getPrice();
                numberOfClove++;
            }
            if (flower.equals(rose)) {
                bouquetPrice = bouquetPrice + rose.getPrice();
                numberOfRose++;
            }
            if (flower.equals(tulip)) {
                bouquetPrice = bouquetPrice + tulip.getPrice();
                numberOfTulip++;
            }
            if (flower.equals(violet)) {
                bouquetPrice = bouquetPrice + violet.getPrice();
                numberOfViolet++;
            }
        }
    }

    @Override
    public String toString() {
        return "Flower{" +
            "producerCountry='" + producerCountry + '\'' +
            ", bestBefore=" + bestBefore +
            ", price=" + price +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flower flower = (Flower) o;
        return bestBefore == flower.bestBefore &&
            Double.compare(flower.price, price) == 0 &&
            Objects.equals(producerCountry, flower.producerCountry);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producerCountry, bestBefore, price);
    }
}
