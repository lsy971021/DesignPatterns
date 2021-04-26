package lsy.ChainOfResponsibleity;

/**
 * @author lsy
 */
public interface Filter {
    boolean doFilter(Request request,Response response,FilterChain filterChain);
}
