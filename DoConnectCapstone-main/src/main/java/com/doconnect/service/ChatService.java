/**
 * 
 */
package com.doconnect.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doconnect.entity.Chat;
import com.doconnect.repo.ChatRepository;

/**
 * @author : Edward Lam
 * @date   : 2023-02-28
 */

@Service
public class ChatService {
	@Autowired
	ChatRepository chatRepository;

	public void saveMessage(Chat chat) {
		chatRepository.save(chat);
	}

	public void deleteUseId(int id) {
		chatRepository.deleteById(id);
	}

	public List<Chat> showAll() {
		return (List<Chat>) chatRepository.findAll();
	}

	public Optional<Chat> get(int id) {
		return chatRepository.findById(id);
	}

	public List<Chat> findChat(int id1, int id2) {
		List<Chat> temp = chatRepository.findAll();
		List<Chat> newTemp = temp.stream()
				.filter(s -> s.getFrom_user() == id1
						|| s.getFrom_user() == id2)
				.filter(s -> s.getTo_user() == id1
						|| s.getTo_user() == id2)
				.toList();

		return newTemp;

	}
}
