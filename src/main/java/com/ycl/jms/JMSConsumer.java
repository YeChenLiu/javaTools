package com.ycl.jms;


import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 消息消费者
 */
public class JMSConsumer {
    //默认连接用户名
//    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;
    private static final String USERNAME = "admin";
    //默认连接密码
//    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;
    private static final String PASSWORD = "admin";
    //默认连接地址
//    private static final String BROKER_URL = ActiveMQConnection.DEFAULT_BROKER_URL;
    private static final String BROKER_URL = "tcp://192.168.28.103:61616";

    public static void main(String[] args) {
        //连接工厂
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(USERNAME, PASSWORD, BROKER_URL);
        try {
            //连接
            Connection connection = connectionFactory.createConnection();
            //启动连接
            connection.start();
            //创建session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            //消息目的地
            Destination destination = session.createQueue("hello");
            //消息消费者
            MessageConsumer consumer = session.createConsumer(destination);
            while (true) {
                TextMessage message = (TextMessage) consumer.receive();
                if (message != null) {
                    System.out.println("接收到消息： " + message.getText());
                } else {
                    break;
                }
            }
            session.close();
            connection.close();
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}