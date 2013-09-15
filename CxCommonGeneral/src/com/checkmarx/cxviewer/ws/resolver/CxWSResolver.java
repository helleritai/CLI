
package com.checkmarx.cxviewer.ws.resolver;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CxWSResolver", targetNamespace = "http://Checkmarx.com", wsdlLocation = "http://10.31.0.223/cxwebinterface/cxWSResolver.asmx?wsdl")
public class CxWSResolver
    extends Service
{

    private final static URL CXWSRESOLVER_WSDL_LOCATION;
    private final static WebServiceException CXWSRESOLVER_EXCEPTION;
    private final static QName CXWSRESOLVER_QNAME = new QName("http://Checkmarx.com", "CxWSResolver");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.31.0.223/cxwebinterface/cxWSResolver.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CXWSRESOLVER_WSDL_LOCATION = url;
        CXWSRESOLVER_EXCEPTION = e;
    }

    public CxWSResolver() {
        super(__getWsdlLocation(), CXWSRESOLVER_QNAME);
    }

    public CxWSResolver(WebServiceFeature... features) {
        super(__getWsdlLocation(), CXWSRESOLVER_QNAME, features);
    }

    public CxWSResolver(URL wsdlLocation) {
        super(wsdlLocation, CXWSRESOLVER_QNAME);
    }

    public CxWSResolver(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CXWSRESOLVER_QNAME, features);
    }

    public CxWSResolver(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CxWSResolver(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CxWSResolverSoap
     */
    @WebEndpoint(name = "CxWSResolverSoap")
    public CxWSResolverSoap getCxWSResolverSoap() {
        return super.getPort(new QName("http://Checkmarx.com", "CxWSResolverSoap"), CxWSResolverSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CxWSResolverSoap
     */
    @WebEndpoint(name = "CxWSResolverSoap")
    public CxWSResolverSoap getCxWSResolverSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://Checkmarx.com", "CxWSResolverSoap"), CxWSResolverSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CXWSRESOLVER_EXCEPTION!= null) {
            throw CXWSRESOLVER_EXCEPTION;
        }
        return CXWSRESOLVER_WSDL_LOCATION;
    }

}
