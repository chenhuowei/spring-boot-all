package com.fireway.dubbo.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Random;

/**
 * @Author: chenhuowei
 * @Date: 2018/10/29 15:15
 * @Description:
 */
@RestController
@RequestMapping("kafka")
@EnableAutoConfiguration
public class KafkaProducerService {

    /**
     * 使用日志打印消息
     */
    private static Logger logger = LoggerFactory.getLogger(KafkaProducerService.class);

    /**
     * 注入kafkaTemplate
     */
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    @GetMapping("send")
    public String sendMessage(){
        Random random = new Random();
        Double d = random.nextInt() * random.nextDouble();
        this.send("test"," send data at:"+d);
        return  "success";
    }


    /**
     * 发送消息的方法
     *
     * @param key  推送数据的key
     * @param data 推送数据的data
     */
    private void send(String key, String data) {
        kafkaTemplate.send("test", key, data);
    }




    @KafkaListener(topics = "test")
    public void receive(ConsumerRecord<?, ?> consumer) {
        logger.info("{} - {}:{}", consumer.topic(), consumer.key(), consumer.value());
    }


}
