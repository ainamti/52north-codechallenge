package com.north.codechallenge.ankitademo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Spatial {
	
	private String crs;
	private float[][] bbox;
	
}
