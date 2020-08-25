package com.globallogic.bootcampgl.error;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseError {
	
	@JsonProperty("message")
	private String message;
	
	@JsonProperty("status_code")
	private String statusCode;
	
	@JsonProperty("uri")
	private String uri;

}
