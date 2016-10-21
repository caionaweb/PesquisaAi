package com.main;
import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

public class main {
	public static void main(String args[]){
		  GeoIPService service = new GeoIPService();
		  GeoIPServiceSoap geoIPServiceSoap = service.getGeoIPServiceSoap();
		  GeoIP geoIP = geoIPServiceSoap.getGeoIP("8.8.8.8");
		  System.out.println("Esse IP pertence ao país: " + geoIP.getCountryName());
		  
		  geoIP = geoIPServiceSoap.getGeoIP("72.52.4.121");
		  System.out.println("Esse IP pertence ao país: " + geoIP.getCountryName());
		  
		  geoIP = geoIPServiceSoap.getGeoIP("200.221.2.45");
		  System.out.println("Esse IP pertence ao país: " + geoIP.getCountryName());
		  
		  
		 }
}
