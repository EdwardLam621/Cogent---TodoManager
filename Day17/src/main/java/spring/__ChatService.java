/**
 * 
 */
package spring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author : Edward Lam
 * @date   : 2023-02-01
 */
public class __ChatService {
	
	private final __HistoryService historyService;
	private final __ChatRoomService chatRoomService;
	
	/**
	 * @param historyService
	 * @param charToomService
	 */
	@Autowired
	public __ChatService(__HistoryService historyService, __ChatRoomService charToomService) {
		super();
		this.historyService = historyService;
		this.chatRoomService = charToomService;
	}



	public void chat() {
		chatRoomService.start();
		historyService.store();
	}
	
	
	
}
