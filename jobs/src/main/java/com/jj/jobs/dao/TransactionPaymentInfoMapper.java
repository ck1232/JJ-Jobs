package com.jj.jobs.dao;

import com.jj.jobs.model.TransactionPaymentInfo;
import com.jj.jobs.model.TransactionPaymentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionPaymentInfoMapper {
    int countByExample(TransactionPaymentInfoExample example);

    int deleteByExample(TransactionPaymentInfoExample example);

    int deleteByPrimaryKey(String transactionid);

    int insert(TransactionPaymentInfo record);

    int insertSelective(TransactionPaymentInfo record);

    List<TransactionPaymentInfo> selectByExample(TransactionPaymentInfoExample example);

    TransactionPaymentInfo selectByPrimaryKey(String transactionid);

    int updateByExampleSelective(@Param("record") TransactionPaymentInfo record, @Param("example") TransactionPaymentInfoExample example);

    int updateByExample(@Param("record") TransactionPaymentInfo record, @Param("example") TransactionPaymentInfoExample example);

    int updateByPrimaryKeySelective(TransactionPaymentInfo record);

    int updateByPrimaryKey(TransactionPaymentInfo record);
}