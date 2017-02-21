package com.jj.jobs.dao;

import com.jj.jobs.model.TransactionPayerInfo;
import com.jj.jobs.model.TransactionPayerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionPayerInfoMapper {
    int countByExample(TransactionPayerInfoExample example);

    int deleteByExample(TransactionPayerInfoExample example);

    int deleteByPrimaryKey(String transactionid);

    int insert(TransactionPayerInfo record);

    int insertSelective(TransactionPayerInfo record);

    List<TransactionPayerInfo> selectByExample(TransactionPayerInfoExample example);

    TransactionPayerInfo selectByPrimaryKey(String transactionid);

    int updateByExampleSelective(@Param("record") TransactionPayerInfo record, @Param("example") TransactionPayerInfoExample example);

    int updateByExample(@Param("record") TransactionPayerInfo record, @Param("example") TransactionPayerInfoExample example);

    int updateByPrimaryKeySelective(TransactionPayerInfo record);

    int updateByPrimaryKey(TransactionPayerInfo record);
}