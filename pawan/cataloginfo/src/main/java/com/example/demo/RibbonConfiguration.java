package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.WeightedResponseTimeRule;


public class RibbonConfiguration {

	@Autowired
	private IClientConfig config;
	
	
	public IPing ribbonPing(IClientConfig config){
		return new PingUrl();
	}
	
	public IRule ribbonRule(){
		return new WeightedResponseTimeRule();
	}
}
