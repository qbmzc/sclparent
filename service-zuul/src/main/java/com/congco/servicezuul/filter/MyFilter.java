package com.congco.servicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**
 * @author congco
 * @date 19-5-13 下午2:44
 */
@Component
public class MyFilter extends ZuulFilter {
    /**
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     * error：发送错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 是否要过滤
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return false;
    }

    /**
     * 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        return null;
    }
}
