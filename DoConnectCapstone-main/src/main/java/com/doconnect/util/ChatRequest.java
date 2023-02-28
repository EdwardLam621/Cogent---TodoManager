/**
 * 
 */
package com.doconnect.util;

import lombok.Data;

/**
 * @author : Edward Lam
 * @date   : 2023-02-28
 */
@Data
public class ChatRequest {
	private int from_user;
	private int to_user;
	private String message;
		
}
