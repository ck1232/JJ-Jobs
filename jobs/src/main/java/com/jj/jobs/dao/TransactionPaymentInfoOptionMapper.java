package com.jj.jobs.dao;

import com.jj.jobs.model.TransactionPaymentInfoOption;
import com.jj.jobs.model.TransactionPaymentInfoOptionExample;
import com.jj.jobs.model.TransactionPaymentInfoOptionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionPaymentInfoOptionMapper {
    int countByExample(TransactionPaymentInfoOptionExample example);

    int deleteByExample(TransactionPaymentInfoOptionExample example);

    int deleteByPrimaryKey(TransactionPaymentInfoOptionKey key);

    int insert(TransactionPaymentInfoOption record);

    int insertSelective(TransactionPaymentInfoOption record);

    List<TransactionPaymentInfoOption> selectByExample(TransactionPaymentInfoOptionExample example);

    TransactionPaymentInfoOption selectByPrimaryKey(TransactionPaymentInfoOptionKey key);

    int updateByExampleSelective(@Param("record") TransactionPaymentInfoOption record, @Param("example") TransactionPaymentInfoOptionExample example);

    int updateByExample(@Param("record") TransactionPaymentInfoOption record, @Param("example") TransactionPaymentInfoOptionExample example);

    int updateByPrimaryKeySelective(TransactionPaymentInfoOption record);

    int updateByPrimaryKey(TransactionPaymentInfoOption record);
}