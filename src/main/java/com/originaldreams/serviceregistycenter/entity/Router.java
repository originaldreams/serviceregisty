package com.originaldreams.serviceregistycenter.entity;

import java.util.Date;
import java.util.List;

public class Router {
     private Integer id;
     private String serviceName;
     private String controllerName;
     private String methodName;
     private String routerUrl;
     private Long firstMask;
     private Long secondMask;

    public Router(Integer id, String methodName, String routerUrl, Long firstMask, Long secondMask){
        this.id = id;
        this.methodName = methodName;
        this.routerUrl = routerUrl;
        this.firstMask = firstMask;
        this.secondMask = secondMask;
        /*
        这里可能产生数组越界抛异常，当抛异常时，说明methodName不合法，需要修改
         */
        String[] array = methodName.split("_");
        this.serviceName = array[0];
        this.controllerName = array[1];

    }

    public Integer getId(){
           return this.id;
     }
     public void setId(Integer id){
           this.id = id;
     }
     public String getServiceName(){
           return this.serviceName;
     }
     public void setServiceName(String serviceName){
           this.serviceName = serviceName;
     }
     public String getControllerName(){
           return this.controllerName;
     }
     public void setControllerName(String controllerName){
           this.controllerName = controllerName;
     }
     public String getMethodName(){
           return this.methodName;
     }
     public void setMethodName(String methodName){
           this.methodName = methodName;
     }
     public String getRouterUrl(){
           return this.routerUrl;
     }
     public void setRouterUrl(String routerUrl){
           this.routerUrl = routerUrl;
     }
     public Long getFirstMask(){
           return this.firstMask;
     }
     public void setFirstMask(Long firstMask){
           this.firstMask = firstMask;
     }
     public Long getSecondMask(){
           return this.secondMask;
     }
     public void setSecondMask(Long secondMask){
           this.secondMask = secondMask;
     }


@Override
    public String toString() {
        return "Router{" +
            "  id:" + id + "  serviceName:" + serviceName + "  controllerName:" + controllerName + "  methodName:" + methodName + "  routerUrl:" + routerUrl + "  firstMask:" + firstMask + "  secondMask:" + secondMask + 
        "}";
    }
  }
