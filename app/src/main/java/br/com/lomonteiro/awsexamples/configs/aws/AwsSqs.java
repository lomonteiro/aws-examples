package br.com.lomonteiro.awsexamples.configs.aws;

import java.net.URI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sqs.SqsClient;


@Configuration
public class AwsSqs {

    private String endpoint = "";

    @Bean
    public SqsClient sqsClient() {
        final SqsClient sqsClient = SqsClient.builder()
            .endpointOverride(URI.create(endpoint))
            .region(Region.SA_EAST_1)
            .build();
        return sqsClient;
    }

}
