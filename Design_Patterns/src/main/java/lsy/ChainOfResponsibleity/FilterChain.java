package lsy.ChainOfResponsibleity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lsy
 * 存放所有filter
 */
public class FilterChain implements Filter{
    static final List<Filter> filterList;
    int index = 0;
    static {
        filterList = new ArrayList<>();
    }

    public FilterChain addFliter(Filter filter){
        filterList.add(filter);
        return this;
    }

    @Override
    public boolean doFilter(Request request, Response response, FilterChain filterChain) {
        if(index>=filterList.size()) return false;
        boolean b = filterList.get(index++).doFilter(request, response, filterChain);
        return true;
    }
}
