package io.github.vampireachao.stream.plugin.mybatisplus;

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import io.github.vampireachao.stream.plugin.mybatisplus.mapper.UserInfoMapper;
import io.github.vampireachao.stream.plugin.mybatisplus.pojo.po.UserInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @author VampireAchao
 * @since 2022/7/26 11:11
 */
@MybatisPlusTest
class IMapperTest {

    @Resource
    private UserInfoMapper userInfoMapper;

    @Test
    void insertBatchTest() {
        UserInfo entity = new UserInfo();
        entity.setName("cat");
        entity.setAge(20);
        entity.setEmail("achao1441470436@gmail.com");
        UserInfo userInfo = new UserInfo();
        userInfo.setName("ruben");
        List<UserInfo> list = Arrays.asList(userInfo, entity);
        int i = userInfoMapper.insertBatch(list);
        Assertions.assertEquals(2, i);
        Assertions.assertEquals(7, QueryHelper.count(UserInfo.class));
    }

}
