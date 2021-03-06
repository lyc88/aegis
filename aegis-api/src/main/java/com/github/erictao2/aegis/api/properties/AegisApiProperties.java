package com.github.erictao2.aegis.api.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author TJX
 * @Title: AegisApiProperties
 * @date 2018/7/2710:29
 */
@ConfigurationProperties(prefix = "aegis.api")
@Data
public class AegisApiProperties {

    private boolean useRedis = true;
    private ReplayAttacksProperties replayAttacks = new ReplayAttacksProperties();
    private ReqTimeoutProperties reqTimeout = new ReqTimeoutProperties();
    private ModifyParameterProperties modifyParameter = new ModifyParameterProperties();

}
