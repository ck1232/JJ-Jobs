package com.jj.jobs.paypal.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jj.jobs.paypal.service.PayPalService;

@RestController
public class PayPalController {
	private PayPalService payPalService;
	private static final Logger logger = Logger.getLogger(PayPalController.class);
	private DateFormat df = new SimpleDateFormat("dd/MMM/YYYY HH:mm:ss z");
	@Autowired
	public PayPalController(PayPalService payPalService) {
		this.payPalService = payPalService;
	}
	@RequestMapping(value = "/updateTransaction", method = RequestMethod.GET)
	public ResponseEntity<String> listAllUsers() {
		logger.debug("[Start]/updateTransaction - "+ df.format(new Date()));
		try {
			payPalService.updateTransaction();
		} catch (Exception e) {
			e.printStackTrace();
			logger.error("[Error]/updateTransaction - "+ e.getMessage());
		}
		logger.debug("[End]/updateTransaction - "+ df.format(new Date()));
        return new ResponseEntity<String>("ok", HttpStatus.OK);
    }
}
