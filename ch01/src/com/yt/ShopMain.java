package com.yt;

import com.yt.shangjia.TaoBao;

public class ShopMain {
    public static void main(String[] args){
        //创建代理的商家taobao对象
        TaoBao taobao = new TaoBao();
        float prince= taobao.sell(1);
        System.out.println("通过淘宝的商家，购买U盘单价："+prince);
    }
}
