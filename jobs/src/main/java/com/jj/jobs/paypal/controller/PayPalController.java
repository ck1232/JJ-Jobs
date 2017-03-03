package com.jj.jobs.paypal.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.jj.jobs.model.JsonResponse;
import com.jj.jobs.paypal.service.PayPalService;

@RestController
@RequestMapping(value = "/paypal")
public class PayPalController {
	private PayPalService payPalService;
	private static final Logger logger = Logger.getLogger(PayPalController.class);
	private DateFormat df = new SimpleDateFormat("dd/MMM/YYYY HH:mm:ss z");
	private DateFormat simpleDf = new SimpleDateFormat("dd-MM-yyyy");
	@Autowired
	public PayPalController(PayPalService payPalService) {
		this.payPalService = payPalService;
	}
	@RequestMapping(value = "/updateTransaction", method = RequestMethod.GET)
	public ResponseEntity<String> updateTransaction() {
		logger.debug("[Start]/updateTransaction - "+ df.format(new Date()));
		try {
			payPalService.updateTransaction();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("[Error]/updateTransaction - "+ e.getMessage());
			return new ResponseEntity<String>("ok", HttpStatus.OK);
		}
		logger.debug("[End]/updateTransaction - "+ df.format(new Date()));
        return new ResponseEntity<String>("ok", HttpStatus.OK);
    }
	
	@RequestMapping(value = "/refreshTransaction", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JsonResponse> refreshTransaction(@RequestParam("date") String date) {
		logger.debug("[Start]/refreshTransaction - "+ df.format(new Date()));
		JsonResponse response = new JsonResponse();
		try {
			Date parseDate = simpleDf.parse(date);
			payPalService.refreshTransaction(parseDate);
			response.setMessage("ok");
		}catch(ParseException ex){
			ex.printStackTrace();
			logger.error("[Error]/refreshTransaction - "+ ex.getMessage());
			response.setMessage("error parsing date");
		}catch (Exception e) {
			e.printStackTrace();
			logger.error("[Error]/refreshTransaction - "+ e.getMessage());
			response.setMessage("error retrieving data");
		}
		logger.debug("[End]/refreshTransaction - "+ df.format(new Date()));
        return new ResponseEntity<JsonResponse>(response, HttpStatus.OK);
    }
}
