package cn.name.demo.service;

import cn.name.demo.domain.CodeList;
import cn.name.demo.domain.CodeListExample;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nominal on 2018/1/10 0010.
 * 微博：@李明易DY
 */

public interface CodeListService {
    /**
     * 查询代码列表所有数据
     * @return
     */
    PageInfo<CodeList> findAll(PageInfo<CodeList> pageInfo);

    /**
     * 根据no编号查询
     * @param codeList
     * @return
     */
    CodeList findByNo(CodeList codeList);

    /**
     * 根据标题模糊搜索
     * @param codeList
     * @return
     */
    PageInfo<CodeList> search(CodeList codeList);
}
