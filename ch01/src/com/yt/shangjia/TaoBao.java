package com.yt.shangjia;

import com.yt.factory.usbkingFactory;
import com.yt.service.UsbSell;

//taobao是一个商家，代理金士顿U盘的销售
public class TaoBao implements UsbSell {

    //申明 商家代理的厂家具体是谁
    private  usbkingFactory factory=new usbkingFactory();
    @Override
    //实现销售U盘功能
    public float sell(int amount) {

        //向厂家发送订单，告诉厂家，我买了U盘，厂家发货
        float prince = factory.sell(amount);
        prince =prince +25;
        return prince;
    }
}
