package com.web.bs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.featureIntersection.FeatureManagementService;
import com.featureIntersection.ResponseBO;

@Component
public class FeatureManagementBS {
	
	@Autowired
	FeatureManagementService featureIntersectionService;

	public ResponseBO setEnabled(String featureName, Boolean enable) {
		boolean disAllow = featureIntersectionService.setEnabled(featureName, enable);
		ResponseBO bo = new ResponseBO();
		bo.setSuccess(!disAllow);
		return bo;
	}
}
