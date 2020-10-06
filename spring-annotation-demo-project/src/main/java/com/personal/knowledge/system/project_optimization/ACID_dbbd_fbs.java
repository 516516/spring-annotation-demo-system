package com.personal.knowledge.system.project_optimization;

public class ACID_dbbd_fbs {
    public static void main(String[] args) {
        //目前的解决方案：
        // 1.GTS:阿里的

        //实例学习：
        //三方支付  ---  支付系统  ---  订单系统
        //分布式事务：
        //一、柔性事务：
        // 2PC、3PC 一般是框架实现，不用自己实现，重点是理解思想。
        // Transaction Manager    ||   Resource Manager
        //1.两阶端提交模型，2PC:
        //2.三阶段提交模型，3PC:


        //二、消息队列+时间表（不适用于数据量特别大的场景，中小公司使用）
        //1.消息重复消费问题：主键约束、消息事件id
        //2.


        //三、LCN  Lock(锁定事务单元)  Confirm(确定事务)  Notify(通知事务)
        //1.
        //2.
        //3.

        //四、TCC

        //五、Seata
        //1.AT
        //2.
        //3.
        //4.

    }
}