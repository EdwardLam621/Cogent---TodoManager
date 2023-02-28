/**
 * 
 */
package com.doconnect.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doconnect.entity.Chat;

/**
 * @author : Edward Lam
 * @date   : 2023-02-28
 */


public interface ChatRepository extends JpaRepository<Chat,Integer>{
	
}
