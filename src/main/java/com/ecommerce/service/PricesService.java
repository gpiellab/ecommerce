package com.ecommerce.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ecommerce.Prices;
import com.ecommerce.PricesRepository;

@Service
public class PricesService {
	
	@Autowired
	private PricesRepository pricesRepository;
	
	public Optional<Prices> returnData(Date date, Long idProducto, Long idCadena) throws Exception {
		
		//Validacies lógicas:
		if(idCadena>20 || idCadena<00) {
			throw new Exception("El identificador de la cadena tiene que ser entre 0 y 20");
		} else if(idProducto>20 || idProducto<00) {
			throw new Exception("El identificador de producto tiene que ser entre 0 y 20");
		}
		
		Optional<Prices> result=pricesRepository.findById(idCadena);
		
		System.out.println("-->> RESULTADO: "+pricesRepository.findById(idProducto));
		
		//System.od+id+id2);
		return pricesRepository.findById(1L);
	}

}
