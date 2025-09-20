package StructuralPattern.AdapterPattern;

public class XMLtoJSONAdapter implements JSONData {
    private StockData stockData;

    public XMLtoJSONAdapter(StockData stockData){
        this.stockData = stockData;
    }

    @Override
    public String getJSON(){
        String xml = stockData.getStockDataInXML();
        String json = "{ \"stock\": { \"symbol\": \"APPL\", \"price\": 180 } }";
        System.out.println("Adapter converting XML to JSON..." + xml + " to " + json);
        return json;
    }

}   
