//package com.example.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
//import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
//import software.amazon.awssdk.regions.Region;
//import software.amazon.awssdk.services.sqs.SqsClient;
//import software.amazon.awssdk.services.sqs.model.CreateQueueRequest;
//
//@RestController
//public class SQSConfig {
//    @Value("${cloud.aws.credentials.access-key}")
//    private String accessKey;
//    @Value("${cloud.aws.credentials.secret-key}")
//    private String secretKey;
//    static AwsBasicCredentials awsCreds;
//
//    @GetMapping("/")
//    public void SQS() {
//        awsCreds = AwsBasicCredentials.create(accessKey, secretKey);
//        SqsClient sqsClient = SqsClient.builder()
//                .region(Region.US_EAST_1)
//                .credentialsProvider(StaticCredentialsProvider.create(awsCreds))
//                .build();
//        CreateQueueRequest createQueueRequest = CreateQueueRequest.builder()
//                .queueName("queueName")
//                .build();
//        sqsClient.createQueue(createQueueRequest);
//        System.out.println("\nCreate Queue");
//    }
//}
