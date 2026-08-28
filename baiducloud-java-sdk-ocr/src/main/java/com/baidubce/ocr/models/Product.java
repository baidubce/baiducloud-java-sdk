package com.baidubce.ocr.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product {
    /**
     * 内容
     */
    private String word;

    /**
     * location
     */
    private ShoppingReceiptLocation location;

    /**
     * probability
     */
    private ShoppingReceiptProbability probability;

    public Product setWord(String word) {
        this.word = word;
        return this;
    }

    public String getWord() {
        return this.word;
    }

    public Product setLocation(ShoppingReceiptLocation location) {
        this.location = location;
        return this;
    }

    public ShoppingReceiptLocation getLocation() {
        return this.location;
    }

    public Product setProbability(ShoppingReceiptProbability probability) {
        this.probability = probability;
        return this;
    }

    public ShoppingReceiptProbability getProbability() {
        return this.probability;
    }

    @Override
    public String toString() {
        return "Product{" + "word=" + word + "\n" + "location=" + location + "\n" + "probability=" + probability + "\n" + "}";
    }

}