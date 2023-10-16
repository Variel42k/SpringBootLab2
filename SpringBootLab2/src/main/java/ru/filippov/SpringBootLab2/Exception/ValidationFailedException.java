package ru.filippov.SpringBootLab2.Exception;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

public class ValidationFailedException extends Exception{


    public ValidationFailedException(String message) {
        super(message);
    }
        @Component
    public class MyComponent {
        @SneakyThrows
        @PostConstruct
        public void init() {
            int uid = 123;
            if (uid == 123) {
                String errorMessage = "Error: Unsupported code";
                throw new UnsupportedCodeException(errorMessage);
            }
        }
    }
}
