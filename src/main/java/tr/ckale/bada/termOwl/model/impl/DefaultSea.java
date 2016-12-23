package tr.ckale.bada.termOwl.model.impl;

import java.net.URI;
import java.util.Collection;
import javax.xml.datatype.XMLGregorianCalendar;

import org.protege.owl.codegeneration.WrappedIndividual;
import org.protege.owl.codegeneration.impl.WrappedIndividualImpl;

import org.protege.owl.codegeneration.inference.CodeGenerationInference;

import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLOntology;

import tr.ckale.bada.termOwl.model.*;


/**
 * Generated by Protege (http://protege.stanford.edu).<br>
 * Source Class: DefaultSea <br>
 * @version generated on Wed Dec 21 09:21:50 MSK 2016 by Alperen
 */
public class DefaultSea extends WrappedIndividualImpl implements Sea {

    public DefaultSea(CodeGenerationInference inference, IRI iri) {
        super(inference, iri);
    }





    /* ***************************************************
     * Object Property http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation#crosses
     */
     
    public Collection<? extends Place> getCrosses() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_CROSSES,
                                               DefaultPlace.class);
    }

    public boolean hasCrosses() {
	   return !getCrosses().isEmpty();
    }

    public void addCrosses(Place newCrosses) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_CROSSES,
                                       newCrosses);
    }

    public void removeCrosses(Place oldCrosses) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_CROSSES,
                                          oldCrosses);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation#hasLocationData
     */
     
    public Collection<? extends Datum> getHasLocationData() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_HASLOCATIONDATA,
                                               DefaultDatum.class);
    }

    public boolean hasHasLocationData() {
	   return !getHasLocationData().isEmpty();
    }

    public void addHasLocationData(Datum newHasLocationData) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_HASLOCATIONDATA,
                                       newHasLocationData);
    }

    public void removeHasLocationData(Datum oldHasLocationData) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_HASLOCATIONDATA,
                                          oldHasLocationData);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation#isPartOf
     */
     
    public Collection<? extends Place> getIsPartOf() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_ISPARTOF,
                                               DefaultPlace.class);
    }

    public boolean hasIsPartOf() {
	   return !getIsPartOf().isEmpty();
    }

    public void addIsPartOf(Place newIsPartOf) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_ISPARTOF,
                                       newIsPartOf);
    }

    public void removeIsPartOf(Place oldIsPartOf) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_ISPARTOF,
                                          oldIsPartOf);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation#overlaps
     */
     
    public Collection<? extends Place> getOverlaps() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_OVERLAPS,
                                               DefaultPlace.class);
    }

    public boolean hasOverlaps() {
	   return !getOverlaps().isEmpty();
    }

    public void addOverlaps(Place newOverlaps) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_OVERLAPS,
                                       newOverlaps);
    }

    public void removeOverlaps(Place oldOverlaps) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_OVERLAPS,
                                          oldOverlaps);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation#touches
     */
     
    public Collection<? extends Place> getTouches() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_TOUCHES,
                                               DefaultPlace.class);
    }

    public boolean hasTouches() {
	   return !getTouches().isEmpty();
    }

    public void addTouches(Place newTouches) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_TOUCHES,
                                       newTouches);
    }

    public void removeTouches(Place oldTouches) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_TOUCHES,
                                          oldTouches);
    }


    /* ***************************************************
     * Object Property http://www.semanticweb.org/alperen/ontologies/2016/11/geolocation#wikipediaArticle
     */
     
    public Collection<? extends WikipediaArticle> getWikipediaArticle() {
        return getDelegate().getPropertyValues(getOwlIndividual(),
                                               Vocabulary.OBJECT_PROPERTY_WIKIPEDIAARTICLE,
                                               DefaultWikipediaArticle.class);
    }

    public boolean hasWikipediaArticle() {
	   return !getWikipediaArticle().isEmpty();
    }

    public void addWikipediaArticle(WikipediaArticle newWikipediaArticle) {
        getDelegate().addPropertyValue(getOwlIndividual(),
                                       Vocabulary.OBJECT_PROPERTY_WIKIPEDIAARTICLE,
                                       newWikipediaArticle);
    }

    public void removeWikipediaArticle(WikipediaArticle oldWikipediaArticle) {
        getDelegate().removePropertyValue(getOwlIndividual(),
                                          Vocabulary.OBJECT_PROPERTY_WIKIPEDIAARTICLE,
                                          oldWikipediaArticle);
    }


}
