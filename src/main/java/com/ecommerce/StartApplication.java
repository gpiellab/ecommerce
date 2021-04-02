package com.ecommerce;

import java.util.Calendar;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ecommerce.controller.PricesController;

@SpringBootApplication
public class StartApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(StartApplication.class);

    @Autowired
    private PricesRepository repository;

    @Autowired
    private PricesController pricesController;
    
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    	loadData();
    	returnData();
    	
   }
    
    
    
    public void loadData() {

    	log.info("Starting...");
        
        //StartDate
		Calendar calStartDate=Calendar.getInstance();
		calStartDate.set(Calendar.YEAR, 2020);
		calStartDate.set(Calendar.MONTH, 06);
		calStartDate.set(Calendar.DAY_OF_MONTH, 14);
		calStartDate.set(Calendar.HOUR, 00);
		calStartDate.set(Calendar.MINUTE, 00);
		calStartDate.set(Calendar.SECOND, 00);
		Date startDate=calStartDate.getTime();
        
		//EndDate
		Calendar calEndDate=Calendar.getInstance();
		calEndDate.set(Calendar.YEAR, 2020);
		calEndDate.set(Calendar.MONTH, 12);
		calEndDate.set(Calendar.DAY_OF_MONTH, 31);
		calEndDate.set(Calendar.HOUR, 23);
		calEndDate.set(Calendar.MINUTE, 59);
		calEndDate.set(Calendar.SECOND, 59);
		Date endDate=calEndDate.getTime();
        
        repository.save(new Prices(1L, startDate, endDate, 1L, 35455L, 0L, 35.50, "EUR"));
        System.out.println("Price #1 Added");
        
        calStartDate=Calendar.getInstance();
		calStartDate.set(Calendar.YEAR, 2020);
		calStartDate.set(Calendar.MONTH, 06);
		calStartDate.set(Calendar.DAY_OF_MONTH, 14);
		calStartDate.set(Calendar.HOUR, 15);
		calStartDate.set(Calendar.MINUTE, 00);
		calStartDate.set(Calendar.SECOND, 00);
		startDate=calStartDate.getTime();
        
		calEndDate=Calendar.getInstance();
		calEndDate.set(Calendar.YEAR, 2020);
		calEndDate.set(Calendar.MONTH, 06);
		calEndDate.set(Calendar.DAY_OF_MONTH, 14);
		calEndDate.set(Calendar.HOUR, 18);
		calEndDate.set(Calendar.MINUTE, 30);
		calEndDate.set(Calendar.SECOND, 00);
		endDate=calEndDate.getTime();
        
		repository.save(new Prices(1L, startDate, endDate, 2L, 35455L, 1L, 25.45, "EUR"));
		System.out.println("Price #2 Added");
		
		calStartDate=Calendar.getInstance();
		calStartDate.set(Calendar.YEAR, 2020);
		calStartDate.set(Calendar.MONTH, 06);
		calStartDate.set(Calendar.DAY_OF_MONTH, 15);
		calStartDate.set(Calendar.HOUR, 00);
		calStartDate.set(Calendar.MINUTE, 00);
		calStartDate.set(Calendar.SECOND, 00);
		startDate=calStartDate.getTime();
        
		calEndDate=Calendar.getInstance();
		calEndDate.set(Calendar.YEAR, 2020);
		calEndDate.set(Calendar.MONTH, 06);
		calEndDate.set(Calendar.DAY_OF_MONTH, 15);
		calEndDate.set(Calendar.HOUR, 11);
		calEndDate.set(Calendar.MINUTE, 00);
		calEndDate.set(Calendar.SECOND, 00);
		endDate=calEndDate.getTime();
       
		repository.save(new Prices(1L, startDate, endDate, 3L, 35455L, 1L, 30.50, "EUR"));
		System.out.println("Price #3 Added");
		
		calStartDate=Calendar.getInstance();
		calStartDate.set(Calendar.YEAR, 2020);
		calStartDate.set(Calendar.MONTH, 06);
		calStartDate.set(Calendar.DAY_OF_MONTH, 15);
		calStartDate.set(Calendar.HOUR, 16);
		calStartDate.set(Calendar.MINUTE, 00);
		calStartDate.set(Calendar.SECOND, 00);
		startDate=calStartDate.getTime();
        
		calEndDate=Calendar.getInstance();
		calEndDate.set(Calendar.YEAR, 2020);
		calEndDate.set(Calendar.MONTH, 12);
		calEndDate.set(Calendar.DAY_OF_MONTH, 31);
		calEndDate.set(Calendar.HOUR, 23);
		calEndDate.set(Calendar.MINUTE, 59);
		calEndDate.set(Calendar.SECOND, 59);
		endDate=calEndDate.getTime();
		
		repository.save(new Prices(1L, startDate, endDate, 4L, 35455L, 1L, 38.95, "EUR"));
		System.out.println("Price #4 Added");
		
    }
    
    public void returnData() throws Exception {
    	pricesController.getDataAndResults(new Date(), 1L, 1L); //recibe fecha y dos identifcadores
    }

}