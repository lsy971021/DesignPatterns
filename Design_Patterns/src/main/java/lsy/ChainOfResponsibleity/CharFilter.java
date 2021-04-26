package lsy.ChainOfResponsibleity;

/**
 * @author lsy
 */
public class CharFilter implements Filter{
    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        request.setCon(request.getCon().replace('你','我'));
        boolean b = filterChain.doFilter(request, response, filterChain);
        response.setCon(response.getCon().replace('他','她'));
        return true;
    }
}
