package main.java;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpStatus;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;
import java.util.Scanner;

public class Facade
{

        private static final ObjectMapper objectMapper = new ObjectMapper();
        private static final String BaseUrl = "http://localhost:8080/api/calculate/";


        public Object summ(double num1, double num2) throws IOException {
            main.java.HttpUriRequest request = new main.java.HttpGet( BaseUrl + "add/" + num1 + "/" + num2);
            var httpResponse = HttpClientBuilder.create().build().execute((org.apache.http.client.methods.HttpUriRequest) request);
            var result = objectMapper.readValue(httpResponse.getEntity().getContent(), Double.class);
            return result;
        }

        public Object mult(double num1, double num2) throws IOException {
            main.java.HttpUriRequest request = new main.java.HttpGet( BaseUrl + "multiply/" + num1 + "/" + num2);
            var httpResponse = HttpClientBuilder.create().build().execute((org.apache.http.client.methods.HttpUriRequest) request);
            var result = objectMapper.readValue(httpResponse.getEntity().getContent(), Double.class);
            return result;
        }

        public Object minus(double num1, double num2) throws IOException {
            main.java.HttpUriRequest request = new main.java.HttpGet( BaseUrl + "minus/" + num1 + "/" + num2);
            var httpResponse = HttpClientBuilder.create().build().execute((org.apache.http.client.methods.HttpUriRequest) request);
            var result = objectMapper.readValue(httpResponse.getEntity().getContent(), Double.class);
            return result;
        }

        public Object divide(double num1, double num2) throws IOException {
            main.java.HttpUriRequest request = new main.java.HttpGet( BaseUrl + "divide/" + num1 + "/" + num2);
            var httpResponse = HttpClientBuilder.create().build().execute((org.apache.http.client.methods.HttpUriRequest) request);
            var result = objectMapper.readValue(httpResponse.getEntity().getContent(), Double.class);
            return result;
        }
    }
