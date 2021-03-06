package org.springframework.task.scheduling.actuator;

import lombok.Data;

/***
 * @author 王强 Email : 
 * @version 创建时间：2018/8/6
 * MethodData
 */
@Data
public class MethodData{

    private String method;

    private String className;

    private String type;

    private String url;

    private String[] paramClass = {};
}
