package net.df.boot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * SpringBoot redis配置
 */
@ConfigurationProperties(prefix = "df.boot.redis")
public class DfBootRedisProperties {
}
