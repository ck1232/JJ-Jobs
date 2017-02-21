package com.jj.jobs.dao;

import com.jj.jobs.model.Transaction;
import com.jj.jobs.model.TransactionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionMapper {
    int countByExample(TransactionExample example);

    int deleteByExample(TransactionExample example);

    int deleteByPrimaryKey(String transactionid);

    int insert(Transaction record);

    int insertSelective(Transaction record);

    List<Transaction> selectByExample(TransactionExample example);

    Transaction selectByPrimaryKey(String transactionid);

    int updateByExampleSelective(@Param("record") Transaction record, @Param("example") TransactionExample example);

    int updateByExample(@Param("record") Transaction record, @Param("example") TransactionExample example);

    int updateByPrimaryKeySelective(Transaction record);

    int updateByPrimaryKey(Transaction record);
}