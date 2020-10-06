package com.personal.knowledge.system.project_optimization;

public class HD_fabu {
    public static void main(String[] args) {
        //系统维护性相关 SpringCloud
        //灰度发布：网官-zuul   服务间负载均衡-ribbon
        //限流算法

        //100%升级不停服务，目前只有谷歌能做到。
        //1.蓝绿发布：要求硬件是平时的2倍数，烧钱。
        //2.滚动发布：一台一台蓝绿发布，一段时间新老服务共存，可能存在问题。
        //3.金丝雀发布：先发布一台金丝雀，允许失败，允许适度浪费，内部竞争，AB测试。小公司使用

        //灰度发布实现：
        //网关 --网官灰度发布--  服务  --服务灰度发布--  服务
        //一.网官灰度实现：
        //1.制定灰度规则，区分那些用户，走那些服务?
        //2.元数据修改
        //3.后台配置+fitter

        //二.服务灰度发布
        //1.自定一rule规则（根据用户信息）
        //2.
        //3.


    }
}