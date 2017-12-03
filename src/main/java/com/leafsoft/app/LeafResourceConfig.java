package com.leafsoft.app;

import org.glassfish.jersey.server.ResourceConfig;

public class LeafResourceConfig extends ResourceConfig {
	
	public LeafResourceConfig() {
		packages("com.leafsoft.rest");
	}
	
}
