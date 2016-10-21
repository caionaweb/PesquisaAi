# PesquisaAi

O site Webservicex disponibiliza diversos webservices para a integração rápida com sites, por meio de SOAP. 

No webservice utilizado temos duas funcionalidades

  - Encontrar o país de origem de determinado IP
  - Encontrar o IP e país de determinado site
  

Localização da documentação do Web Services: http://www.webservicex.com/New/Home/ServiceDetail/64

Localização do WSDL:
http://www.webservicex.net/geoipservice.asmx?WSDL


Para utilizar o webservice, após ter gerado as classes, basta inicializar as mesmas
 ```
 GeoIPService service = new GeoIPService();
 GeoIPServiceSoap geoIPServiceSoap = service.getGeoIPServiceSoap();
```
Passar qual o ip a ser utilizado e obter o retorno:
```
geoIP = geoIPServiceSoap.getGeoIP("200.221.2.45");
System.out.println("Esse IP pertence ao país: " + geoIP.getCountryName());
```
 
