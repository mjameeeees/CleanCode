package StructuralPattern.AdapterPattern;

public class Client {
    public static void main(String[] args) {
        AnalyticsLibrary analyticsLibrary = new AnalyticsLibrary();
        StockData stackData =  new XMLtoJSONAdapter(analyticsLibrary);
        stackData.processXML("Go Languge");

    }
}
