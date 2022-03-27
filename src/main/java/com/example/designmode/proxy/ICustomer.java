package com.example.designmode.proxy;

/**
 * <h3>design-mode</h3>
 * <p>定义消费者接口，查找指定区域，指定价格以下的房子</p>
 *
 * @author : ZhangYuJie
 * @date : 2022-03-27 14:38
 **/

public interface ICustomer {
    /**
     * 查找房子,指定区域，指定价格
     */
    String findHouse(String location, int price);
}

/**
 * 真正的找房消费者，所以只关注找到这个目标
 **/
class ZhangCustomer implements ICustomer {
    @Override
    public String findHouse(String location, int price) {
        System.out.println("找到了位于[" + location + "],价格" + price + "以下的房子");
        return "找到了位于[" + location + "],价格" + price + "以下的房子";
    }
}

/**
 * 找房子中介类，找到合适房子再反馈给指消费者
 **/
class AgencyProxy implements ICustomer {
    private ICustomer coustomer;

    public AgencyProxy(ICustomer coustomer) {
        this.coustomer = coustomer;
    }


    @Override
    public String findHouse(String location, int price) {
        String result = "没有符合条件的房子";
        before();
        if (null != coustomer) {
            result = coustomer.findHouse(location, price);
        }
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

/***场景类*/
class Client {
    public static void main(String[] args) {
        ICustomer customer = new ZhangCustomer();
        ICustomer proxy = new AgencyProxy(customer);
        String result = proxy.findHouse("钓鱼岛附近", 2000);
    }
}

