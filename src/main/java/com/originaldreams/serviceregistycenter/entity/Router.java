package com.originaldreams.serviceregistycenter.entity;

import java.util.Date;
import java.util.List;

public class Router {
     private Integer id;
     private String ServiceName;
     private String ControllerName;
     private String MethodName;
     private String RouterUrl;
     private Long FirstMask;
     private Long SecondMask;

    public Router(Integer id, String methodName, String routerUrl, Long firstMask, Long secondMask) {
        this.id = id;
        MethodName = methodName;
        RouterUrl = routerUrl;
        FirstMask = firstMask;
        SecondMask = secondMask;
        String[] array = methodName.split("_");
        this.ServiceName = array[0];
        this.ControllerName = array[1];
    }

    public Integer getId(){
           return this.id;
     }
     public void setId(Integer id){
           this.id = id;
     }
     public String getServiceName(){
           return this.ServiceName;
     }
     public void setServiceName(String ServiceName){
           this.ServiceName = ServiceName;
     }
     public String getControllerName(){
           return this.ControllerName;
     }
     public void setControllerName(String ControllerName){
           this.ControllerName = ControllerName;
     }
     public String getMethodName(){
           return this.MethodName;
     }
     public void setMethodName(String MethodName){
           this.MethodName = MethodName;
     }
     public String getRouterUrl(){
           return this.RouterUrl;
     }
     public void setRouterUrl(String RouterUrl){
           this.RouterUrl = RouterUrl;
     }
     public Long getFirstMask(){
           return this.FirstMask;
     }
     public void setFirstMask(Long FirstMask){
           this.FirstMask = FirstMask;
     }
     public Long getSecondMask(){
           return this.SecondMask;
     }
     public void setSecondMask(Long SecondMask){
           this.SecondMask = SecondMask;
     }


@Override
    public String toString() {
        return "Router{" +
            "  id:" + id + "  ServiceName:" + ServiceName + "  ControllerName:" + ControllerName + "  MethodName:" + MethodName + "  RouterUrl:" + RouterUrl + "  FirstMask:" + FirstMask + "  SecondMask:" + SecondMask + 
        "}";
    }
  }
