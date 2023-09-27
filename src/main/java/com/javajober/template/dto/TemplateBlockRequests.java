package com.javajober.template.dto;

import java.util.List;

import lombok.Getter;

@Getter
public class TemplateBlockRequests<T> {
	List<T> subData;

	private TemplateBlockRequests(){

	}

	public TemplateBlockRequests(List<T> subData) {
		this.subData = subData;
	}
}
