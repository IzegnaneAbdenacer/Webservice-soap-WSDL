
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ListCompte_QNAME = new QName("http://ws/", "ListCompte");
    private static final QName _ListCompteResponse_QNAME = new QName("http://ws/", "ListCompteResponse");
    private static final QName _ConverstionEuroToDh_QNAME = new QName("http://ws/", "converstionEuroToDh");
    private static final QName _ConverstionEuroToDhResponse_QNAME = new QName("http://ws/", "converstionEuroToDhResponse");
    private static final QName _GetCompte_QNAME = new QName("http://ws/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://ws/", "getCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListCompte }
     * 
     * @return
     *     the new instance of {@link ListCompte }
     */
    public ListCompte createListCompte() {
        return new ListCompte();
    }

    /**
     * Create an instance of {@link ListCompteResponse }
     * 
     * @return
     *     the new instance of {@link ListCompteResponse }
     */
    public ListCompteResponse createListCompteResponse() {
        return new ListCompteResponse();
    }

    /**
     * Create an instance of {@link ConverstionEuroToDh }
     * 
     * @return
     *     the new instance of {@link ConverstionEuroToDh }
     */
    public ConverstionEuroToDh createConverstionEuroToDh() {
        return new ConverstionEuroToDh();
    }

    /**
     * Create an instance of {@link ConverstionEuroToDhResponse }
     * 
     * @return
     *     the new instance of {@link ConverstionEuroToDhResponse }
     */
    public ConverstionEuroToDhResponse createConverstionEuroToDhResponse() {
        return new ConverstionEuroToDhResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ListCompte")
    public JAXBElement<ListCompte> createListCompte(ListCompte value) {
        return new JAXBElement<>(_ListCompte_QNAME, ListCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "ListCompteResponse")
    public JAXBElement<ListCompteResponse> createListCompteResponse(ListCompteResponse value) {
        return new JAXBElement<>(_ListCompteResponse_QNAME, ListCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverstionEuroToDh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConverstionEuroToDh }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "converstionEuroToDh")
    public JAXBElement<ConverstionEuroToDh> createConverstionEuroToDh(ConverstionEuroToDh value) {
        return new JAXBElement<>(_ConverstionEuroToDh_QNAME, ConverstionEuroToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverstionEuroToDhResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConverstionEuroToDhResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "converstionEuroToDhResponse")
    public JAXBElement<ConverstionEuroToDhResponse> createConverstionEuroToDhResponse(ConverstionEuroToDhResponse value) {
        return new JAXBElement<>(_ConverstionEuroToDhResponse_QNAME, ConverstionEuroToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

}
