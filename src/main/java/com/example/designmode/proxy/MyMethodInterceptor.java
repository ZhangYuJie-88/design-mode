package com.example.designmode.proxy;

/**
 * <h3>design-mode</h3>
 * <p></p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-27 14:51
 **/

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 *  cglib动态代理
 *
 * @author ZhangYuJie
 **/
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        before();
        Object result = methodProxy.invokeSuper(o, objects);
        after();
        return result;
    }

    private void before() {
        System.out.println("开始找房子");
    }

    private void after() {
        System.out.println("结束找房子");
    }
}

/**
 * 真正的找房消费者，所以只关注找到这个目标
 **/
class Zhang2Customer implements ICustomer {
    @Override
    public String findHouse(String location, int price) {
        System.out.println("找到了位于[" + location + "],价格" + price + "以下的房子");
        return "找到了位于[" + location + "],价格" + price + "以下的房子";
    }
}

class Client2 {
    public static void main(String[] args) {
        //创建回调实例
        MyMethodInterceptor interceptor = new MyMethodInterceptor();
        //CGLIB创建实例
        Enhancer enhancer = new Enhancer();
        //设置需要代理的类
        enhancer.setSuperclass(Zhang2Customer.class);
        //设置回调类
        enhancer.setCallback(interceptor);
        //获取代理对象
        Zhang2Customer customer = (Zhang2Customer) enhancer.create();
        //执行方法
        customer.findHouse("钓鱼岛", 1000);
    }
}
