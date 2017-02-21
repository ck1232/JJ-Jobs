package com.jj.jobs.dao;

import com.jj.jobs.model.TransactionPayerAddress;
import com.jj.jobs.model.TransactionPayerAddressExample;
import com.jj.jobs.model.TransactionPayerAddressKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionPayerAddressMapper {
    int countByExample(TransactionPayerAddressExample example);

    int deleteByExample(TransactionPayerAddressExample example);

    int deleteByPrimaryKey(TransactionPayerAddressKey key);

    int insert(TransactionPayerAddress record);

    int insertSelective(TransactionPayerAddress record);

    List<TransactionPayerAddress> selectByExample(TransactionPayerAddressExample example);

    TransactionPayerAddress selectByPrimaryKey(TransactionPayerAddressKey key);

    int updateByExampleSelective(@Param("record") TransactionPayerAddress record, @Param("example") TransactionPayerAddressExample example);

    int updateByExample(@Param("record") TransactionPayerAddress record, @Param("example") TransactionPayerAddressExample example);

    int updateByPrimaryKeySelective(TransactionPayerAddress record);

    int updateByPrimaryKey(TransactionPayerAddress record);
}