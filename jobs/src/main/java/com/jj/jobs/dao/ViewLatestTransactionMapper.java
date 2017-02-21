package com.jj.jobs.dao;

import com.jj.jobs.model.ViewLatestTransaction;
import com.jj.jobs.model.ViewLatestTransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewLatestTransactionMapper {
    int countByExample(ViewLatestTransactionExample example);

    int deleteByExample(ViewLatestTransactionExample example);

    int insert(ViewLatestTransaction record);

    int insertSelective(ViewLatestTransaction record);

    List<ViewLatestTransaction> selectByExample(ViewLatestTransactionExample example);

    int updateByExampleSelective(@Param("record") ViewLatestTransaction record, @Param("example") ViewLatestTransactionExample example);

    int updateByExample(@Param("record") ViewLatestTransaction record, @Param("example") ViewLatestTransactionExample example);
}