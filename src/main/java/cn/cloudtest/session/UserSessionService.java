package cn.cloudtest.session;

import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class UserSessionService {

	@RequestMapping(value="/getclientId",method=RequestMethod.GET)
	public void getUser(HttpServletRequest request) {
		HttpSession session = request.getSession();
		//构建uuid
		UUID uuid = UUID.randomUUID();
		session.setAttribute("clientId", uuid);
		System.out.println("访问端口：" + request.getServerPort());
		System.out.println("当前clientId：" +uuid);
	}
}
