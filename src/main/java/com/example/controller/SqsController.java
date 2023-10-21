//package com.example.awsdemo.controller;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import software.amazon.awssdk.regions.Region;
//import software.amazon.awssdk.services.sqs.SqsClient;
//import software.amazon.awssdk.services.sqs.model.CreateQueueRequest;
//import software.amazon.awssdk.services.sqs.model.GetQueueUrlRequest;
//import software.amazon.awssdk.services.sqs.model.GetQueueUrlResponse;
//
//@RestController
//public class SqsController {
//    private static final String QUEUE_PREFIX = "MyAWSPlanetSQS-";
//
//    private static final SqsClient SQS_CLIENT = SqsClient.builder().region(Region.US_EAST_1).build();
//    private static String queueUrl;
//
//    @GetMapping("/createQueue")
//    public void createQueue() {
//        String queueName = QUEUE_PREFIX + System.currentTimeMillis();
//        CreateQueueRequest createQueueRequest = CreateQueueRequest.builder()
//                .queueName(queueName)
//                .build();
//        SQS_CLIENT.createQueue(createQueueRequest);
//        GetQueueUrlResponse getQueueUrlResponse =
//                SQS_CLIENT.getQueueUrl(GetQueueUrlRequest.builder().queueName(queueName).build());
//        queueUrl = getQueueUrlResponse.queueUrl();
//    }
//}
