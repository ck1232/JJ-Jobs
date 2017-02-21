package com.jj.jobs.dao;

import com.jj.jobs.model.TransactionDetail;
import com.jj.jobs.model.TransactionDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionDetailMapper {
    int countByExample(TransactionDetailExample example);

    int deleteByExample(TransactionDetailExample example);

    int deleteByPrimaryKey(String transactionid);

    int insert(TransactionDetail record);

    int insertSelective(TransactionDetail record);

    List<TransactionDetail> selectByExample(TransactionDetailExample example);

    TransactionDetail selectByPrimaryKey(String transactionid);

    int updateByExampleSelective(@Param("record") TransactionDetail record, @Param("example") TransactionDetailExample example);

    int updateByExample(@Param("record") TransactionDetail record, @Param("example") TransactionDetailExample example);

    int updateByPrimaryKeySelective(TransactionDetail record);

    int updateByPrimaryKey(TransactionDetail record);
}