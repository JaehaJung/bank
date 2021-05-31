package bank.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{
	HashMap<String, Controller> map = null; // 해쉬 맵 정의
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		map = new HashMap<String, Controller>(); // 해쉬 맵 객체 생성
		map.put("/join.do", new JoinController()); // join.do로 요청이 오면 Join.controller값을 전달 
		map.put("/login.do", new LoginController()); 
		map.put("/deposit.do", new DepositController());
		map.put("/withdrawal.do", new WithdrawalController());
		map.put("/query.do", new QueryController());
		map.put("/search.do", new SearchController());
		map.put("/transfer.do", new TransferController());
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String uri = req.getRequestURI();  // uri의 뒷부분 가져오기 
		String contextPath = req.getContextPath(); // bank ~~~~
		String path = uri.substring(contextPath.length()); // bank길이만큼 날리기
		
		Controller cont = map.get(path);
		cont.execute(req, resp);   
	}
}
