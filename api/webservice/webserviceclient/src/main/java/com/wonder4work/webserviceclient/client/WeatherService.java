
package com.wonder4work.webserviceclient.client;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WeatherService", targetNamespace = "http://service.wonder4work.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WeatherService {


    /**
     * 
     * @return
     *     returns java.util.List<com.wonder4work.webserviceclient.client.Weather>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listAllCityWeather", targetNamespace = "http://service.wonder4work.com", className = "com.wonder4work.webserviceclient.client.ListAllCityWeather")
    @ResponseWrapper(localName = "listAllCityWeatherResponse", targetNamespace = "http://service.wonder4work.com", className = "com.wonder4work.webserviceclient.client.ListAllCityWeatherResponse")
    public List<Weather> listAllCityWeather();

}