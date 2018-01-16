package cn.name.demo.controller;

import cn.name.demo.domain.CodeList;
import cn.name.demo.service.CodeListService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Nominal on 2018/1/10 0010.
 * 微博：@李明易DY
 */
@RestController
@RequestMapping("codeList")
public class CodeListController {
    @Autowired
    CodeListService codeListService;

    /**
     * 文章详情，根据no编号
     * @param codeList
     * @return
     */
    @GetMapping(value = "details")
    public CodeList details(CodeList codeList){
        CodeList codeLists=codeListService.findByNo(codeList);
        return codeLists;
    }

    /**
     * 所有文章列表，分页
     * @param pageInfo
     * @return
     */
    @GetMapping("list")
    public PageInfo<CodeList> list(PageInfo<CodeList> pageInfo){
        pageInfo.setPageSize(10);
        return codeListService.findAll(pageInfo);
    }

    /**
     * 模糊查询
     * 根据文章标题
     * @param codeList
     * @return
     */
    @GetMapping("query")
    public PageInfo<CodeList> query(CodeList codeList){
        return codeListService.search(codeList);
    }
}
