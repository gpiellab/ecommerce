package com.ecommerce.controller;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecommerce.Prices;
import com.ecommerce.service.PricesService;

@Controller
public class PricesController {
	
	@Autowired
	private PricesService pricesServices;
	
	@RequestMapping(value = "/returnDataAndResults", method = RequestMethod.GET)
	@ResponseBody
	public Optional<Prices> getDataAndResults(@RequestParam(name="fechaAplicacion") Date fechaAplicacion,
									@RequestParam(name="identificadorProducto") Long identificadorProducto,
									@RequestParam(name="identificadorCadena") Long identificadorCadena) throws Exception {
		
		return pricesServices.returnData(fechaAplicacion, identificadorProducto, identificadorCadena);
	}

}
