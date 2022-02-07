package com.example.gobang.service.impl;

import com.example.gobang.entity.Checkerboard;
import com.example.gobang.mapper.CheckerboardMapper;
import com.example.gobang.service.ICheckerboardService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 棋盘表 服务实现类
 * </p>
 *
 * @author wzy
 * @since 2021-12-14
 */
@Service
public class CheckerboardServiceImpl extends ServiceImpl<CheckerboardMapper, Checkerboard> implements ICheckerboardService {

}
