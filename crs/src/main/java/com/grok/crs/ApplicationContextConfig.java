package com.grok.crs;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"classpath:application.properties"})
public interface ApplicationContextConfig extends Config{

	
	@Key("geolocation.service")
	@DefaultValue("com.grok.crs.DefaultGeolocationService")
	String geolocationService();
}
