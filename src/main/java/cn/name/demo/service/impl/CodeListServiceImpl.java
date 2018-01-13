package cn.name.demo.service.impl;

import cn.name.demo.domain.CodeList;
import cn.name.demo.domain.CodeListExample;
import cn.name.demo.mapper.CodeListMapper;
import cn.name.demo.service.CodeListService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nominal on 2018/1/10 0010.
 * 微博：@李明易DY
 */
@Service
public class CodeListServiceImpl implements CodeListService {
    @Autowired
    CodeListMapper codeListMapper;
    @Autowired
    CodeListExample codeListExample;
    /**
     * 查询代码列表所有数据
     *
     * @return
     */
    @Override
    public PageInfo<CodeList> findAll() {
        //分页、pageNum是当前页数，pageSize是当前页面数据条数
        PageHelper.startPage(2,10);
        List<CodeList> list= codeListMapper.selectByExample(codeListExample);
        PageInfo<CodeList> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    /**
     * 根据no编号查询
     *
     * @param codeList
     * @return
     */
    @Override
    public CodeList findByNo(CodeList codeList) {
        CodeListExample.Criteria cC=codeListExample.createCriteria();
        cC.andNoEqualTo(codeList.getNo());
        return (CodeList)codeListMapper.selectByExample(codeListExample);
    }

    /**
     * 根据标题模糊搜索
     *
     * @param codeList
     * @return
     */
    @Override
    public PageInfo<CodeList> search(CodeList codeList) {
        CodeListExample.Criteria cC=codeListExample.createCriteria();
        cC.andTitleLike(codeList.getTitle());
        //分页、pageNum是当前页数，pageSize是当前页面数据条数
        PageHelper.startPage(2,5);
        List<CodeList> list= codeListMapper.selectByExample(codeListExample);
        PageInfo<CodeList> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }
}
