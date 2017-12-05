package com.tydic.portal.sysmgr.intfce;

import com.tydic.portal.sysmgr.po.ModeInitConfigPO;

public interface ModeInitConfigDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(ModeInitConfigPO record);

    int insertSelective(ModeInitConfigPO record);

    ModeInitConfigPO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ModeInitConfigPO record);

    int updateByPrimaryKeyWithBLOBs(ModeInitConfigPO record);

    int updateByPrimaryKey(ModeInitConfigPO record);
}