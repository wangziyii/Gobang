package com.example.gobang.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 棋盘表
 * </p>
 *
 * @author wzy
 * @since 2021-12-14
 */
@ApiModel(value = "Checkerboard对象", description = "棋盘表")
public class Checkerboard implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("落子情况")
    private String playSituation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getPlaySituation() {
        return playSituation;
    }

    public void setPlaySituation(String playSituation) {
        this.playSituation = playSituation;
    }

    @Override
    public String toString() {
        return "Checkerboard{" +
            "id=" + id +
            ", playSituation=" + playSituation +
        "}";
    }
}
