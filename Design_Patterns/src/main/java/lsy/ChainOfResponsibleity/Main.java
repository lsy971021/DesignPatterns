package lsy.ChainOfResponsibleity;

/**
 * @author lsy
 * 类似拦截器(Spring MVC)、AOP等
 */
public class Main {
    public static void main(String[] args) {
        Request request = new Request();
        Response response = new Response();
        request.setCon("<欢迎你");
        response.setCon("[他好吗");
        FilterChain chain = new FilterChain();
        chain.addFliter(new HTMLFilter()).addFliter(new CharFilter());
        chain.doFilter(request,response,chain);
        System.out.println(request.getCon()+"===="+response.getCon());
    }

}
