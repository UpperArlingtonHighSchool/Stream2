package com.company;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class WebscrapingSomeData {
    public String WebscrapingSomeData() throws IOException {
        Elements params = null; Elements fresh = null; Elements moderate = null; Elements highly = null; Elements ocean = null;
        try {
            Document doc =
                    Jsoup.connect("https://www.usgs.gov/special-topics/water-science-school/science/saline-water-and-salinity#:~:text=Fresh%20water%20%2D%20Less%20than%201%2C000,1%2C000%20ppm%20to%203%2C000%20ppm").get();
            params = doc.getElementsContainingOwnText("Here are our parameters for saline water");
            fresh = doc.getElementsContainingOwnText("Slightly saline water");
            moderate = doc.getElementsContainingOwnText("Moderately saline water");
            highly = doc.getElementsContainingOwnText("Highly saline water");
            ocean = doc.getElementsContainingOwnText("By the way");
        } catch (IOException e) { e.printStackTrace(); }
        return params + " " + fresh + " " + moderate + " " + highly + " " + ocean;
}
}
