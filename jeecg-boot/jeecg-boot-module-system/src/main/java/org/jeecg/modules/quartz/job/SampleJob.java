package org.jeecg.modules.quartz.job;

import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.util.DateUtils;

/**
 * 示例不带参定时任务
 *
 * @Author Scott
 */
@Slf4j
public class SampleJob {

    public void execute() {

        log.info(String.format(" Jeecg-Boot 普通定时任务 SampleJob !  时间:" + DateUtils.getTimestamp()));
    }
}
