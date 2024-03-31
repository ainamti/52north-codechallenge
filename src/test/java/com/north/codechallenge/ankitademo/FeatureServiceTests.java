package com.north.codechallenge.ankitademo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.north.codechallenge.ankitademo.model.CollectionData;
import com.north.codechallenge.ankitademo.model.Landing;
import com.north.codechallenge.ankitademo.service.FeatureService;

@SpringBootTest
public class FeatureServiceTests {
	
	    @Autowired
	    private FeatureService featureSevice;

	    @Test
	    public void whenSpringContextIsBootstrapped_thenNoExceptions() {
	    }

	    @Test
	    public void whenGetLanding_thenLandingObjectIsNonNull() {

	        Landing landing = featureSevice.getLanding();
	        System.out.println("********* " + landing.toString());
	    }
	    
	    @Test
	    public void whenGetCollections_thenLandingObjectIsNonNull() {

	        CollectionData collectionData = featureSevice.getCollections();
	        System.out.println("$$$$$$$$$$$ " + collectionData.toString());
	    }

}
