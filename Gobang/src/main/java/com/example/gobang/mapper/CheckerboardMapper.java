package com.example.gobang.mapper;

import com.example.gobang.entity.Checkerboard;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 棋盘表 Mapper 接口
 * </p>
 *
 * @author wzy
 * @since 2021-12-14
 */
@Mapper
public interface CheckerboardMapper extends BaseMapper<Checkerboard> {

}
