package consumer;

/**
 * Created by YTX on 2016/3/1.
 */
public class KafkaConsumerDemo implements KafkaProperties
{
    public static void main(String[] args){
        //Consumer1
        Consumer consumerThread1 = new Consumer("Consumer1",KafkaProperties.topic);

        consumerThread1.start();
    }
}
