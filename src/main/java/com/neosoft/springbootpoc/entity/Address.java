package com.neosoft.springbootpoc.entity;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Address {

	@Id
	private int aid;
	private String city;
	private String state;
	private String pincode;
}
