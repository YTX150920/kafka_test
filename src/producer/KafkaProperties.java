package producer;

/**
 * Created by YTX on 2016/3/1.
 */
public interface KafkaProperties{
    final static String zkConnect = "172.16.3.47:2181";
    final static  String groupId = "group1";
    final static String topic = "testTopic";
    final static String kafkaServerURL = "172.16.3.47";
    final static int kafkaServerPort = 9092;
    final static int kafkaProducerBufferSize = 64*1024;
    final static int connectionTimeOut = 100000;
    final static int reconnectInterval = 10000;
    final static String clientId = "SimpleConsumerDemoClient";
}