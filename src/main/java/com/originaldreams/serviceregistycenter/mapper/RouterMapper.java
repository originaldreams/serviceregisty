package com.originaldreams.serviceregistycenter.mapper;

import com.originaldreams.serviceregistycenter.entity.Router;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

@Mapper
public interface RouterMapper {
    String tableName = "Router";


     @Select("SELECT id, ServiceName, ControllerName, MethodName, RouterUrl, FirstMask, SecondMask FROM " + tableName + " WHERE id = #{id}")
     Router getById(Integer Id);

     @Select("SELECT id, ServiceName, ControllerName, MethodName, RouterUrl, FirstMask, SecondMask FROM " + tableName)
     List<Router> getAll();

     @Insert("INSERT INTO " + tableName + "(id, ServiceName, ControllerName, MethodName, RouterUrl, FirstMask, SecondMask) VALUES (#{id}, #{ServiceName}, #{ControllerName}, #{MethodName}, #{RouterUrl}, #{FirstMask}, #{SecondMask})")
     Integer insert(Router router);

     @Delete("DELETE FROM " + tableName + " WHERE id = #{id}")
     Integer deleteById(Integer id);
     @Update("UPDATE " + tableName + " SET ServiceName=#{ServiceName}, ControllerName=#{ControllerName}, MethodName=#{MethodName}, RouterUrl=#{RouterUrl}, FirstMask=#{FirstMask}, SecondMask=#{SecondMask} WHERE id = #{id}")
     Integer update(Router router);


}
