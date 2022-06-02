package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.File;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface FileMapper {
    @Select("SELECT * FROM FILES WHERE fileName = #{fileName}")
    File getFile(String fileName);

    @Insert("INSERT INTO FILES (fileName) VALUES(#{fileName})")
    @Options(useGeneratedKeys = true, keyProperty = "fileId")
    int insertFile(File file);

    @Delete("DELETE FROM FILES WHERE fileName = #{fileName}")
    void deleteFile(String fileName);

    @Select("SELECT fileName FROM FILES where userId = #{userId}") // selecting the files uploaded by this user
    List<String> getAllFileNames(Integer userId);
}