package hsx.com.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("MyInterceptor销毁");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("MyInterceptor初始化");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("在Action执行之前");
		String result=invocation.invoke();
		System.out.println("result:"+result);
		System.out.println("在Action执行之后");
		return result;
	}





}
