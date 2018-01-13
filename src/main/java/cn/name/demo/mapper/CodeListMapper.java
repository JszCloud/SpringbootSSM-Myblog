package cn.name.demo.mapper;

import cn.name.demo.domain.CodeList;
import cn.name.demo.domain.CodeListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeListMapper {
    long countByExample(CodeListExample example);

    int deleteByExample(CodeListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CodeList record);

    int insertSelective(CodeList record);

    List<CodeList> selectByExampleWithBLOBs(CodeListExample example);

    List<CodeList> selectByExample(CodeListExample example);

    CodeList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CodeList record, @Param("example") CodeListExample example);

    int updateByExampleWithBLOBs(@Param("record") CodeList record, @Param("example") CodeListExample example);

    int updateByExample(@Param("record") CodeList record, @Param("example") CodeListExample example);

    int updateByPrimaryKeySelective(CodeList record);

    int updateByPrimaryKeyWithBLOBs(CodeList record);

    int updateByPrimaryKey(CodeList record);
}