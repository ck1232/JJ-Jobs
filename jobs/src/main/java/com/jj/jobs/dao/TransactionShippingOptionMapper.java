package com.jj.jobs.dao;

import com.jj.jobs.model.TransactionShippingOption;
import com.jj.jobs.model.TransactionShippingOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionShippingOptionMapper {
    int countByExample(TransactionShippingOptionExample example);

    int deleteByExample(TransactionShippingOptionExample example);

    int deleteByPrimaryKey(String transactionid);

    int insert(TransactionShippingOption record);

    int insertSelective(TransactionShippingOption record);

    List<TransactionShippingOption> selectByExample(TransactionShippingOptionExample example);

    TransactionShippingOption selectByPrimaryKey(String transactionid);

    int updateByExampleSelective(@Param("record") TransactionShippingOption record, @Param("example") TransactionShippingOptionExample example);

    int updateByExample(@Param("record") TransactionShippingOption record, @Param("example") TransactionShippingOptionExample example);

    int updateByPrimaryKeySelective(TransactionShippingOption record);

    int updateByPrimaryKey(TransactionShippingOption record);
}