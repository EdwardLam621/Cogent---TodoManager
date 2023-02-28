/**
 * 
 */
package com.doconnect.entity;

import java.time.OffsetDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.doconnect.util.ChatRequest;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : Edward Lam
 * @date   : 2023-02-28
 */

@Entity
@Data
@NoArgsConstructor
public class Chat {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int  from_user;
	private int  to_user;
	private String message;
	private OffsetDateTime  datetime;
	
	public Chat(ChatRequest chatRequest) {
		this.from_user = chatRequest.getFrom_user();
		this.to_user = chatRequest.getTo_user();
		this.message = chatRequest.getMessage();
		this.datetime = OffsetDateTime.now();
	}
}
