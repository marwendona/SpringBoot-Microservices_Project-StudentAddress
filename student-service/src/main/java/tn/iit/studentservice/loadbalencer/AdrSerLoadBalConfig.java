package tn.iit.studentservice.loadbalencer;

import feign.Feign;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ReactorLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@LoadBalancerClient(value = "address-service" , configuration = CustomLoadBalancerConfiguration.class)
public class AdrSerLoadBalConfig {
    @LoadBalanced
    @Bean
    public Feign.Builder feignBuilder () {
        return Feign.builder();
    }
}
