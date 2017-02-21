package com.jj.jobs.dao;

import com.jj.jobs.model.TransactionCouponDetail;
import com.jj.jobs.model.TransactionCouponDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionCouponDetailMapper {
    int countByExample(TransactionCouponDetailExample example);

    int deleteByExample(TransactionCouponDetailExample example);

    int deleteByPrimaryKey(String transactionid);

    int insert(TransactionCouponDetail record);

    int insertSelective(TransactionCouponDetail record);

    List<TransactionCouponDetail> selectByExample(TransactionCouponDetailExample example);

    TransactionCouponDetail selectByPrimaryKey(String transactionid);

    int updateByExampleSelective(@Param("record") TransactionCouponDetail record, @Param("example") TransactionCouponDetailExample example);

    int updateByExample(@Param("record") TransactionCouponDetail record, @Param("example") TransactionCouponDetailExample example);

    int updateByPrimaryKeySelective(TransactionCouponDetail record);

    int updateByPrimaryKey(TransactionCouponDetail record);
}