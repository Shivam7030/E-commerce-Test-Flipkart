package com.flipkart.utils;

import java.io.IOException;

public class Environment {
	
	public static String getUrl(String environment) throws IOException {
		if (environment.equalsIgnoreCase("dev")) {
			return PropUtils.getEnvironment("dev.url");
		}else if (environment.equalsIgnoreCase("qa")) {
			return PropUtils.getEnvironment("qa.url");
		}else if (environment.equalsIgnoreCase("prepord")) {
			return PropUtils.getEnvironment("prepord.url");
		}else{
			return "";
		}
	}
	
	public static String getBrowserName() throws IOException {
		return PropUtils.getEnvironment("browserName");
	}

}
