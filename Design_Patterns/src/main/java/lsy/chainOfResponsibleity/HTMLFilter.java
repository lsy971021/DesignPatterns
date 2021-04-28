package lsy.chainOfResponsibleity;

/**
 * @author lsy
 */
public class HTMLFilter implements Filter{
    @Override
    public boolean doFilter(Request request, Response response,FilterChain filterChain) {
        request.setCon(request.getCon().replace('<','['));
        boolean b = filterChain.doFilter(request, response, filterChain);
        response.setCon(response.getCon().replace('[','<'));
        return true;
    }
}
