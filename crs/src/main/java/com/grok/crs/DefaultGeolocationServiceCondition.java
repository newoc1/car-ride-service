package com.grok.crs;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DefaultGeolocationServiceCondition implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		ApplicationContextConfig applicationContextConfig = ConfigFactory.create(ApplicationContextConfig.class);
		
		if(DefaultGeolocationService.class.getCanonicalName().equals(applicationContextConfig.geolocationService())){
			return true;
		}
		return false;
	}

}
