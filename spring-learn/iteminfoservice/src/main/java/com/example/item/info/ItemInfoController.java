package com.example.item.info;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemInfoController {

	private static Logger logger = LoggerFactory.getLogger(ItemInfoController.class);

	@Autowired
	private Environment environment;

	@Autowired
	private ItemInfoService itemInfoService;

	@RequestMapping(value = "/")
	String home() {
		logger.info("Access value ");
		String propertyValue = environment.getProperty("item.provider");
		return "Hi! from Item Info! " + propertyValue;
	}

	@RequestMapping(value = "/iteminfo/{id}", method = RequestMethod.GET, produces = "application/json")
	ItemInfo getItemInfo(@PathVariable("id") int id) {
		logger.info("Using pure spring rest.");
		return this.itemInfoService.getItemInfo(id);
	}

}
