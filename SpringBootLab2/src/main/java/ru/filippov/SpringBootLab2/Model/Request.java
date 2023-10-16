package ru.filippov.SpringBootLab2.Model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.Max;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Request {

        @NotBlank
        @Size(max = 32)
        private String uid;

        private String operationUid;

        private String systemName;

        @NotBlank
        private String systemTime;

        private String source;

        private Integer communicationId;
        private Integer templateId;
        @Max(7)
        private Integer productCode;
        @Max(5)
        private Integer smsCode;
}
