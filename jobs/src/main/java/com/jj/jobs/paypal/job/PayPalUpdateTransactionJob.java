package com.jj.jobs.paypal.job;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import com.jj.jobs.paypal.service.PayPalService;

public class PayPalUpdateTransactionJob extends QuartzJobBean{
	private PayPalService payPalService;
	private static final Logger logger = Logger.getLogger(PayPalUpdateTransactionJob.class);
	@Override
	protected void executeInternal(JobExecutionContext context)
			throws JobExecutionException {
		DateFormat df = new SimpleDateFormat("dd/MMM/YYYY HH:mm:ss z");
		logger.debug("[Start]PayPalUpdateTransactionJob - "+ df.format(new Date()));
		try {
			payPalService.updateTransaction();
		} catch (Exception e) {
			logger.error("[Error]PayPalUpdateTransactionJob - "+ e.getMessage());
		}
		logger.debug("[End]PayPalUpdateTransactionJob - "+ df.format(new Date()));
	}
	
	public void setPayPalService(PayPalService payPalService) {
		this.payPalService = payPalService;
	}
	

}
