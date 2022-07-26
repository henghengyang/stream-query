package io.github.vampireachao.stream.plugin.mybatisplus.mapper;

import io.github.vampireachao.stream.plugin.mybatisplus.injector.IMapper;
import io.github.vampireachao.stream.plugin.mybatisplus.pojo.po.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserInfoMapper
 *
 * @author VampireAchao
 * @since 2022/5/21
 */
@Mapper
public interface UserInfoMapper extends IMapper<UserInfo> {
}
