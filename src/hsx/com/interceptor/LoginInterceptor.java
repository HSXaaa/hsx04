package hsx.com.interceptor;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;


public class LoginInterceptor implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor销毁");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("LoginInterceptor初始化");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("在Action执行之前");
		ActionContext actionContext=invocation.getInvocationContext();
		Map<String, Object> session=actionContext.getSession();
		Object currentUser=session.get("currentUser");
		String result=null;
		if(currentUser!=null){
			result=invocation.invoke();
		}else{
			HttpServletRequest request=(HttpServletRequest)invocation.getInvocationContext().get(ServletActionContext.HTTP_REQUEST);
			request.setAttribute("error", "请先登录！");
			result="error";
		}
		System.out.println("result:"+result);
		System.out.println("在Action执行之后");
		return result;
	}
}
