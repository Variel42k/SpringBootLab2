package ru.filippov.SpringBootLab2.Service;


import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.filippov.SpringBootLab2.Exception.ValidationFailedException;

@Service
public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailedException;
}
