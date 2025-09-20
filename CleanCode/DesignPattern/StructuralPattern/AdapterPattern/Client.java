package StructuralPattern.AdapterPattern;

public class Client {
    public static void main(String[] args) {
        StockData stockData = new StockData();
        JSONData jsonData = new XMLtoJSONAdapter(stockData);
        AnalyticsLibrary analyticsLibrary = new AnalyticsLibrary();
        analyticsLibrary.analyzeJSON(jsonData);
    }
}
