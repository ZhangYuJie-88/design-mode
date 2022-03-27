package com.example.designmode.proxy;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * <h3>design-mode</h3>
 * <p>JDK动态代理</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-27 14:45
 **/
public class MyInvocationHandler implements InvocationHandler {
    private Object object;

    public MyInvocationHandler(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result= method.invoke(object,args);
        after();
        return result;
    }
    private void before(){
        System.out.println("开始找房子");
    }
    private void after(){
        System.out.println("结束找房子");
    }

}

/**
 * 真正的找房消费者，所以只关注找到这个目标
 **/
class Zhang1Customer implements ICustomer {
    @Override
    public String findHouse(String location, int price) {
        System.out.println("找到了位于[" + location + "],价格" + price + "以下的房子");
        return "找到了位于[" + location + "],价格" + price + "以下的房子";
    }
}

class Client1 {
   public static void main(String[] args) {
       // 获取动态代理对象。
       ICustomer customer = (ICustomer) Proxy.newProxyInstance(Client.class.getClassLoader()
               , new Class[]{ICustomer.class}
               , new MyInvocationHandler(new ZhangCustomer()));
       customer.findHouse("钓鱼岛附近", 2000);
   }
}
