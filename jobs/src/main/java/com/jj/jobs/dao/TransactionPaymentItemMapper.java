package com.jj.jobs.dao;

import com.jj.jobs.model.TransactionPaymentItem;
import com.jj.jobs.model.TransactionPaymentItemExample;
import com.jj.jobs.model.TransactionPaymentItemKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionPaymentItemMapper {
    int countByExample(TransactionPaymentItemExample example);

    int deleteByExample(TransactionPaymentItemExample example);

    int deleteByPrimaryKey(TransactionPaymentItemKey key);

    int insert(TransactionPaymentItem record);

    int insertSelective(TransactionPaymentItem record);

    List<TransactionPaymentItem> selectByExample(TransactionPaymentItemExample example);

    TransactionPaymentItem selectByPrimaryKey(TransactionPaymentItemKey key);

    int updateByExampleSelective(@Param("record") TransactionPaymentItem record, @Param("example") TransactionPaymentItemExample example);

    int updateByExample(@Param("record") TransactionPaymentItem record, @Param("example") TransactionPaymentItemExample example);

    int updateByPrimaryKeySelective(TransactionPaymentItem record);

    int updateByPrimaryKey(TransactionPaymentItem record);
}