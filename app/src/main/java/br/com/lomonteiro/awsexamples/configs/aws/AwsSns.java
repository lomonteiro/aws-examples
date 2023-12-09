package br.com.lomonteiro.awsexamples.configs.aws;

import java.net.URI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.sns.SnsClient;

@Configuration
public class AwsSns {

    private String endpoint = "";

    @Bean
    public SnsClient snsClient() {
        final SnsClient snsClient = SnsClient.builder()
            .endpointOverride(URI.create(endpoint))
            .region(Region.SA_EAST_1)
            .build();
        return snsClient;
    }

}
