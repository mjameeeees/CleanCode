package StructuralPattern.AdapterPattern;

class AnalyticsLibrary{
    public void analyzeJSON(JSONData jsonData){
        System.out.println("Analyzing JSON Data: " + jsonData.getJSON());
    }
}