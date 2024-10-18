package org.example.studyweb.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resource {

    private String link ;
    private String title ;
    private String description ;
    private String category ;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")  // 指定解析和格式化模式
    private LocalDateTime time ;
    private Integer views ;

}
