package com.app.config;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.ws.ReservationSoap;

import lombok.AllArgsConstructor;

@Configuration
@AllArgsConstructor
public class CxfConfig {
    private  ReservationSoap reservationSoap;
    private  Bus bus;
    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, reservationSoap);
        endpoint.publish("/ws");
        return endpoint;
    }   
}
