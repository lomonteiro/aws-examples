package br.com.lomonteiro.awsexamples.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import software.amazon.awssdk.services.sns.SnsClient;
import software.amazon.awssdk.services.sns.model.PublishRequest;
import software.amazon.awssdk.services.sns.model.PublishResponse;

@Service
public class SnsProducerService {

    private final String TOPIC_ARN = "";

    @Autowired
    private SnsClient snsClient;

    public void sendMessage(String message) {

        final PublishRequest request = PublishRequest.builder()
            .message(message)
            .topicArn(TOPIC_ARN)
            .build();
        
        PublishResponse response = snsClient.publish(request);
    }

}