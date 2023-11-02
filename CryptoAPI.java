package Cryptocurrency;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import json.JSONObject;

public class CryptoAPI {
	
	private static String apiurl = "https://api.bitkub.com/api/market/ticker";
	
	public static double BitcoinPrice() throws Exception {
		String url = apiurl;
	    URL obj = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	    con.setRequestMethod("GET");
	    con.setRequestProperty("User-Agent", "Mozilla/5.0");
	    int responseCode = con.getResponseCode();
	    //System.out.println("\nSending 'GET' request to URL : " + url);
	    //System.out.println("Response Code : " + responseCode);
	    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();
	    while ((inputLine = in.readLine()) != null) {
	    	response.append(inputLine);
	    }
	    in.close();
	    JSONObject myResponse = new JSONObject(response.toString());
	    JSONObject data = myResponse.getJSONObject("THB_BTC");
		return data.getDouble("last");
	}
	
	public static double EthereumPrice() throws Exception {
		String url = apiurl;
	    URL obj = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	    con.setRequestMethod("GET");
	    con.setRequestProperty("User-Agent", "Mozilla/5.0");
	    int responseCode = con.getResponseCode();
	    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();
	    while ((inputLine = in.readLine()) != null) {
	    	response.append(inputLine);
	    }
	    in.close();
	    JSONObject myResponse = new JSONObject(response.toString());
	    JSONObject data = myResponse.getJSONObject("THB_ETH");
		return data.getDouble("last");
	}
	
	public static double DogePrice() throws Exception {
		String url = apiurl;
	    URL obj = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	    con.setRequestMethod("GET");
	    con.setRequestProperty("User-Agent", "Mozilla/5.0");
	    int responseCode = con.getResponseCode();
	    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();
	    while ((inputLine = in.readLine()) != null) {
	    	response.append(inputLine);
	    }
	    in.close();
	    JSONObject myResponse = new JSONObject(response.toString());
	    JSONObject data = myResponse.getJSONObject("THB_DOGE");
		return data.getDouble("last");
	}
	public static double BitcoinPercent() throws Exception {
		String url = apiurl;
	    URL obj = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	    con.setRequestMethod("GET");
	    con.setRequestProperty("User-Agent", "Mozilla/5.0");
	    int responseCode = con.getResponseCode();
	    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();
	    while ((inputLine = in.readLine()) != null) {
	    	response.append(inputLine);
	    }
	    in.close();
	    JSONObject myResponse = new JSONObject(response.toString());
	    JSONObject data = myResponse.getJSONObject("THB_BTC");
		return data.getDouble("percentChange");
	}
	public static double EthereumPercent() throws Exception {
		String url = apiurl;
	    URL obj = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	    con.setRequestMethod("GET");
	    con.setRequestProperty("User-Agent", "Mozilla/5.0");
	    int responseCode = con.getResponseCode();
	    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();
	    while ((inputLine = in.readLine()) != null) {
	    	response.append(inputLine);
	    }
	    in.close();
	    JSONObject myResponse = new JSONObject(response.toString());
	    JSONObject data = myResponse.getJSONObject("THB_ETH");
		return data.getDouble("percentChange");
	}
	public static double DogePercent() throws Exception {
		String url = apiurl;
	    URL obj = new URL(url);
	    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	    con.setRequestMethod("GET");
	    con.setRequestProperty("User-Agent", "Mozilla/5.0");
	    int responseCode = con.getResponseCode();
	    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
	    String inputLine;
	    StringBuffer response = new StringBuffer();
	    while ((inputLine = in.readLine()) != null) {
	    	response.append(inputLine);
	    }
	    in.close();
	    JSONObject myResponse = new JSONObject(response.toString());
	    JSONObject data = myResponse.getJSONObject("THB_DOGE");
		return data.getDouble("percentChange");
	}
}

/*\/\/\/\/\/\/\/\/\/\/\/\/\/\ Fetch Test \/\/\/\/\/\/\/\/\/\/\/\/\/\*/
/*public static void main(String[] args) {
	     try {
	    	 CryptoAPI.fetch();
	        } catch (Exception e) {
	         System.out.println(e);
	       }
	     }
	
	public static void fetch() throws Exception {
		String url = "https://api.bitkub.com/api/market/ticker";
	     URL obj = new URL(url);
	     HttpURLConnection con = (HttpURLConnection) obj.openConnection();
	     con.setRequestMethod("GET");
	     con.setRequestProperty("User-Agent", "Mozilla/5.0");
	     int responseCode = con.getResponseCode();
	     System.out.println("\nSending 'GET' request to URL : " + url);
	     System.out.println("Response Code : " + responseCode);
	     BufferedReader in = new BufferedReader(
	             new InputStreamReader(con.getInputStream()));
	     String inputLine;
	     StringBuffer response = new StringBuffer();
	     while ((inputLine = in.readLine()) != null) {
	     	response.append(inputLine);
	     }
	     in.close();
	     JSONObject myResponse = new JSONObject(response.toString());
	     JSONObject bitcoin_price = myResponse.getJSONObject("THB_BTC");
	     System.out.println("result after Reading JSON Response");
	     System.out.println("Bitcoin change- "+bitcoin_price.getDouble("percentChange"));
	}
}*/