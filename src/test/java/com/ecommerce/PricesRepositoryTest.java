package com.ecommerce;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.ecommerce.Prices;
import com.ecommerce.PricesRepository;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PricesRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private PricesRepository repository;

    @Test
    public void testFind1() {
    	
    	Calendar calStartDate=Calendar.getInstance();
    	Date startDate=calStartDate.getTime();
        
    	calStartDate=Calendar.getInstance();
		calStartDate.set(Calendar.YEAR, 2020);
		calStartDate.set(Calendar.MONTH, 06);
		calStartDate.set(Calendar.DAY_OF_MONTH, 14);
		calStartDate.set(Calendar.HOUR, 10);
		calStartDate.set(Calendar.MINUTE, 00);
		calStartDate.set(Calendar.SECOND, 00);
		startDate=calStartDate.getTime();
            	
    	entityManager.persist(new Prices(1L, startDate, startDate, 4L, 35455L, 1L, 38.95, "EUR"));
    	
    	Optional<Prices> prices= repository.findById(1L);
    	assertEquals(1, prices);
    }

    
    @Test
    public void testFind2() {
    	
    	Calendar calStartDate=Calendar.getInstance();
    	Date startDate=calStartDate.getTime();
        
    	calStartDate=Calendar.getInstance();
		calStartDate.set(Calendar.YEAR, 2020);
		calStartDate.set(Calendar.MONTH, 06);
		calStartDate.set(Calendar.DAY_OF_MONTH, 14);
		calStartDate.set(Calendar.HOUR, 16);
		calStartDate.set(Calendar.MINUTE, 00);
		calStartDate.set(Calendar.SECOND, 00);
		startDate=calStartDate.getTime();
            	
    	entityManager.persist(new Prices(1L, startDate, startDate, 4L, 35455L, 1L, 38.95, "EUR"));
    	
    	Optional<Prices> prices= repository.findById(1L);
    	assertEquals(1, prices);
    }

    @Test
    public void testFind3() {
    	
    	Calendar calStartDate=Calendar.getInstance();
    	Date startDate=calStartDate.getTime();
        
    	calStartDate=Calendar.getInstance();
		calStartDate.set(Calendar.YEAR, 2020);
		calStartDate.set(Calendar.MONTH, 06);
		calStartDate.set(Calendar.DAY_OF_MONTH, 14);
		calStartDate.set(Calendar.HOUR, 21);
		calStartDate.set(Calendar.MINUTE, 00);
		calStartDate.set(Calendar.SECOND, 00);
		startDate=calStartDate.getTime();
            	
    	entityManager.persist(new Prices(1L, startDate, startDate, 4L, 35455L, 1L, 38.95, "EUR"));
    	
    	Optional<Prices> prices= repository.findById(1L);
    	assertEquals(1, prices);
    }

    @Test
    public void testFind4() {
    	
    	Calendar calStartDate=Calendar.getInstance();
    	Date startDate=calStartDate.getTime();
        
    	calStartDate=Calendar.getInstance();
		calStartDate.set(Calendar.YEAR, 2020);
		calStartDate.set(Calendar.MONTH, 06);
		calStartDate.set(Calendar.DAY_OF_MONTH, 15);
		calStartDate.set(Calendar.HOUR, 10);
		calStartDate.set(Calendar.MINUTE, 00);
		calStartDate.set(Calendar.SECOND, 00);
		startDate=calStartDate.getTime();
            	
    	entityManager.persist(new Prices(1L, startDate, startDate, 4L, 35455L, 1L, 38.95, "EUR"));
    	
    	Optional<Prices> prices= repository.findById(1L);
    	assertEquals(1, prices);
    }

    @Test
    public void testFind5() {
    	
    	Calendar calStartDate=Calendar.getInstance();
    	Date startDate=calStartDate.getTime();
        
    	calStartDate=Calendar.getInstance();
		calStartDate.set(Calendar.YEAR, 2020);
		calStartDate.set(Calendar.MONTH, 06);
		calStartDate.set(Calendar.DAY_OF_MONTH, 16);
		calStartDate.set(Calendar.HOUR, 21);
		calStartDate.set(Calendar.MINUTE, 00);
		calStartDate.set(Calendar.SECOND, 00);
		startDate=calStartDate.getTime();
            	
    	entityManager.persist(new Prices(1L, startDate, startDate, 4L, 35455L, 1L, 38.95, "EUR"));
    	
    	Optional<Prices> prices= repository.findById(1L);
    	assertEquals(1, prices);
    }

    
}
