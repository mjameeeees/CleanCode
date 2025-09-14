package StructuralPattern.AdapterPattern;

public class XMLtoJSONAdapter implements StockData {
    private AnalyticsLibrary analyticsLibrary;

    public XMLtoJSONAdapter(AnalyticsLibrary analyticsLibrary){
        this.analyticsLibrary = analyticsLibrary;
    }

    @Override
    public void processXML(String processData){
         String jsonData = "{ \"stockData\": \"" + processData + "\" }";
        System.out.println("Adapter converting XML to JSON...");
        analyticsLibrary.analyzeJSON(jsonData);
    }

}   
